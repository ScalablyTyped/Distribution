package typings.reactNativeElements.anon

import typings.reactNative.mod.ModalProps
import typings.reactNativeElements.mod.RecursivePartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.BottomSheetProps>> */
@js.native
trait RecursivePartialPartialBo extends StObject {
  
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
  implicit class RecursivePartialPartialBoMutableBuilder[Self <: RecursivePartialPartialBo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsVisible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    @scala.inline
    def setModalProps(value: RecursivePartial[js.UndefOr[ModalProps]]): Self = StObject.set(x, "modalProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalPropsUndefined: Self = StObject.set(x, "modalProps", js.undefined)
  }
}
