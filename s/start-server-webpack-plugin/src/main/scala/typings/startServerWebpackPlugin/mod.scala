package typings.startServerWebpackPlugin

import typings.startServerWebpackPlugin.startServerWebpackPluginBooleans.`false`
import typings.startServerWebpackPlugin.startServerWebpackPluginBooleans.`true`
import typings.startServerWebpackPlugin.startServerWebpackPluginStrings.SIGUSR2
import typings.webpack.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("start-server-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ () extends StObject {
    def this(options: String) = this()
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Arguments for the script.
      * Default: `[]`.
      */
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Allow typing 'rs' to restart the server.
      * Default: 'true' if in 'development' mode, 'false' otherwise.
      */
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of the server to start (built asset from webpack).
      * If not provided, the plugin will tell you the available names.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Arguments for node.
      * Default: `[]`.
      */
    var nodeArgs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Signal to send for HMR.
      * Default: 'false'.
      */
    var signal: js.UndefOr[`false` | `true` | SIGUSR2] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNodeArgs(value: js.Array[String]): Self = StObject.set(x, "nodeArgs", value.asInstanceOf[js.Any])
      
      inline def setNodeArgsUndefined: Self = StObject.set(x, "nodeArgs", js.undefined)
      
      inline def setNodeArgsVarargs(value: String*): Self = StObject.set(x, "nodeArgs", js.Array(value*))
      
      inline def setSignal(value: `false` | `true` | SIGUSR2): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  type StartServerWebpackPlugin = Plugin
}
