package typings.reactNavigationStack

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.react.mod.Ref
import typings.reactNativeGestureHandler.panGestureHandlerMod.PanGestureHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gestureHandlerRefContextMod extends Shortcut {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/utils/GestureHandlerRefContext", JSImport.Default)
  @js.native
  val default: Context[Ref[PanGestureHandler]] = js.native
  
  type _To = Context[Ref[PanGestureHandler]]
  
  /* This means you don't have to write `default`, but can instead just say `gestureHandlerRefContextMod.foo` */
  override def _to: Context[Ref[PanGestureHandler]] = default
}
