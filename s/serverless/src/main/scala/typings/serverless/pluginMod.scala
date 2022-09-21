package typings.serverless

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.serverless.anon.Create
import typings.serverless.anon.Debug
import typings.serverless.anon.IsDisabledAtPrepopulation
import typings.serverless.anon.Resolve
import typings.serverless.mod.Options
import typings.serverless.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  type Commands = StringDictionary[typings.serverless.anon.Commands]
  
  type ConfigurationVariablesSource = js.Function1[/* variableSource */ Any, js.Promise[Any]]
  
  type ConfigurationVariablesSources = StringDictionary[ConfigurationVariablesSource | Resolve]
  
  type Hooks = StringDictionary[js.Function1[/* repeated */ Any, Any]]
  
  @js.native
  trait Logging extends StObject {
    
    var log: Debug = js.native
    
    var progress: Create = js.native
    
    def writeText(text: String): Unit = js.native
    def writeText(text: js.Array[String]): Unit = js.native
  }
  
  trait Plugin extends StObject {
    
    var commands: js.UndefOr[Commands] = js.undefined
    
    var configurationVariablesSources: js.UndefOr[ConfigurationVariablesSources] = js.undefined
    
    var hooks: Hooks
    
    var variableResolvers: js.UndefOr[VariableResolvers] = js.undefined
  }
  object Plugin {
    
    inline def apply(hooks: Hooks): Plugin = {
      val __obj = js.Dynamic.literal(hooks = hooks.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugin]
    }
    
    extension [Self <: Plugin](x: Self) {
      
      inline def setCommands(value: Commands): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      inline def setConfigurationVariablesSources(value: ConfigurationVariablesSources): Self = StObject.set(x, "configurationVariablesSources", value.asInstanceOf[js.Any])
      
      inline def setConfigurationVariablesSourcesUndefined: Self = StObject.set(x, "configurationVariablesSources", js.undefined)
      
      inline def setHooks(value: Hooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setVariableResolvers(value: VariableResolvers): Self = StObject.set(x, "variableResolvers", value.asInstanceOf[js.Any])
      
      inline def setVariableResolversUndefined: Self = StObject.set(x, "variableResolvers", js.undefined)
    }
  }
  
  @js.native
  trait PluginStatic
    extends StObject
       with Instantiable3[/* serverless */ ^, /* options */ Options, /* logging */ Logging, Plugin]
  
  trait Progress extends StObject {
    
    def info(message: String): Unit
    
    var name: String
    
    var namespace: String
    
    def notice(message: String): Unit
    
    def remove(): Unit
    
    def update(message: String): Unit
  }
  object Progress {
    
    inline def apply(
      info: String => Unit,
      name: String,
      namespace: String,
      notice: String => Unit,
      remove: () => Unit,
      update: String => Unit
    ): Progress = {
      val __obj = js.Dynamic.literal(info = js.Any.fromFunction1(info), name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], notice = js.Any.fromFunction1(notice), remove = js.Any.fromFunction0(remove), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Progress]
    }
    
    extension [Self <: Progress](x: Self) {
      
      inline def setInfo(value: String => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNotice(value: String => Unit): Self = StObject.set(x, "notice", js.Any.fromFunction1(value))
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: String => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  type VariableResolver = js.Function1[/* variableSource */ String, js.Promise[Any]]
  
  type VariableResolvers = StringDictionary[VariableResolver | IsDisabledAtPrepopulation]
}
