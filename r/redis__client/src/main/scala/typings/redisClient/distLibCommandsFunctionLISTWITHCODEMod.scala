package typings.redisClient

import typings.redisClient.anon.Description
import typings.redisClient.distLibCommandsGenericTransformersMod.FunctionListItemReply
import typings.redisClient.distLibCommandsGenericTransformersMod.RedisFunctionFlags
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.description
import typings.redisClient.redisClientStrings.engine
import typings.redisClient.redisClientStrings.flags
import typings.redisClient.redisClientStrings.functions
import typings.redisClient.redisClientStrings.library_name
import typings.redisClient.redisClientStrings.name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsFunctionLISTWITHCODEMod {
  
  @JSImport("@redis/client/dist/lib/commands/FUNCTION_LIST_WITHCODE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[RedisCommandArguments]
  inline def transformArguments(pattern: String): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(pattern.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: js.Array[FunctionListWithCodeRawItemReply]): js.Array[FunctionListWithCodeItemReply] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[FunctionListWithCodeItemReply]]
  
  trait FunctionListWithCodeItemReply
    extends StObject
       with FunctionListItemReply {
    
    var libraryCode: String
  }
  object FunctionListWithCodeItemReply {
    
    inline def apply(engine: String, functions: js.Array[Description], libraryCode: String, libraryName: String): FunctionListWithCodeItemReply = {
      val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], libraryCode = libraryCode.asInstanceOf[js.Any], libraryName = libraryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionListWithCodeItemReply]
    }
    
    extension [Self <: FunctionListWithCodeItemReply](x: Self) {
      
      inline def setLibraryCode(value: String): Self = StObject.set(x, "libraryCode", value.asInstanceOf[js.Any])
    }
  }
  
  type FunctionListWithCodeRawItemReply = /* import warning: importer.ImportType#apply c repeated non-array type: ['library_name', string, 'engine', string, 'functions', std.Array<['name', string, 'description', string | null, 'flags', std.Array<@redis/client.@redis/client/dist/lib/commands/generic-transformers.RedisFunctionFlags>]>] */ js.Array[
    js.Tuple6[
      library_name, 
      String, 
      engine, 
      String, 
      functions, 
      js.Array[
        js.Tuple6[name, String, description, String | Null, flags, js.Array[RedisFunctionFlags]]
      ]
    ]
  ]
}
