package typings.reactBase16Styling

import org.scalablytyped.runtime.StringDictionary
import typings.base16.mod.Base16Theme
import typings.lodash.mod.CurriedFunction3
import typings.reactBase16Styling.anon.Base16Themes
import typings.reactBase16Styling.typesMod.StylingConfig
import typings.reactBase16Styling.typesMod.StylingFunction
import typings.reactBase16Styling.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-base16-styling", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val createStyling: CurriedFunction3[
    js.Function1[/* base16Theme */ Base16Theme, StylingConfig], 
    js.UndefOr[Base16Themes], 
    js.UndefOr[String | Base16Theme | StylingConfig], 
    StylingFunction
  ] = js.native
  
  def getBase16Theme(theme: Theme): js.UndefOr[Base16Theme] = js.native
  def getBase16Theme(theme: Theme, base16Themes: StringDictionary[Base16Theme]): js.UndefOr[Base16Theme] = js.native
  
  def invertBase16Theme(base16Theme: Base16Theme): Base16Theme = js.native
  
  def invertTheme(): js.UndefOr[Theme] = js.native
  def invertTheme(theme: Theme): js.UndefOr[Theme] = js.native
}
