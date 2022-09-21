package typings.reactSketchapp

import org.scalablytyped.runtime.Shortcut
import typings.reactSketchapp.moduleTypesMod.PlatformBridge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object macosMod extends Shortcut {
  
  @JSImport("react-sketchapp/lib/module/platformBridges/macos", JSImport.Default)
  @js.native
  val default: PlatformBridge = js.native
  
  type _To = PlatformBridge
  
  /* This means you don't have to write `default`, but can instead just say `macosMod.foo` */
  override def _to: PlatformBridge = default
}
