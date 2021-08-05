package typings.reactNativeElements.anon

import typings.reactNative.mod.ModalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.BottomSheetProps> */
trait PartialBottomSheetProps extends StObject {
  
  var isVisible: js.UndefOr[Boolean] = js.undefined
  
  var modalProps: js.UndefOr[ModalProps] = js.undefined
}
object PartialBottomSheetProps {
  
  inline def apply(): PartialBottomSheetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBottomSheetProps]
  }
  
  extension [Self <: PartialBottomSheetProps](x: Self) {
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    inline def setModalProps(value: ModalProps): Self = StObject.set(x, "modalProps", value.asInstanceOf[js.Any])
    
    inline def setModalPropsUndefined: Self = StObject.set(x, "modalProps", js.undefined)
  }
}
