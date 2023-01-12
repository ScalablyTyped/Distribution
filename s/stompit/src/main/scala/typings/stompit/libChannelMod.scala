package typings.stompit

import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import typings.stompit.libClientMod.Ack
import typings.stompit.libClientMod.Message
import typings.stompit.libClientMod.MessageCallback
import typings.stompit.libClientMod.SendOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChannelMod {
  
  @JSImport("stompit/lib/Channel", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Channel {
    def this(connectFailover: typings.stompit.libConnectFailoverMod.^) = this()
    def this(connectFailover: typings.stompit.libConnectFailoverMod.^, options: ChannelOptions) = this()
  }
  
  type Body = String | Buffer | js.Function0[Readable]
  
  @js.native
  trait Channel extends EventEmitter {
    
    def ack(message: Message): Unit = js.native
    def ack(message: Message, headers: Any): Unit = js.native
    def ack(
      message: Message,
      headers: Any,
      sendOptions: Unit,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def ack(message: Message, headers: Any, sendOptions: SendOptions): Unit = js.native
    def ack(
      message: Message,
      headers: Any,
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def ack(
      message: Message,
      headers: Unit,
      sendOptions: Unit,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def ack(message: Message, headers: Unit, sendOptions: SendOptions): Unit = js.native
    def ack(
      message: Message,
      headers: Unit,
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    def begin(): typings.stompit.libClientTransactionMod.^ = js.native
    def begin(headers: Any): typings.stompit.libClientTransactionMod.^ = js.native
    
    def close(error: js.Error): Unit = js.native
    
    def isEmpty(): Boolean = js.native
    
    def lock(): Unit = js.native
    
    def nack(message: Message): Unit = js.native
    def nack(message: Message, headers: Any): Unit = js.native
    def nack(
      message: Message,
      headers: Any,
      sendOptions: Unit,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def nack(message: Message, headers: Any, sendOptions: SendOptions): Unit = js.native
    def nack(
      message: Message,
      headers: Any,
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def nack(
      message: Message,
      headers: Unit,
      sendOptions: Unit,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def nack(message: Message, headers: Unit, sendOptions: SendOptions): Unit = js.native
    def nack(
      message: Message,
      headers: Unit,
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    def send(headers: Any, body: Body): this.type = js.native
    def send(headers: Any, body: Body, callback: js.Function1[/* err */ js.Error | Null, Unit]): this.type = js.native
    
    def setImplicitSubscription(id: Double): ChannelSubscription = js.native
    def setImplicitSubscription(id: Double, ack: Unit, msgListener: MessageCallback): ChannelSubscription = js.native
    def setImplicitSubscription(id: Double, ack: Ack): ChannelSubscription = js.native
    def setImplicitSubscription(id: Double, ack: Ack, msgListener: MessageCallback): ChannelSubscription = js.native
    
    def subscribe(
      headers: Any,
      onMessageCallback: js.Function3[
          /* err */ js.Error | Null, 
          /* message */ Message, 
          /* channelSubscription */ ChannelSubscription, 
          Unit
        ]
    ): ChannelSubscription = js.native
    
    def unlock(): Unit = js.native
  }
  
  trait ChannelOptions extends StObject {
    
    var alwaysConnected: js.UndefOr[Boolean] = js.undefined
    
    var recoverAfterApplicationError: js.UndefOr[Boolean] = js.undefined
  }
  object ChannelOptions {
    
    inline def apply(): ChannelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChannelOptions] (val x: Self) extends AnyVal {
      
      inline def setAlwaysConnected(value: Boolean): Self = StObject.set(x, "alwaysConnected", value.asInstanceOf[js.Any])
      
      inline def setAlwaysConnectedUndefined: Self = StObject.set(x, "alwaysConnected", js.undefined)
      
      inline def setRecoverAfterApplicationError(value: Boolean): Self = StObject.set(x, "recoverAfterApplicationError", value.asInstanceOf[js.Any])
      
      inline def setRecoverAfterApplicationErrorUndefined: Self = StObject.set(x, "recoverAfterApplicationError", js.undefined)
    }
  }
  
  trait ChannelSubscription extends StObject {
    
    def cancel(): Unit
    
    def unsubscribe(): Unit
  }
  object ChannelSubscription {
    
    inline def apply(cancel: () => Unit, unsubscribe: () => Unit): ChannelSubscription = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[ChannelSubscription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChannelSubscription] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
}
