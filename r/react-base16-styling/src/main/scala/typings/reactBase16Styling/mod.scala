package typings.reactBase16Styling

import org.scalablytyped.runtime.StringDictionary
import typings.base16.mod.Base16Theme
import typings.lodash.mod.CurriedFunction3
import typings.reactBase16Styling.anon.Base16Themes
import typings.reactBase16Styling.typesMod.StylingConfig
import typings.reactBase16Styling.typesMod.StylingFunction
import typings.reactBase16Styling.typesMod.Theme
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
    js.UndefOr[Base16Themes], 
    js.UndefOr[String | Base16Theme | StylingConfig], 
    StylingFunction
  ] = js.native
  
  @scala.inline
  def getBase16Theme(theme: Theme): js.UndefOr[Base16Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBase16Theme")(theme.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Base16Theme]]
  @scala.inline
  def getBase16Theme(theme: Theme, base16Themes: StringDictionary[Base16Theme]): js.UndefOr[Base16Theme] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBase16Theme")(theme.asInstanceOf[js.Any], base16Themes.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Base16Theme]]
  
  @scala.inline
  def invertBase16Theme(base16Theme: Base16Theme): Base16Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("invertBase16Theme")(base16Theme.asInstanceOf[js.Any]).asInstanceOf[Base16Theme]
  
  @scala.inline
  def invertTheme(): js.UndefOr[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("invertTheme")().asInstanceOf[js.UndefOr[Theme]]
  @scala.inline
  def invertTheme(theme: Theme): js.UndefOr[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("invertTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Theme]]
}
