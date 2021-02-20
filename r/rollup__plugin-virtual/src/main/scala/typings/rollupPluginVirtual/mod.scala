package typings.rollupPluginVirtual

import org.scalablytyped.runtime.StringDictionary
import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A Rollup plugin which loads virtual modules from memory.
    */
  @JSImport("@rollup/plugin-virtual", JSImport.Namespace)
  @js.native
  def apply(): Plugin = js.native
  @JSImport("@rollup/plugin-virtual", JSImport.Namespace)
  @js.native
  def apply(options: Options): Plugin = js.native
  
  type Options = StringDictionary[String]
}
