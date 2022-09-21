package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.reactNativeElements.colorsMod.Colors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorsDarkMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/config/colorsDark", JSImport.Default)
  @js.native
  val default: Colors = js.native
  
  type _To = Colors
  
  /* This means you don't have to write `default`, but can instead just say `colorsDarkMod.foo` */
  override def _to: Colors = default
}
