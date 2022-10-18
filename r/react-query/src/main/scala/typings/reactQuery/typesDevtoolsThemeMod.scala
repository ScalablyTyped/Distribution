package typings.reactQuery

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactQuery.anon.Active
import typings.reactQuery.reactQueryStrings.Numbersign000
import typings.reactQuery.reactQueryStrings.Numbersign006bff
import typings.reactQuery.reactQueryStrings.Numbersign00ab52
import typings.reactQuery.reactQueryStrings.Numbersign0b1521
import typings.reactQuery.reactQueryStrings.Numbersign132337
import typings.reactQuery.reactQueryStrings.Numbersign222e3e
import typings.reactQuery.reactQueryStrings.Numbersign3f4e60
import typings.reactQuery.reactQueryStrings.Numbersignff0085
import typings.reactQuery.reactQueryStrings.Numbersignffb200
import typings.reactQuery.reactQueryStrings.Numbersignfff
import typings.reactQuery.reactQueryStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDevtoolsThemeMod {
  
  @JSImport("react-query/types/devtools/theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ThemeProvider(hasThemeRest: ProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(hasThemeRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object defaultTheme {
    
    @JSImport("react-query/types/devtools/theme", "defaultTheme.active")
    @js.native
    val active: Numbersign006bff = js.native
    
    @JSImport("react-query/types/devtools/theme", "defaultTheme.background")
    @js.native
    val background: Numbersign0b1521 = js.native
    
    @JSImport("react-query/types/devtools/theme", "defaultTheme.backgroundAlt")
    @js.native
    val backgroundAlt: Numbersign132337 = js.native
    
    @JSImport("react-query/types/devtools/theme", "defaultTheme.danger")
    @js.native
    val danger: Numbersignff0085 = js.native
    
    @JSImport("react-query/types/devtools/theme", "defaultTheme.foreground")
    @js.native
    val foreground: white = js.native
    
    @JSImport("react-query/types/devtools/theme", "defaultTheme.gray")
    @js.native
    val gray: Numbersign3f4e60 = js.native
    
    @JSImport("react-query/types/devtools/theme", "defaultTheme.grayAlt")
    @js.native
    val grayAlt: Numbersign222e3e = js.native
    
    @JSImport("react-query/types/devtools/theme", "defaultTheme.inputBackgroundColor")
    @js.native
    val inputBackgroundColor: Numbersignfff = js.native
    
    @JSImport("react-query/types/devtools/theme", "defaultTheme.inputTextColor")
    @js.native
    val inputTextColor: Numbersign000 = js.native
    
    @JSImport("react-query/types/devtools/theme", "defaultTheme.success")
    @js.native
    val success: Numbersign00ab52 = js.native
    
    @JSImport("react-query/types/devtools/theme", "defaultTheme.warning")
    @js.native
    val warning: Numbersignffb200 = js.native
  }
  
  inline def useTheme(): Active = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[Active]
  
  trait ProviderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var theme: Theme
  }
  object ProviderProps {
    
    inline def apply(theme: Theme): ProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderProps]
    }
    
    extension [Self <: ProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait Theme extends StObject {
    
    val active: Numbersign006bff
    
    val background: Numbersign0b1521
    
    val backgroundAlt: Numbersign132337
    
    val danger: Numbersignff0085
    
    val foreground: white
    
    val gray: Numbersign3f4e60
    
    val grayAlt: Numbersign222e3e
    
    val inputBackgroundColor: Numbersignfff
    
    val inputTextColor: Numbersign000
    
    val success: Numbersign00ab52
    
    val warning: Numbersignffb200
  }
  object Theme {
    
    inline def apply(): Theme = {
      val __obj = js.Dynamic.literal(active = "#006bff", background = "#0b1521", backgroundAlt = "#132337", danger = "#ff0085", foreground = "white", gray = "#3f4e60", grayAlt = "#222e3e", inputBackgroundColor = "#fff", inputTextColor = "#000", success = "#00ab52", warning = "#ffb200")
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setActive(value: Numbersign006bff): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setBackground(value: Numbersign0b1521): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundAlt(value: Numbersign132337): Self = StObject.set(x, "backgroundAlt", value.asInstanceOf[js.Any])
      
      inline def setDanger(value: Numbersignff0085): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
      
      inline def setForeground(value: white): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      inline def setGray(value: Numbersign3f4e60): Self = StObject.set(x, "gray", value.asInstanceOf[js.Any])
      
      inline def setGrayAlt(value: Numbersign222e3e): Self = StObject.set(x, "grayAlt", value.asInstanceOf[js.Any])
      
      inline def setInputBackgroundColor(value: Numbersignfff): Self = StObject.set(x, "inputBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setInputTextColor(value: Numbersign000): Self = StObject.set(x, "inputTextColor", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Numbersign00ab52): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: Numbersignffb200): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
}
