package typings.rollupPluginProgress

import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-progress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin]
  @scala.inline
  def default(options: PluginProgressOptions): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  trait PluginProgressOptions extends StObject {
    
    var clearLine: js.UndefOr[Boolean] = js.undefined
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
