package typings.rollupPluginNodeBuiltins

import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-node-builtins", JSImport.Namespace)
  @js.native
  def apply(): Plugin = js.native
  @JSImport("rollup-plugin-node-builtins", JSImport.Namespace)
  @js.native
  def apply(options: Options): Plugin = js.native
  
  @js.native
  trait Options extends StObject {
    
    var crypto: js.UndefOr[Boolean] = js.native
    
    var fs: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrypto(value: Boolean): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCryptoUndefined: Self = StObject.set(x, "crypto", js.undefined)
      
      @scala.inline
      def setFs(value: Boolean): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
    }
  }
}
