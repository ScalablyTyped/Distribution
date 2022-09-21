package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNativeElements.anon.PickButtonPropsstyleonLay
import typings.reactNativeElements.buttonMod.ButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogButtonMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/dialog/DialogButton", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickButtonPropsstyleonLay] | ForwardRefExoticComponent[ButtonProps] = js.native
  
  type _To = FunctionComponent[PickButtonPropsstyleonLay] | ForwardRefExoticComponent[ButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `dialogButtonMod.foo` */
  override def _to: FunctionComponent[PickButtonPropsstyleonLay] | ForwardRefExoticComponent[ButtonProps] = default
}
