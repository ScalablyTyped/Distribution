package typings.reactMovable.anon

import typings.reactMovable.typesMod.IItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Index[Value] extends js.Object {
  var index: js.UndefOr[Double] = js.native
  var isDragged: Boolean = js.native
  var isOutOfBounds: Boolean = js.native
  var isSelected: Boolean = js.native
  var props: IItemProps = js.native
  var value: Value = js.native
}

object Index {
  @scala.inline
  def apply[Value](isDragged: Boolean, isOutOfBounds: Boolean, isSelected: Boolean, props: IItemProps, value: Value): Index[Value] = {
    val __obj = js.Dynamic.literal(isDragged = isDragged.asInstanceOf[js.Any], isOutOfBounds = isOutOfBounds.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[Value]]
  }
  @scala.inline
  implicit class IndexOps[Self <: Index[_], Value] (val x: Self with Index[Value]) extends AnyVal {
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
    def setIsDragged(value: Boolean): Self = this.set("isDragged", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOutOfBounds(value: Boolean): Self = this.set("isOutOfBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(value: IItemProps): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Value): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
  
}

