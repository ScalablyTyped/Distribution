package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNativeElements.anon.PickTouchableOpacityProps
import typings.reactNativeElements.anon.TouchableOpacityPropsChec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemCheckBoxMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/list/ListItemCheckBox", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickTouchableOpacityProps] | ForwardRefExoticComponent[TouchableOpacityPropsChec] = js.native
  
  type _To = FunctionComponent[PickTouchableOpacityProps] | ForwardRefExoticComponent[TouchableOpacityPropsChec]
  
  /* This means you don't have to write `default`, but can instead just say `listItemCheckBoxMod.foo` */
  override def _to: FunctionComponent[PickTouchableOpacityProps] | ForwardRefExoticComponent[TouchableOpacityPropsChec] = default
}
