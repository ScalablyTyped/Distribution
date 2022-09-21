package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Shortcut
import typings.reactNative.mod.HostComponent
import typings.reactNativeGestureHandler.gestureButtonsMod.RawButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gestureHandlerButtonMod extends Shortcut {
  
  @JSImport("react-native-gesture-handler/lib/typescript/components/GestureHandlerButton", JSImport.Default)
  @js.native
  val default: HostComponent[RawButtonProps] = js.native
  
  type _To = HostComponent[RawButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `gestureHandlerButtonMod.foo` */
  override def _to: HostComponent[RawButtonProps] = default
}
