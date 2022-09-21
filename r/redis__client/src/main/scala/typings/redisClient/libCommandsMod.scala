package typings.redisClient

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.node.bufferMod.global.Buffer
import typings.redisClient.anon.CommandOptionsClientComma
import typings.redisClient.luaScriptMod.RedisScriptConfig
import typings.redisClient.luaScriptMod.SHA1
import typings.std.Array
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommandsMod {
  
  type ConvertArgumentType[Type, ToType] = Type | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Property in keyof Type ]: any}
    */ typings.redisClient.redisClientStrings.ConvertArgumentType & TopLevel[Any]) | js.Array[Any] | (Map[Any, Any]) | Set[Any] | ToType
  
  type ExcludeMappedString[S] = S
  
  trait RedisCommand extends StObject {
    
    var FIRST_KEY_INDEX: js.UndefOr[Double | (js.Function1[/* repeated */ Any, js.UndefOr[RedisCommandArgument]])] = js.undefined
    
    var IS_READ_ONLY: js.UndefOr[Boolean] = js.undefined
    
    def transformArguments(args: Any*): RedisCommandArguments
    
    var transformReply: js.UndefOr[
        js.ThisFunction2[/* this */ Unit, /* reply */ Any, /* preserved */ js.UndefOr[Any], Any]
      ] = js.undefined
  }
  object RedisCommand {
    
    inline def apply(transformArguments: /* repeated */ Any => RedisCommandArguments): RedisCommand = {
      val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments))
      __obj.asInstanceOf[RedisCommand]
    }
    
    extension [Self <: RedisCommand](x: Self) {
      
      inline def setFIRST_KEY_INDEX(value: Double | (js.Function1[/* repeated */ Any, js.UndefOr[RedisCommandArgument]])): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
      
      inline def setFIRST_KEY_INDEXFunction1(value: /* repeated */ Any => js.UndefOr[RedisCommandArgument]): Self = StObject.set(x, "FIRST_KEY_INDEX", js.Any.fromFunction1(value))
      
      inline def setFIRST_KEY_INDEXUndefined: Self = StObject.set(x, "FIRST_KEY_INDEX", js.undefined)
      
      inline def setIS_READ_ONLY(value: Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
      
      inline def setIS_READ_ONLYUndefined: Self = StObject.set(x, "IS_READ_ONLY", js.undefined)
      
      inline def setTransformArguments(value: /* repeated */ Any => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
      
      inline def setTransformReply(value: js.ThisFunction2[/* this */ Unit, /* reply */ Any, /* preserved */ js.UndefOr[Any], Any]): Self = StObject.set(x, "transformReply", value.asInstanceOf[js.Any])
      
      inline def setTransformReplyUndefined: Self = StObject.set(x, "transformReply", js.undefined)
    }
  }
  
  type RedisCommandArgument = String | Buffer
  
  @js.native
  trait RedisCommandArguments
    extends StObject
       with Array[RedisCommandArgument] {
    
    var preserve: js.UndefOr[Any] = js.native
  }
  
  type RedisCommandRawReply = js.UndefOr[String | Double | Buffer | Null | js.Array[Any]]
  
  type RedisCommandReply[C /* <: RedisCommand */] = Any
  
  @js.native
  trait RedisCommandSignature[Command /* <: RedisCommand */, Params /* <: js.Array[Any] */] extends StObject {
    
    def apply[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Params
    ): js.Promise[ConvertArgumentType[RedisCommandReply[Command], String | Buffer]] = js.native
    def apply[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: Params */ /* rest */ js.Array[Params]
    ): js.Promise[ConvertArgumentType[RedisCommandReply[Command], String | Buffer]] = js.native
  }
  
  type RedisCommands = StringDictionary[RedisCommand]
  
  trait RedisExtensions[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] extends StObject {
    
    var functions: js.UndefOr[F] = js.undefined
    
    var modules: js.UndefOr[M] = js.undefined
    
    var scripts: js.UndefOr[S] = js.undefined
  }
  object RedisExtensions {
    
    inline def apply[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](): RedisExtensions[M, F, S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedisExtensions[M, F, S]]
    }
    
    extension [Self <: RedisExtensions[?, ?, ?], M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](x: Self & (RedisExtensions[M, F, S])) {
      
      inline def setFunctions(value: F): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      inline def setModules(value: M): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setScripts(value: S): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    }
  }
  
  trait RedisFunction
    extends StObject
       with RedisCommand {
    
    var NUMBER_OF_KEYS: js.UndefOr[Double] = js.undefined
  }
  object RedisFunction {
    
    inline def apply(transformArguments: /* repeated */ Any => RedisCommandArguments): RedisFunction = {
      val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments))
      __obj.asInstanceOf[RedisFunction]
    }
    
    extension [Self <: RedisFunction](x: Self) {
      
      inline def setNUMBER_OF_KEYS(value: Double): Self = StObject.set(x, "NUMBER_OF_KEYS", value.asInstanceOf[js.Any])
      
      inline def setNUMBER_OF_KEYSUndefined: Self = StObject.set(x, "NUMBER_OF_KEYS", js.undefined)
    }
  }
  
  type RedisFunctionLibrary = StringDictionary[RedisFunction]
  
  type RedisFunctions = StringDictionary[RedisFunctionLibrary]
  
  type RedisModule = StringDictionary[RedisCommand]
  
  type RedisModules = StringDictionary[RedisModule]
  
  trait RedisScript
    extends StObject
       with RedisScriptConfig
       with SHA1
  object RedisScript {
    
    inline def apply(SCRIPT: String, SHA1: String, transformArguments: /* repeated */ Any => RedisCommandArguments): RedisScript = {
      val __obj = js.Dynamic.literal(SCRIPT = SCRIPT.asInstanceOf[js.Any], SHA1 = SHA1.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments))
      __obj.asInstanceOf[RedisScript]
    }
  }
  
  type RedisScripts = StringDictionary[RedisScript]
}
