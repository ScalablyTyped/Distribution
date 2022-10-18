package typings.revealJs

import org.scalablytyped.runtime.Shortcut
import typings.revealJs.mod.PluginFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginZoomZoomMod extends Shortcut {
  
  @JSImport("reveal.js/plugin/zoom/zoom", JSImport.Namespace)
  @js.native
  val ^ : PluginFunction = js.native
  
  type _To = PluginFunction
  
  /* This means you don't have to write `^`, but can instead just say `pluginZoomZoomMod.foo` */
  override def _to: PluginFunction = ^
}
