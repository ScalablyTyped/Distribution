package typings.reactNativeElements.anon

import typings.react.mod.Validator
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<std.Pick<react-native-elements.react-native-elements/dist/card/Card.CardProps & std.Partial<react-native-elements.react-native-elements/dist/config.ThemeProps<react-native-elements.react-native-elements/dist/card/Card.CardProps>>, 'containerStyle' | 'wrapperStyle'>> */
trait WeakValidationMapPickCard extends StObject {
  
  var containerStyle: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]] = js.undefined
  
  var wrapperStyle: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]] = js.undefined
}
object WeakValidationMapPickCard {
  
  inline def apply(): WeakValidationMapPickCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapPickCard]
  }
  
  extension [Self <: WeakValidationMapPickCard](x: Self) {
    
    inline def setContainerStyle(value: Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setWrapperStyle(value: Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
