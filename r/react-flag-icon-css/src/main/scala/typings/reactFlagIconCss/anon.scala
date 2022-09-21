package typings.reactFlagIconCss

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.Properties
import typings.csstype.mod.PropertiesHyphen
import typings.reactFlagIconCss.reactFlagIconCssNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<react-flag-icon-css.react-flag-icon-css.FlagIconOptions> */
  trait ReadonlyFlagIconOptions extends StObject {
    
    val customCodes: js.UndefOr[StringDictionary[String]] = js.undefined
    
    val themeStyles: js.UndefOr[
        StringDictionary[(Properties[String | `0`, String]) & (PropertiesHyphen[String | `0`, String])]
      ] = js.undefined
    
    val useCssModules: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyFlagIconOptions {
    
    inline def apply(): ReadonlyFlagIconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyFlagIconOptions]
    }
    
    extension [Self <: ReadonlyFlagIconOptions](x: Self) {
      
      inline def setCustomCodes(value: StringDictionary[String]): Self = StObject.set(x, "customCodes", value.asInstanceOf[js.Any])
      
      inline def setCustomCodesUndefined: Self = StObject.set(x, "customCodes", js.undefined)
      
      inline def setThemeStyles(
        value: StringDictionary[(Properties[String | `0`, String]) & (PropertiesHyphen[String | `0`, String])]
      ): Self = StObject.set(x, "themeStyles", value.asInstanceOf[js.Any])
      
      inline def setThemeStylesUndefined: Self = StObject.set(x, "themeStyles", js.undefined)
      
      inline def setUseCssModules(value: Boolean): Self = StObject.set(x, "useCssModules", value.asInstanceOf[js.Any])
      
      inline def setUseCssModulesUndefined: Self = StObject.set(x, "useCssModules", js.undefined)
    }
  }
}
