package typings.storybookTheming

import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.storybookTheming.`distTs3Dot9Modules@emotionReactTypesHelperMod`.DistributiveOmit
import typings.storybookTheming.`distTs3Dot9Modules@emotionReactTypesHelperMod`.PropsOf
import typings.storybookTheming.`distTs3Dot9Modules@emotionReactTypesIndexMod`.Theme
import typings.storybookTheming.storybookThemingStrings.theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distTs3Dot9Modules@emotionReactTypesThemingMod` {
  
  @JSImport("@storybook/theming/dist/ts3.9/_modules/@emotion-react-types-theming", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/theming/dist/ts3.9/_modules/@emotion-react-types-theming", "ThemeProvider")
  @js.native
  val ThemeProvider: typings.storybookTheming.`distTs3Dot9Modules@emotionReactTypesThemingMod`.ThemeProvider = js.native
  type ThemeProvider = js.Function1[/* props */ ThemeProviderProps, ReactElement]
  
  inline def useTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[Theme]
  
  @JSImport("@storybook/theming/dist/ts3.9/_modules/@emotion-react-types-theming", "withTheme")
  @js.native
  val withTheme: typings.storybookTheming.`distTs3Dot9Modules@emotionReactTypesThemingMod`.withTheme = js.native
  type withTheme = js.Function1[
    /* component */ Any, 
    FC[(DistributiveOmit[PropsOf[Any], theme]) & typings.storybookTheming.anon.Theme]
  ]
  
  trait ThemeProviderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var theme: js.Object | (js.Function1[/* outerTheme */ Theme, Theme])
  }
  object ThemeProviderProps {
    
    inline def apply(theme: js.Object | (js.Function1[/* outerTheme */ Theme, Theme])): ThemeProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderProps]
    }
    
    extension [Self <: ThemeProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTheme(value: js.Object | (js.Function1[/* outerTheme */ Theme, Theme])): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeFunction1(value: /* outerTheme */ Theme => Theme): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    P extends {  theme :infer Theme} ? P & {  theme :std.Exclude<Theme, undefined>} : P & {  theme :T}
    }}}
    */
  type WithTheme_[P, T] = P & (/* import warning: importer.ImportType#apply Failed type conversion: {  theme :T} */ js.Any)
}
