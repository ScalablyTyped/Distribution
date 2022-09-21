package typings.reactNativeElements.anon

import typings.reactNative.mod.ModalProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-native-elements.react-native-elements/dist/bottomSheet/BottomSheet.BottomSheetProps & std.Partial<react-native-elements.react-native-elements/dist/config.ThemeProps<react-native-elements.react-native-elements/dist/bottomSheet/BottomSheet.BottomSheetProps>>, 'containerStyle' | 'isVisible' | 'modalProps'> */
trait PickBottomSheetPropsParti extends StObject {
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var isVisible: js.UndefOr[Boolean] = js.undefined
  
  var modalProps: js.UndefOr[ModalProps] = js.undefined
}
object PickBottomSheetPropsParti {
  
  inline def apply(): PickBottomSheetPropsParti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickBottomSheetPropsParti]
  }
  
  extension [Self <: PickBottomSheetPropsParti](x: Self) {
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    inline def setModalProps(value: ModalProps): Self = StObject.set(x, "modalProps", value.asInstanceOf[js.Any])
    
    inline def setModalPropsUndefined: Self = StObject.set(x, "modalProps", js.undefined)
  }
}
