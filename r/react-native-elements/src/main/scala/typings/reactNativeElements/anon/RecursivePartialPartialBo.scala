package typings.reactNativeElements.anon

import typings.reactNativeElements.mod.ButtonProps
import typings.reactNativeElements.mod.ListItemProps
import typings.reactNativeElements.mod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.BottomSheetProps>> */
@js.native
trait RecursivePartialPartialBo extends js.Object {
  var buttonProps: js.UndefOr[RecursivePartial[js.UndefOr[ButtonProps]]] = js.native
  var cancelButtonIndex: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var list: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[ListItemProps]]]] = js.native
}

object RecursivePartialPartialBo {
  @scala.inline
  def apply(): RecursivePartialPartialBo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialBo]
  }
  @scala.inline
  implicit class RecursivePartialPartialBoOps[Self <: RecursivePartialPartialBo] (val x: Self) extends AnyVal {
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
    def setButtonProps(value: RecursivePartial[js.UndefOr[ButtonProps]]): Self = this.set("buttonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonProps: Self = this.set("buttonProps", js.undefined)
    @scala.inline
    def setCancelButtonIndex(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("cancelButtonIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelButtonIndex: Self = this.set("cancelButtonIndex", js.undefined)
    @scala.inline
    def setList(value: RecursivePartial[js.UndefOr[js.Array[ListItemProps]]]): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
  }
  
}

