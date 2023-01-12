package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.distLibCommandsMod.RedisCommandRawReply
import typings.redisClient.distLibCommandsMod.RedisFunction
import typings.redisClient.distLibCommandsMod.RedisScript
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibMultiCommandMod {
  
  @JSImport("@redis/client/dist/lib/multi-command", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with RedisMultiCommand
  /* static members */
  object default {
    
    @JSImport("@redis/client/dist/lib/multi-command", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def generateChainId(): js.Symbol = ^.asInstanceOf[js.Dynamic].applyDynamic("generateChainId")().asInstanceOf[js.Symbol]
  }
  
  @js.native
  trait RedisMultiCommand extends StObject {
    
    def addCommand(args: RedisCommandArguments): Unit = js.native
    def addCommand(
      args: RedisCommandArguments,
      transformReply: js.UndefOr[
          js.ThisFunction2[/* this */ Unit, /* reply */ Any, /* preserved */ js.UndefOr[Any], Any]
        ]
    ): Unit = js.native
    
    def addFunction(name: String, fn: RedisFunction, args: js.Array[Any]): RedisCommandArguments = js.native
    
    def addScript(script: RedisScript, args: js.Array[Any]): RedisCommandArguments = js.native
    
    def exec(): js.UndefOr[js.Array[RedisMultiQueuedCommand]] = js.native
    
    def handleExecReplies(rawReplies: js.Array[RedisCommandRawReply]): js.Array[RedisCommandRawReply] = js.native
    
    val queue: js.Array[RedisMultiQueuedCommand] = js.native
    
    val scriptsInUse: Set[String] = js.native
    
    def transformReplies(rawReplies: js.Array[RedisCommandRawReply]): js.Array[RedisCommandRawReply] = js.native
  }
  
  trait RedisMultiQueuedCommand extends StObject {
    
    var args: RedisCommandArguments
    
    var transformReply: js.UndefOr[
        js.ThisFunction2[/* this */ Unit, /* reply */ Any, /* preserved */ js.UndefOr[Any], Any]
      ] = js.undefined
  }
  object RedisMultiQueuedCommand {
    
    inline def apply(args: RedisCommandArguments): RedisMultiQueuedCommand = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedisMultiQueuedCommand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedisMultiQueuedCommand] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: RedisCommandArguments): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setTransformReply(value: js.ThisFunction2[/* this */ Unit, /* reply */ Any, /* preserved */ js.UndefOr[Any], Any]): Self = StObject.set(x, "transformReply", value.asInstanceOf[js.Any])
      
      inline def setTransformReplyUndefined: Self = StObject.set(x, "transformReply", js.undefined)
    }
  }
}
