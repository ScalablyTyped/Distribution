package typings.reactNativeElements.anon

import typings.reactNative.mod.ModalProps
import typings.reactNativeElements.mod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.BottomSheetProps>> */
@js.native
trait RecursivePartialPartialBo extends js.Object {
  
  var isVisible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var modalProps: js.UndefOr[RecursivePartial[js.UndefOr[ModalProps]]] = js.native
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
    def setIsVisible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
    
    @scala.inline
    def setModalProps(value: RecursivePartial[js.UndefOr[ModalProps]]): Self = this.set("modalProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalProps: Self = this.set("modalProps", js.undefined)
  }
}
