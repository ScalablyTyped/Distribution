package typings.reactNativeElements.mod

import typings.reactNative.mod.ModalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BottomSheetProps extends js.Object {
  
  /**
    * To show or hide the Bottom Sheet Component
    * @default false
    */
  var isVisible: Boolean = js.native
  
  /**
    * props of react native modal https://reactnative.dev/docs/modal#props
    * @default {}
    */
  var modalProps: ModalProps = js.native
}
object BottomSheetProps {
  
  @scala.inline
  def apply(isVisible: Boolean, modalProps: ModalProps): BottomSheetProps = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], modalProps = modalProps.asInstanceOf[js.Any])
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
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalProps(value: ModalProps): Self = this.set("modalProps", value.asInstanceOf[js.Any])
  }
}
