package typings.reactNativeElements.anon

import typings.reactNative.mod.ModalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.BottomSheetProps> */
@js.native
trait PartialBottomSheetProps extends js.Object {
  
  var isVisible: js.UndefOr[Boolean] = js.native
  
  var modalProps: js.UndefOr[ModalProps] = js.native
}
object PartialBottomSheetProps {
  
  @scala.inline
  def apply(): PartialBottomSheetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBottomSheetProps]
  }
  
  @scala.inline
  implicit class PartialBottomSheetPropsOps[Self <: PartialBottomSheetProps] (val x: Self) extends AnyVal {
    
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
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
    
    @scala.inline
    def setModalProps(value: ModalProps): Self = this.set("modalProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalProps: Self = this.set("modalProps", js.undefined)
  }
}
