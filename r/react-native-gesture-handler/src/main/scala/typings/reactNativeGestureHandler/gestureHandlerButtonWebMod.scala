package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactNative.mod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gestureHandlerButtonWebMod extends Shortcut {
  
  @JSImport("react-native-gesture-handler/lib/typescript/components/GestureHandlerButton.web", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RefAttributes[View]] = js.native
  
  type _To = ForwardRefExoticComponent[RefAttributes[View]]
  
  /* This means you don't have to write `default`, but can instead just say `gestureHandlerButtonWebMod.foo` */
  override def _to: ForwardRefExoticComponent[RefAttributes[View]] = default
}
