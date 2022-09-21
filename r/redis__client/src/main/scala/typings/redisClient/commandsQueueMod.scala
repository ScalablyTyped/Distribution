package typings.redisClient

import typings.node.bufferMod.global.Buffer
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsQueueMod {
  
  @JSImport("@redis/client/dist/lib/client/commands-queue", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with RedisCommandsQueue {
    def this(maxLength: Double) = this()
  }
  
  @js.native
  sealed trait PubSubSubscribeCommands extends StObject
  @JSImport("@redis/client/dist/lib/client/commands-queue", "PubSubSubscribeCommands")
  @js.native
  object PubSubSubscribeCommands extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PubSubSubscribeCommands & String] = js.native
    
    @js.native
    sealed trait PSUBSCRIBE
      extends StObject
         with PubSubSubscribeCommands
    /* "PSUBSCRIBE" */ val PSUBSCRIBE: typings.redisClient.commandsQueueMod.PubSubSubscribeCommands.PSUBSCRIBE & String = js.native
    
    @js.native
    sealed trait SUBSCRIBE
      extends StObject
         with PubSubSubscribeCommands
    /* "SUBSCRIBE" */ val SUBSCRIBE: typings.redisClient.commandsQueueMod.PubSubSubscribeCommands.SUBSCRIBE & String = js.native
  }
  
  @js.native
  sealed trait PubSubUnsubscribeCommands extends StObject
  @JSImport("@redis/client/dist/lib/client/commands-queue", "PubSubUnsubscribeCommands")
  @js.native
  object PubSubUnsubscribeCommands extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PubSubUnsubscribeCommands & String] = js.native
    
    @js.native
    sealed trait PUNSUBSCRIBE
      extends StObject
         with PubSubUnsubscribeCommands
    /* "PUNSUBSCRIBE" */ val PUNSUBSCRIBE: typings.redisClient.commandsQueueMod.PubSubUnsubscribeCommands.PUNSUBSCRIBE & String = js.native
    
    @js.native
    sealed trait UNSUBSCRIBE
      extends StObject
         with PubSubUnsubscribeCommands
    /* "UNSUBSCRIBE" */ val UNSUBSCRIBE: typings.redisClient.commandsQueueMod.PubSubUnsubscribeCommands.UNSUBSCRIBE & String = js.native
  }
  
  type PubSubListener[RETURN_BUFFERS /* <: Boolean */, T] = js.Function2[/* message */ T, /* channel */ T, Any]
  
  trait QueueCommandOptions extends StObject {
    
    var asap: js.UndefOr[Boolean] = js.undefined
    
    var chainId: js.UndefOr[js.Symbol] = js.undefined
    
    var ignorePubSubMode: js.UndefOr[Boolean] = js.undefined
    
    var returnBuffers: js.UndefOr[Boolean] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object QueueCommandOptions {
    
    inline def apply(): QueueCommandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueCommandOptions]
    }
    
    extension [Self <: QueueCommandOptions](x: Self) {
      
      inline def setAsap(value: Boolean): Self = StObject.set(x, "asap", value.asInstanceOf[js.Any])
      
      inline def setAsapUndefined: Self = StObject.set(x, "asap", js.undefined)
      
      inline def setChainId(value: js.Symbol): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      inline def setIgnorePubSubMode(value: Boolean): Self = StObject.set(x, "ignorePubSubMode", value.asInstanceOf[js.Any])
      
      inline def setIgnorePubSubModeUndefined: Self = StObject.set(x, "ignorePubSubMode", js.undefined)
      
      inline def setReturnBuffers(value: Boolean): Self = StObject.set(x, "returnBuffers", value.asInstanceOf[js.Any])
      
      inline def setReturnBuffersUndefined: Self = StObject.set(x, "returnBuffers", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  @js.native
  trait RedisCommandsQueue extends StObject {
    
    def addCommand[T](args: RedisCommandArguments): js.Promise[T] = js.native
    def addCommand[T](args: RedisCommandArguments, options: QueueCommandOptions): js.Promise[T] = js.native
    
    def flushAll(err: js.Error): Unit = js.native
    
    def flushWaitingForReply(err: js.Error): Unit = js.native
    
    def getCommandToSend(): js.UndefOr[RedisCommandArguments] = js.native
    
    def onReplyChunk(chunk: Buffer): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    def resubscribe(): js.UndefOr[js.Promise[Any]] = js.native
    
    @JSName("subscribe")
    def subscribe_true[T /* <: Boolean */](
      command: PubSubSubscribeCommands,
      channels: js.Array[RedisCommandArgument],
      listener: PubSubListener[T, String | Buffer]
    ): js.Promise[Unit] = js.native
    @JSName("subscribe")
    def subscribe_true[T /* <: Boolean */](
      command: PubSubSubscribeCommands,
      channels: js.Array[RedisCommandArgument],
      listener: PubSubListener[T, String | Buffer],
      returnBuffers: T
    ): js.Promise[Unit] = js.native
    @JSName("subscribe")
    def subscribe_true[T /* <: Boolean */](
      command: PubSubSubscribeCommands,
      channels: RedisCommandArgument,
      listener: PubSubListener[T, String | Buffer]
    ): js.Promise[Unit] = js.native
    @JSName("subscribe")
    def subscribe_true[T /* <: Boolean */](
      command: PubSubSubscribeCommands,
      channels: RedisCommandArgument,
      listener: PubSubListener[T, String | Buffer],
      returnBuffers: T
    ): js.Promise[Unit] = js.native
    
    def unsubscribe[T /* <: Boolean */](command: PubSubUnsubscribeCommands): js.Promise[Unit] = js.native
    def unsubscribe[T /* <: Boolean */](command: PubSubUnsubscribeCommands, channels: String): js.Promise[Unit] = js.native
    def unsubscribe[T /* <: Boolean */](command: PubSubUnsubscribeCommands, channels: String, listener: Unit, returnBuffers: T): js.Promise[Unit] = js.native
    def unsubscribe[T /* <: Boolean */](command: PubSubUnsubscribeCommands, channels: js.Array[String]): js.Promise[Unit] = js.native
    def unsubscribe[T /* <: Boolean */](command: PubSubUnsubscribeCommands, channels: js.Array[String], listener: Unit, returnBuffers: T): js.Promise[Unit] = js.native
    def unsubscribe[T /* <: Boolean */](command: PubSubUnsubscribeCommands, channels: Unit, listener: Unit, returnBuffers: T): js.Promise[Unit] = js.native
    @JSName("unsubscribe")
    def unsubscribe_true[T /* <: Boolean */](command: PubSubUnsubscribeCommands, channels: String, listener: PubSubListener[T, String | Buffer]): js.Promise[Unit] = js.native
    @JSName("unsubscribe")
    def unsubscribe_true[T /* <: Boolean */](
      command: PubSubUnsubscribeCommands,
      channels: String,
      listener: PubSubListener[T, String | Buffer],
      returnBuffers: T
    ): js.Promise[Unit] = js.native
    @JSName("unsubscribe")
    def unsubscribe_true[T /* <: Boolean */](
      command: PubSubUnsubscribeCommands,
      channels: js.Array[String],
      listener: PubSubListener[T, String | Buffer]
    ): js.Promise[Unit] = js.native
    @JSName("unsubscribe")
    def unsubscribe_true[T /* <: Boolean */](
      command: PubSubUnsubscribeCommands,
      channels: js.Array[String],
      listener: PubSubListener[T, String | Buffer],
      returnBuffers: T
    ): js.Promise[Unit] = js.native
    @JSName("unsubscribe")
    def unsubscribe_true[T /* <: Boolean */](command: PubSubUnsubscribeCommands, channels: Unit, listener: PubSubListener[T, String | Buffer]): js.Promise[Unit] = js.native
    @JSName("unsubscribe")
    def unsubscribe_true[T /* <: Boolean */](
      command: PubSubUnsubscribeCommands,
      channels: Unit,
      listener: PubSubListener[T, String | Buffer],
      returnBuffers: T
    ): js.Promise[Unit] = js.native
  }
}
