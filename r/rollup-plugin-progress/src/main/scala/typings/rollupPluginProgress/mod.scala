package typings.rollupPluginProgress

import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-progress", JSImport.Default)
  @js.native
  def default(): Plugin = js.native
  @JSImport("rollup-plugin-progress", JSImport.Default)
  @js.native
  def default(options: PluginProgressOptions): Plugin = js.native
  
  @js.native
  trait PluginProgressOptions extends StObject {
    
    var clearLine: js.UndefOr[Boolean] = js.native
  }
  object PluginProgressOptions {
    
    @scala.inline
    def apply(): PluginProgressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginProgressOptions]
    }
    
    @scala.inline
    implicit class PluginProgressOptionsMutableBuilder[Self <: PluginProgressOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearLine(value: Boolean): Self = StObject.set(x, "clearLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearLineUndefined: Self = StObject.set(x, "clearLine", js.undefined)
    }
  }
}
