package typings.rollupPluginTypescript2

import org.scalablytyped.runtime.Shortcut
import typings.rollup.mod.PluginImpl
import typings.rollupPluginTypescript2.anon.PartialIOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rollup-plugin-typescript2", JSImport.Default)
  @js.native
  val default: PluginImpl[PartialIOptions] = js.native
  
  type _To = PluginImpl[PartialIOptions]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginImpl[PartialIOptions] = default
}
