package typings.reactDndMultiBackend.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviewGeneratorArg[T] extends js.Object {
  /**
    * The item being dragged (monitor.getItem())
    */
  var item: T = js.native
  /**
    * The type of the item (monitor.getItemType())
    */
  var itemType: String = js.native
  /**
    * An object representing the style to use for the item, it should be passed to
    * your component's style property and is used for positioning
    */
  var style: CSSProperties = js.native
}

object PreviewGeneratorArg {
  @scala.inline
  def apply[T](item: T, itemType: String, style: CSSProperties): PreviewGeneratorArg[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewGeneratorArg[T]]
  }
  @scala.inline
  implicit class PreviewGeneratorArgOps[Self <: PreviewGeneratorArg[_], T] (val x: Self with PreviewGeneratorArg[T]) extends AnyVal {
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
    def setItem(value: T): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemType(value: String): Self = this.set("itemType", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

