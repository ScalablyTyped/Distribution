package typings.reactNativeElements

import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNativeElements.distConfigThemeProviderMod.ThemeProps
import typings.reactNativeElements.reactNativeElementsStrings.replaceTheme
import typings.reactNativeElements.reactNativeElementsStrings.theme
import typings.reactNativeElements.reactNativeElementsStrings.updateTheme
import typings.std.Omit
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigWithThemeMod {
  
  @JSImport("react-native-elements/dist/config/withTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P, T](WrappedComponent: ComponentType[P & Partial[ThemeProps[T]]], themeKey: String): (FunctionComponent[
    Omit[
      P, 
      /* keyof react-native-elements.react-native-elements/dist/config/ThemeProvider.ThemeProps<T> */ theme | updateTheme | replaceTheme
    ]
  ]) | ForwardRefExoticComponent[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any], themeKey.asInstanceOf[js.Any])).asInstanceOf[(FunctionComponent[
    Omit[
      P, 
      /* keyof react-native-elements.react-native-elements/dist/config/ThemeProvider.ThemeProps<T> */ theme | updateTheme | replaceTheme
    ]
  ]) | ForwardRefExoticComponent[P]]
  
  trait ThemedComponent extends StObject {
    
    var displayName: String
  }
  object ThemedComponent {
    
    inline def apply(displayName: String): ThemedComponent = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemedComponent]
    }
    
    extension [Self <: ThemedComponent](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    }
  }
}
