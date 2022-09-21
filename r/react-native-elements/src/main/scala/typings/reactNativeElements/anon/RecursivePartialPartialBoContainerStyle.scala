package typings.reactNativeElements.anon

import typings.reactNative.mod.ModalProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.themeMod.RecursivePartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements/dist/config/theme.RecursivePartial<std.Partial<react-native-elements.react-native-elements/dist/bottomSheet/BottomSheet.BottomSheetProps>> */
trait RecursivePartialPartialBoContainerStyle extends StObject {
  
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  
  var isVisible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var modalProps: js.UndefOr[RecursivePartial[js.UndefOr[ModalProps]]] = js.undefined
}
object RecursivePartialPartialBoContainerStyle {
  
  inline def apply(): RecursivePartialPartialBoContainerStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialBoContainerStyle]
  }
  
  extension [Self <: RecursivePartialPartialBoContainerStyle](x: Self) {
    
    inline def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setIsVisible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    inline def setModalProps(value: RecursivePartial[js.UndefOr[ModalProps]]): Self = StObject.set(x, "modalProps", value.asInstanceOf[js.Any])
    
    inline def setModalPropsUndefined: Self = StObject.set(x, "modalProps", js.undefined)
  }
}
