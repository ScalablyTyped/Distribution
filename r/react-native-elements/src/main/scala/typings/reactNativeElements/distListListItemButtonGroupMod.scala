package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNativeElements.anon.ButtonGroupPropsPartialTh
import typings.reactNativeElements.anon.PickButtonGroupPropsParti
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListListItemButtonGroupMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/list/ListItemButtonGroup", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickButtonGroupPropsParti] | ForwardRefExoticComponent[ButtonGroupPropsPartialTh] = js.native
  
  type _To = FunctionComponent[PickButtonGroupPropsParti] | ForwardRefExoticComponent[ButtonGroupPropsPartialTh]
  
  /* This means you don't have to write `default`, but can instead just say `distListListItemButtonGroupMod.foo` */
  override def _to: FunctionComponent[PickButtonGroupPropsParti] | ForwardRefExoticComponent[ButtonGroupPropsPartialTh] = default
}
