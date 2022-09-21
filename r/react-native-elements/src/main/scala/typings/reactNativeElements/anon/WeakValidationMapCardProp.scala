package typings.reactNativeElements.anon

import typings.react.mod.Validator
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<react-native-elements.react-native-elements/dist/card/Card.CardProps & std.Partial<react-native-elements.react-native-elements/dist/config.ThemeProps<react-native-elements.react-native-elements/dist/card/Card.CardProps>>> */
trait WeakValidationMapCardProp extends StObject {
  
  var containerStyle: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]] = js.undefined
  
  var replaceTheme: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* updates */ RecursivePartialFullThemeAirbnbRating, Unit]) | Null]
    ]
  ] = js.undefined
  
  var theme: js.UndefOr[Validator[js.UndefOr[Null | ThemeCardProps]]] = js.undefined
  
  var updateTheme: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* updates */ RecursivePartialFullThemeAirbnbRating, Unit]) | Null]
    ]
  ] = js.undefined
  
  var wrapperStyle: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]] = js.undefined
}
object WeakValidationMapCardProp {
  
  inline def apply(): WeakValidationMapCardProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapCardProp]
  }
  
  extension [Self <: WeakValidationMapCardProp](x: Self) {
    
    inline def setContainerStyle(value: Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setReplaceTheme(
      value: Validator[
          js.UndefOr[(js.Function1[/* updates */ RecursivePartialFullThemeAirbnbRating, Unit]) | Null]
        ]
    ): Self = StObject.set(x, "replaceTheme", value.asInstanceOf[js.Any])
    
    inline def setReplaceThemeUndefined: Self = StObject.set(x, "replaceTheme", js.undefined)
    
    inline def setTheme(value: Validator[js.UndefOr[Null | ThemeCardProps]]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setUpdateTheme(
      value: Validator[
          js.UndefOr[(js.Function1[/* updates */ RecursivePartialFullThemeAirbnbRating, Unit]) | Null]
        ]
    ): Self = StObject.set(x, "updateTheme", value.asInstanceOf[js.Any])
    
    inline def setUpdateThemeUndefined: Self = StObject.set(x, "updateTheme", js.undefined)
    
    inline def setWrapperStyle(value: Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
