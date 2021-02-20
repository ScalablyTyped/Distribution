package typings.reactMdButton

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdButton.anon.PickButtonHTMLAttributesH
import typings.reactMdButton.buttonMod.ButtonProps
import typings.reactMdButton.buttonThemeClassNamesMod.ButtonThemeProps
import typings.reactMdButton.fabMod.FABProps
import typings.std.HTMLButtonElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/button", "Button")
  @js.native
  val Button: ForwardRefExoticComponent[ButtonProps with RefAttributes[HTMLButtonElement]] = js.native
  
  @JSImport("@react-md/button", "FAB")
  @js.native
  val FAB: ForwardRefExoticComponent[FABProps with RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/button", "UnstyledButton")
  @js.native
  val UnstyledButton: ForwardRefExoticComponent[PickButtonHTMLAttributesH] = js.native
  
  @JSImport("@react-md/button", "buttonThemeClassNames")
  @js.native
  def buttonThemeClassNames(hasThemeThemeTypeButtonTypeDisabledClassName: ButtonThemeProps): String = js.native
}
