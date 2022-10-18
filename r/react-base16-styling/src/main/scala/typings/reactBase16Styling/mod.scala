package typings.reactBase16Styling

import org.scalablytyped.runtime.StringDictionary
import typings.base16.mod.Base16Theme
import typings.lodash.mod.CurriedFunction3
import typings.reactBase16Styling.libTypesTypesMod.StylingConfig
import typings.reactBase16Styling.libTypesTypesMod.StylingFunction
import typings.reactBase16Styling.libTypesTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-base16-styling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-base16-styling", "createStyling")
  @js.native
  val createStyling: CurriedFunction3[
    js.Function1[/* base16Theme */ Base16Theme, StylingConfig], 
    js.UndefOr[Options], 
    js.UndefOr[Theme], 
    StylingFunction
  ] = js.native
  
  inline def getBase16Theme(theme: Theme): js.UndefOr[Base16Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBase16Theme")(theme.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Base16Theme]]
  inline def getBase16Theme(theme: Theme, base16Themes: StringDictionary[Base16Theme]): js.UndefOr[Base16Theme] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBase16Theme")(theme.asInstanceOf[js.Any], base16Themes.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Base16Theme]]
  
  inline def invertBase16Theme(base16Theme: Base16Theme): Base16Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("invertBase16Theme")(base16Theme.asInstanceOf[js.Any]).asInstanceOf[Base16Theme]
  
  inline def invertTheme(): js.UndefOr[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("invertTheme")().asInstanceOf[js.UndefOr[Theme]]
  inline def invertTheme(theme: Theme): js.UndefOr[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("invertTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Theme]]
  
  trait Options extends StObject {
    
    var base16Themes: js.UndefOr[StringDictionary[Base16Theme]] = js.undefined
    
    var defaultBase16: js.UndefOr[Base16Theme] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBase16Themes(value: StringDictionary[Base16Theme]): Self = StObject.set(x, "base16Themes", value.asInstanceOf[js.Any])
      
      inline def setBase16ThemesUndefined: Self = StObject.set(x, "base16Themes", js.undefined)
      
      inline def setDefaultBase16(value: Base16Theme): Self = StObject.set(x, "defaultBase16", value.asInstanceOf[js.Any])
      
      inline def setDefaultBase16Undefined: Self = StObject.set(x, "defaultBase16", js.undefined)
    }
  }
}
