package typings.serverlessJestPlugin

import org.scalablytyped.runtime.TopLevel
import typings.awsLambda.handlerMod.Callback
import typings.lambdaWrapper.anon.Handler
import typings.lambdaWrapper.anon.LambdaFunction
import typings.lambdaWrapper.anon.PartialContext
import typings.lambdaWrapper.mod.Wrapped
import typings.serverless.mod.Options
import typings.serverless.pluginMod.Commands
import typings.serverless.pluginMod.Hooks
import typings.serverless.pluginMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("serverless-jest-plugin", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ServerlessJestPlugin {
    def this(serverless: typings.serverless.mod.^, options: Options) = this()
    
    /* CompleteClass */
    @JSName("commands")
    var commands_ServerlessJestPlugin: Commands = js.native
    
    /* CompleteClass */
    var hooks: Hooks = js.native
  }
  @JSImport("serverless-jest-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWrapper(modName: String, modPath: String, handler: String): Wrapped[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWrapper")(modName.asInstanceOf[js.Any], modPath.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Wrapped[Any, Any]]
  
  object lambdaWrapper {
    
    @JSImport("serverless-jest-plugin", "lambdaWrapper")
    @js.native
    val ^ : js.Any = js.native
    
    inline def init(mod: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(mod.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def run(event: Any, callback: Callback[Any]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def run(event: Any, context: PartialContext, callback: Callback[Any]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def wrap(mod: LambdaFunction): Wrapped[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(mod.asInstanceOf[js.Any]).asInstanceOf[Wrapped[Any, Any]]
    inline def wrap(mod: LambdaFunction, options: js.Object): Wrapped[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(mod.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Wrapped[Any, Any]]
    inline def wrap[TEvent, TResult, THandlerName /* <: String */](
      mod: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ name in THandlerName ]: aws-lambda.aws-lambda/handler.Handler<TEvent, TResult>}
      */ typings.serverlessJestPlugin.serverlessJestPluginStrings.wrap & TopLevel[Any]
    ): Wrapped[TEvent, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(mod.asInstanceOf[js.Any]).asInstanceOf[Wrapped[TEvent, TResult]]
    inline def wrap[TEvent, TResult, THandlerName /* <: String */](
      mod: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ name in THandlerName ]: aws-lambda.aws-lambda/handler.Handler<TEvent, TResult>}
      */ typings.serverlessJestPlugin.serverlessJestPluginStrings.wrap & TopLevel[Any],
      options: Handler[THandlerName]
    ): Wrapped[TEvent, TResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(mod.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Wrapped[TEvent, TResult]]
  }
  
  trait ServerlessJestPlugin
    extends StObject
       with Plugin {
    
    @JSName("commands")
    var commands_ServerlessJestPlugin: Commands
  }
  object ServerlessJestPlugin {
    
    inline def apply(commands: Commands, hooks: Hooks): ServerlessJestPlugin = {
      val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerlessJestPlugin]
    }
    
    extension [Self <: ServerlessJestPlugin](x: Self) {
      
      inline def setCommands(value: Commands): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    }
  }
}
