package typings.reactNativeElements.anon

import typings.reactNative.mod.ModalProps
import typings.reactNativeElements.mod.RecursivePartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.BottomSheetProps>> */
trait RecursivePartialPartialBo extends StObject {
  
  var isVisible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var modalProps: js.UndefOr[RecursivePartial[js.UndefOr[ModalProps]]] = js.undefined
}
object RecursivePartialPartialBo {
  
  inline def apply(): RecursivePartialPartialBo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialBo]
  }
  
  extension [Self <: RecursivePartialPartialBo](x: Self) {
    
    inline def setIsVisible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    inline def setModalProps(value: RecursivePartial[js.UndefOr[ModalProps]]): Self = StObject.set(x, "modalProps", value.asInstanceOf[js.Any])
    
    inline def setModalPropsUndefined: Self = StObject.set(x, "modalProps", js.undefined)
  }
}
