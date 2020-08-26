package typings.storybookAddonA11y.anon

import typings.std.HTMLElement
import typings.storybookAddonA11y.highlightToggleMod.HighlightedElementData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var data: HighlightedElementData = js.native
  var element: HTMLElement = js.native
}

object Data {
  @scala.inline
  def apply(data: HighlightedElementData, element: HTMLElement): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    def setData(value: HighlightedElementData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
  }
  
}

