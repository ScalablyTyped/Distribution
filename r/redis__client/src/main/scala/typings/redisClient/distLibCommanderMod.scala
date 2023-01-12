package typings.redisClient

import org.scalablytyped.runtime.Instantiable1
import typings.redisClient.anon.Args
import typings.redisClient.distLibCommandsMod.RedisCommand
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.distLibCommandsMod.RedisCommandReply
import typings.redisClient.distLibCommandsMod.RedisFunction
import typings.redisClient.distLibCommandsMod.RedisFunctions
import typings.redisClient.distLibCommandsMod.RedisModules
import typings.redisClient.distLibCommandsMod.RedisScript
import typings.redisClient.distLibCommandsMod.RedisScripts
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommanderMod {
  
  @JSImport("@redis/client/dist/lib/commander", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachCommands[C /* <: RedisCommand */](param0: AttachCommandsConfig[C]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachCommands")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def attachExtensions(config: AttachExtensionsConfig[Instantiable[Any]]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("attachExtensions")(config.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def fCallArguments(name: RedisCommandArgument, fn: RedisFunction, args: RedisCommandArguments): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("fCallArguments")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformCommandArguments[T](command: RedisCommand, args: js.Array[Any]): Args[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformCommandArguments")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Args[T]]
  
  inline def transformCommandReply[C /* <: RedisCommand */](command: C, rawReply: Any, preserved: Any): RedisCommandReply[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformCommandReply")(command.asInstanceOf[js.Any], rawReply.asInstanceOf[js.Any], preserved.asInstanceOf[js.Any])).asInstanceOf[RedisCommandReply[C]]
  
  inline def transformLegacyCommandArguments(args: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformLegacyCommandArguments")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  trait AttachCommandsConfig[C /* <: RedisCommand */] extends StObject {
    
    var BaseClass: Instantiable[Any]
    
    var commands: Record[String, C]
    
    def executor(command: C, args: js.Array[Any], name: String): Any
    @JSName("executor")
    var executor_Original: CommandsExecutor[C]
  }
  object AttachCommandsConfig {
    
    inline def apply[C /* <: RedisCommand */](
      BaseClass: Instantiable[Any],
      commands: Record[String, C],
      executor: (C, /* args */ js.Array[Any], /* name */ String) => Any
    ): AttachCommandsConfig[C] = {
      val __obj = js.Dynamic.literal(BaseClass = BaseClass.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], executor = js.Any.fromFunction3(executor))
      __obj.asInstanceOf[AttachCommandsConfig[C]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttachCommandsConfig[?], C /* <: RedisCommand */] (val x: Self & AttachCommandsConfig[C]) extends AnyVal {
      
      inline def setBaseClass(value: Instantiable[Any]): Self = StObject.set(x, "BaseClass", value.asInstanceOf[js.Any])
      
      inline def setCommands(value: Record[String, C]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setExecutor(value: (C, /* args */ js.Array[Any], /* name */ String) => Any): Self = StObject.set(x, "executor", js.Any.fromFunction3(value))
    }
  }
  
  trait AttachExtensionsConfig[T /* <: Instantiable[Any] */] extends StObject {
    
    var BaseClass: T
    
    var functions: js.UndefOr[RedisFunctions] = js.undefined
    
    def functionsExecutor(command: RedisFunction, args: js.Array[Any], name: String): Any
    @JSName("functionsExecutor")
    var functionsExecutor_Original: CommandsExecutor[RedisFunction]
    
    var modules: js.UndefOr[RedisModules] = js.undefined
    
    def modulesExecutor(command: RedisCommand, args: js.Array[Any], name: String): Any
    @JSName("modulesExecutor")
    var modulesExecutor_Original: CommandsExecutor[RedisCommand]
    
    var scripts: js.UndefOr[RedisScripts] = js.undefined
    
    def scriptsExecutor(command: RedisScript, args: js.Array[Any], name: String): Any
    @JSName("scriptsExecutor")
    var scriptsExecutor_Original: CommandsExecutor[RedisScript]
  }
  object AttachExtensionsConfig {
    
    inline def apply[T /* <: Instantiable[Any] */](
      BaseClass: T,
      functionsExecutor: (RedisFunction, /* args */ js.Array[Any], /* name */ String) => Any,
      modulesExecutor: (RedisCommand, /* args */ js.Array[Any], /* name */ String) => Any,
      scriptsExecutor: (RedisScript, /* args */ js.Array[Any], /* name */ String) => Any
    ): AttachExtensionsConfig[T] = {
      val __obj = js.Dynamic.literal(BaseClass = BaseClass.asInstanceOf[js.Any], functionsExecutor = js.Any.fromFunction3(functionsExecutor), modulesExecutor = js.Any.fromFunction3(modulesExecutor), scriptsExecutor = js.Any.fromFunction3(scriptsExecutor))
      __obj.asInstanceOf[AttachExtensionsConfig[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttachExtensionsConfig[?], T /* <: Instantiable[Any] */] (val x: Self & AttachExtensionsConfig[T]) extends AnyVal {
      
      inline def setBaseClass(value: T): Self = StObject.set(x, "BaseClass", value.asInstanceOf[js.Any])
      
      inline def setFunctions(value: RedisFunctions): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsExecutor(value: (RedisFunction, /* args */ js.Array[Any], /* name */ String) => Any): Self = StObject.set(x, "functionsExecutor", js.Any.fromFunction3(value))
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      inline def setModules(value: RedisModules): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesExecutor(value: (RedisCommand, /* args */ js.Array[Any], /* name */ String) => Any): Self = StObject.set(x, "modulesExecutor", js.Any.fromFunction3(value))
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setScripts(value: RedisScripts): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsExecutor(value: (RedisScript, /* args */ js.Array[Any], /* name */ String) => Any): Self = StObject.set(x, "scriptsExecutor", js.Any.fromFunction3(value))
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    }
  }
  
  type CommandsExecutor[C /* <: RedisCommand */] = js.Function3[/* command */ C, /* args */ js.Array[Any], /* name */ String, Any]
  
  type Instantiable[T] = Instantiable1[/* args (repeated) */ Any, T]
}
