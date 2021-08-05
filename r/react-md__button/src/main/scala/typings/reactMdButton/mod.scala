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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/button", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/button", "Button")
  @js.native
  val Button: ForwardRefExoticComponent[ButtonProps & RefAttributes[HTMLButtonElement]] = js.native
  
  @JSImport("@react-md/button", "FAB")
  @js.native
  val FAB: ForwardRefExoticComponent[FABProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/button", "UnstyledButton")
  @js.native
  val UnstyledButton: ForwardRefExoticComponent[PickButtonHTMLAttributesH] = js.native
  
  inline def buttonThemeClassNames(hasPropThemeThemeTypeButtonTypePropDisabledClassName: ButtonThemeProps): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonThemeClassNames")(hasPropThemeThemeTypeButtonTypePropDisabledClassName.asInstanceOf[js.Any]).asInstanceOf[String]
}
