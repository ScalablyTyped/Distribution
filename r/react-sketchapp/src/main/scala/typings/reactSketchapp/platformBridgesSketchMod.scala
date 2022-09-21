package typings.reactSketchapp

import org.scalablytyped.runtime.Shortcut
import typings.reactSketchapp.libTypesMod.PlatformBridge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformBridgesSketchMod extends Shortcut {
  
  @JSImport("react-sketchapp/lib/platformBridges/sketch", JSImport.Default)
  @js.native
  val default: PlatformBridge = js.native
  
  type _To = PlatformBridge
  
  /* This means you don't have to write `default`, but can instead just say `platformBridgesSketchMod.foo` */
  override def _to: PlatformBridge = default
}
