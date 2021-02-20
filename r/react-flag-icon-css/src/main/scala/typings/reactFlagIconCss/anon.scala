package typings.reactFlagIconCss

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.Properties
import typings.csstype.mod.PropertiesHyphen
import typings.reactFlagIconCss.reactFlagIconCssNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<react-flag-icon-css.react-flag-icon-css.FlagIconOptions> */
  @js.native
  trait ReadonlyFlagIconOptions extends StObject {
    
    val customCodes: js.UndefOr[StringDictionary[String]] = js.native
    
    val themeStyles: js.UndefOr[
        StringDictionary[(Properties[String | `0`]) with (PropertiesHyphen[String | `0`])]
      ] = js.native
    
    val useCssModules: js.UndefOr[Boolean] = js.native
  }
  object ReadonlyFlagIconOptions {
    
    @scala.inline
    def apply(): ReadonlyFlagIconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyFlagIconOptions]
    }
    
    @scala.inline
    implicit class ReadonlyFlagIconOptionsMutableBuilder[Self <: ReadonlyFlagIconOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomCodes(value: StringDictionary[String]): Self = StObject.set(x, "customCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomCodesUndefined: Self = StObject.set(x, "customCodes", js.undefined)
      
      @scala.inline
      def setThemeStyles(value: StringDictionary[(Properties[String | `0`]) with (PropertiesHyphen[String | `0`])]): Self = StObject.set(x, "themeStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeStylesUndefined: Self = StObject.set(x, "themeStyles", js.undefined)
      
      @scala.inline
      def setUseCssModules(value: Boolean): Self = StObject.set(x, "useCssModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCssModulesUndefined: Self = StObject.set(x, "useCssModules", js.undefined)
    }
  }
}
