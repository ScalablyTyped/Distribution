package typings.reactNativeElements.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BottomSheetProps extends js.Object {
  /**
    * button props
    * @default {}
    */
  var buttonProps: ButtonProps = js.native
  /**
    * index of the list item which closes Bottom Sheet Component
    *
    * @default null
    */
  var cancelButtonIndex: js.UndefOr[Double] = js.native
  /**
    * List that display the list of Bottomsheet
    *
    * @default []
    */
  var list: js.Array[ListItemProps] = js.native
}

object BottomSheetProps {
  @scala.inline
  def apply(buttonProps: ButtonProps, list: js.Array[ListItemProps]): BottomSheetProps = {
    val __obj = js.Dynamic.literal(buttonProps = buttonProps.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomSheetProps]
  }
  @scala.inline
  implicit class BottomSheetPropsOps[Self <: BottomSheetProps] (val x: Self) extends AnyVal {
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
    def setButtonProps(value: ButtonProps): Self = this.set("buttonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setListVarargs(value: ListItemProps*): Self = this.set("list", js.Array(value :_*))
    @scala.inline
    def setList(value: js.Array[ListItemProps]): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelButtonIndex(value: Double): Self = this.set("cancelButtonIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelButtonIndex: Self = this.set("cancelButtonIndex", js.undefined)
  }
  
}

