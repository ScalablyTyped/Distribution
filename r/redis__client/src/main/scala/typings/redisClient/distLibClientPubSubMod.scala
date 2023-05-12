package typings.redisClient

import typings.node.bufferMod.global.Buffer
import typings.redisClient.anon.Args
import typings.redisClient.anon.ChannelsCounter
import typings.redisClient.anon.FnCall
import typings.redisClient.anon.FnCallTypeChannelsListenerReturnBuffers
import typings.redisClient.anon.Reject
import typings.redisClient.anon.Resolve
import typings.redisClient.redisClientBooleans.`false`
import typings.redisClient.redisClientBooleans.`true`
import typings.std.Map
import typings.std.ReturnType
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibClientPubSubMod {
  
  @JSImport("@redis/client/dist/lib/client/pub-sub", "PubSub")
  @js.native
  open class PubSub () extends StObject {
    
    def extendChannelListeners(`type`: PubSubType, channel: String, listeners: ChannelListeners): js.UndefOr[Resolve] = js.native
    
    def extendTypeListeners(`type`: PubSubType, listeners: PubSubTypeListeners): js.UndefOr[Reject] = js.native
    
    def getTypeListeners(`type`: PubSubType): PubSubTypeListeners = js.native
    
    def handleMessageReply(reply: js.Array[Buffer]): Boolean = js.native
    
    def isActive: Boolean = js.native
    
    /* private */ var `private`: Any = js.native
    
    def removeShardedListeners(channel: String): ChannelListeners = js.native
    
    def reset(): Unit = js.native
    
    def resubscribe(): js.Array[PubSubCommand] = js.native
    
    def subscribe[T /* <: Boolean */](`type`: PubSubType, channels: String, listener: PubSubListener[T]): js.UndefOr[Args] = js.native
    def subscribe[T /* <: Boolean */](`type`: PubSubType, channels: String, listener: PubSubListener[T], returnBuffers: T): js.UndefOr[Args] = js.native
    def subscribe[T /* <: Boolean */](`type`: PubSubType, channels: js.Array[String], listener: PubSubListener[T]): js.UndefOr[Args] = js.native
    def subscribe[T /* <: Boolean */](`type`: PubSubType, channels: js.Array[String], listener: PubSubListener[T], returnBuffers: T): js.UndefOr[Args] = js.native
    
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType): js.UndefOr[ChannelsCounter] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: String): js.UndefOr[ChannelsCounter] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: String, listener: Unit, returnBuffers: T): js.UndefOr[ChannelsCounter] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: String, listener: PubSubListener[T]): js.UndefOr[ChannelsCounter] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: String, listener: PubSubListener[T], returnBuffers: T): js.UndefOr[ChannelsCounter] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: js.Array[String]): js.UndefOr[ChannelsCounter] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: js.Array[String], listener: Unit, returnBuffers: T): js.UndefOr[ChannelsCounter] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: js.Array[String], listener: PubSubListener[T]): js.UndefOr[ChannelsCounter] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: js.Array[String], listener: PubSubListener[T], returnBuffers: T): js.UndefOr[ChannelsCounter] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: Unit, listener: Unit, returnBuffers: T): js.UndefOr[ChannelsCounter] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: Unit, listener: PubSubListener[T]): js.UndefOr[ChannelsCounter] = js.native
    def unsubscribe[T /* <: Boolean */](`type`: PubSubType, channels: Unit, listener: PubSubListener[T], returnBuffers: T): js.UndefOr[ChannelsCounter] = js.native
  }
  /* static members */
  object PubSub {
    
    @JSImport("@redis/client/dist/lib/client/pub-sub", "PubSub")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isShardedUnsubscribe(reply: js.Array[Buffer]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isShardedUnsubscribe")(reply.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isStatusReply(reply: js.Array[Buffer]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStatusReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @js.native
  sealed trait PubSubType extends StObject
  @JSImport("@redis/client/dist/lib/client/pub-sub", "PubSubType")
  @js.native
  object PubSubType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PubSubType & String] = js.native
    
    @js.native
    sealed trait CHANNELS
      extends StObject
         with PubSubType
    /* "CHANNELS" */ val CHANNELS: typings.redisClient.distLibClientPubSubMod.PubSubType.CHANNELS & String = js.native
    
    @js.native
    sealed trait PATTERNS
      extends StObject
         with PubSubType
    /* "PATTERNS" */ val PATTERNS: typings.redisClient.distLibClientPubSubMod.PubSubType.PATTERNS & String = js.native
    
    @js.native
    sealed trait SHARDED
      extends StObject
         with PubSubType
    /* "SHARDED" */ val SHARDED: typings.redisClient.distLibClientPubSubMod.PubSubType.SHARDED & String = js.native
  }
  
  trait ChannelListeners extends StObject {
    
    var buffers: Set[PubSubListener[`true`]]
    
    var strings: Set[PubSubListener[`false`]]
    
    var unsubscribing: Boolean
  }
  object ChannelListeners {
    
    inline def apply(
      buffers: Set[PubSubListener[`true`]],
      strings: Set[PubSubListener[`false`]],
      unsubscribing: Boolean
    ): ChannelListeners = {
      val __obj = js.Dynamic.literal(buffers = buffers.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any], unsubscribing = unsubscribing.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelListeners]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChannelListeners] (val x: Self) extends AnyVal {
      
      inline def setBuffers(value: Set[PubSubListener[`true`]]): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
      
      inline def setStrings(value: Set[PubSubListener[`false`]]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribing(value: Boolean): Self = StObject.set(x, "unsubscribing", value.asInstanceOf[js.Any])
    }
  }
  
  type PubSubCommand = ReturnType[
    FnCall | FnCallTypeChannelsListenerReturnBuffers | (js.Function2[/* type */ PubSubType, /* listeners */ PubSubTypeListeners, js.UndefOr[Reject]])
  ]
  
  type PubSubListener[RETURN_BUFFERS /* <: Boolean */] = js.Function2[
    /* import warning: importer.ImportType#apply Failed type conversion: RETURN_BUFFERS extends true ? node.buffer.<global>.Buffer : string */ /* message */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: RETURN_BUFFERS extends true ? node.buffer.<global>.Buffer : string */ /* channel */ js.Any, 
    Any
  ]
  
  type PubSubTypeListeners = Map[String, ChannelListeners]
}
