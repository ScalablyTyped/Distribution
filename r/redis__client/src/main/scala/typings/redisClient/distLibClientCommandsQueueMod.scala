package typings.redisClient

import typings.node.bufferMod.global.Buffer
import typings.redisClient.anon.Listener
import typings.redisClient.distLibClientPubSubMod.ChannelListeners
import typings.redisClient.distLibClientPubSubMod.PubSubListener
import typings.redisClient.distLibClientPubSubMod.PubSubType
import typings.redisClient.distLibClientPubSubMod.PubSubTypeListeners
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibClientCommandsQueueMod {
  
  @JSImport("@redis/client/dist/lib/client/commands-queue", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RedisCommandsQueue {
    def this(maxLength: Double, onShardedChannelMoved: OnShardedChannelMoved) = this()
    def this(maxLength: Null, onShardedChannelMoved: OnShardedChannelMoved) = this()
    def this(maxLength: Unit, onShardedChannelMoved: OnShardedChannelMoved) = this()
  }
  
  @js.native
  trait CommandWaitingForReply extends StObject {
    
    var channelsCounter: js.UndefOr[Double] = js.native
    
    def reject(err: Any): Unit = js.native
    
    def resolve(): Unit = js.native
    def resolve(reply: Any): Unit = js.native
    
    var returnBuffers: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait CommandWaitingToBeSent
    extends StObject
       with CommandWaitingForReply {
    
    var abort: js.UndefOr[Listener] = js.native
    
    var args: RedisCommandArguments = js.native
    
    var chainId: js.UndefOr[js.Symbol] = js.native
  }
  
  type OnShardedChannelMoved = js.Function2[/* channel */ String, /* listeners */ ChannelListeners, Unit]
  
  trait QueueCommandOptions extends StObject {
    
    var asap: js.UndefOr[Boolean] = js.undefined
    
    var chainId: js.UndefOr[js.Symbol] = js.undefined
    
    var returnBuffers: js.UndefOr[Boolean] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object QueueCommandOptions {
    
    inline def apply(): QueueCommandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueCommandOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueueCommandOptions] (val x: Self) extends AnyVal {
      
      inline def setAsap(value: Boolean): Self = StObject.set(x, "asap", value.asInstanceOf[js.Any])
      
      inline def setAsapUndefined: Self = StObject.set(x, "asap", js.undefined)
      
      inline def setChainId(value: js.Symbol): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
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
    
    def extendPubSubChannelListeners(`type`: PubSubType, channel: String, listeners: ChannelListeners): js.UndefOr[js.Promise[Unit]] = js.native
    
    def extendPubSubListeners(`type`: PubSubType, listeners: PubSubTypeListeners): js.UndefOr[js.Promise[Unit]] = js.native
    
    def flushAll(err: js.Error): Unit = js.native
    
    def flushWaitingForReply(err: js.Error): Unit = js.native
    
    def getCommandToSend(): js.UndefOr[RedisCommandArguments] = js.native
    
    def getPubSubListeners(`type`: PubSubType): PubSubTypeListeners = js.native
    
    def isPubSubActive: Boolean = js.native
    
    def onReplyChunk(chunk: Buffer): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    def resubscribe(): js.UndefOr[js.Promise[Any]] = js.native
    
    def subscribe[T /* <: Boolean */](`type`: PubSubType, channels: String, listener: PubSubListener[T]): js.UndefOr[js.Promise[Unit]] = js.native
    def subscribe[T /* <: Boolean */](`type`: PubSubType, channels: String, listener: PubSubListener[T], returnBuffers: T): js.UndefOr[js.Promise[Unit]] = js.native
    def subscribe[T /* <: Boolean */](`type`: PubSubType, channels: js.Array[String], listener: PubSubListener[T]): js.UndefOr[js.Promise[Unit]] = js.native
    def subscribe[T /* <: Boolean */](`type`: PubSubType, channels: js.Array[String], listener: PubSubListener[T], returnBuffers: T): js.UndefOr[js.Promise[Unit]] = js.native
    
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType): js.UndefOr[js.Promise[Unit]] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: String): js.UndefOr[js.Promise[Unit]] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: String, listener: Unit, returnBuffers: T): js.UndefOr[js.Promise[Unit]] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: String, listener: PubSubListener[T]): js.UndefOr[js.Promise[Unit]] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: String, listener: PubSubListener[T], returnBuffers: T): js.UndefOr[js.Promise[Unit]] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: js.Array[String]): js.UndefOr[js.Promise[Unit]] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: js.Array[String], listener: Unit, returnBuffers: T): js.UndefOr[js.Promise[Unit]] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: js.Array[String], listener: PubSubListener[T]): js.UndefOr[js.Promise[Unit]] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: js.Array[String], listener: PubSubListener[T], returnBuffers: T): js.UndefOr[js.Promise[Unit]] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: Unit, listener: Unit, returnBuffers: T): js.UndefOr[js.Promise[Unit]] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: Unit, listener: PubSubListener[T]): js.UndefOr[js.Promise[Unit]] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: Unit, listener: PubSubListener[T], returnBuffers: T): js.UndefOr[js.Promise[Unit]] = js.native
  }
}
