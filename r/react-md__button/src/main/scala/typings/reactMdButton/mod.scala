package typings.reactMdButton

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdButton.anon.PickButtonHTMLAttributesH
import typings.reactMdButton.buttonMod.ButtonProps
import typings.reactMdButton.buttonThemeClassNamesMod.ButtonThemeProps
import typings.reactMdButton.fabMod.FABProps
import typings.std.HTMLButtonElement
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/button", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val Button: ForwardRefExoticComponent[ButtonProps with RefAttributes[HTMLButtonElement]] = js.native
  val FAB: ForwardRefExoticComponent[FABProps with RefAttributes[HTMLSpanElement]] = js.native
  /**
    * The unstyled button is a really simple button element that resets the default
    * browser button styles into a clear clickable element.
    */
  val UnstyledButton: ForwardRefExoticComponent[PickButtonHTMLAttributesH] = js.native
  def buttonThemeClassNames(props: ButtonThemeProps): String = js.native
}

