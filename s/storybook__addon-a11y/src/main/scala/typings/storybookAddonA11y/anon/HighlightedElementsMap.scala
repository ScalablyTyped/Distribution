package typings.storybookAddonA11y.anon

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightedElementsMap extends js.Object {
  var highlightedElementsMap: Map[_, _] = js.native
}

object HighlightedElementsMap {
  @scala.inline
  def apply(highlightedElementsMap: Map[_, _]): HighlightedElementsMap = {
    val __obj = js.Dynamic.literal(highlightedElementsMap = highlightedElementsMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightedElementsMap]
  }
  @scala.inline
  implicit class HighlightedElementsMapOps[Self <: HighlightedElementsMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHighlightedElementsMap(value: Map[_, _]): Self = this.set("highlightedElementsMap", value.asInstanceOf[js.Any])
  }
  
}

