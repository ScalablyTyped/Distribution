package typings.serverless

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.serverless.anon.IsDisabledAtPrepopulation
import typings.serverless.mod.Options
import typings.serverless.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  type Commands = StringDictionary[typings.serverless.anon.Commands]
  
  type Hooks = StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]
  
  @js.native
  trait Plugin extends StObject {
    
    var commands: js.UndefOr[Commands] = js.native
    
    var hooks: Hooks = js.native
    
    var variableResolvers: js.UndefOr[VariableResolvers] = js.native
  }
  object Plugin {
    
    @scala.inline
    def apply(hooks: Hooks): Plugin = {
      val __obj = js.Dynamic.literal(hooks = hooks.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugin]
    }
    
    @scala.inline
    implicit class PluginMutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommands(value: Commands): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      @scala.inline
      def setHooks(value: Hooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableResolvers(value: VariableResolvers): Self = StObject.set(x, "variableResolvers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableResolversUndefined: Self = StObject.set(x, "variableResolvers", js.undefined)
    }
  }
  
  @js.native
  trait PluginStatic extends Instantiable2[/* serverless */ ^, /* options */ Options, Plugin]
  
  type VariableResolver = js.Function1[/* variableSource */ String, js.Promise[js.Any]]
  
  type VariableResolvers = StringDictionary[VariableResolver | IsDisabledAtPrepopulation]
}
