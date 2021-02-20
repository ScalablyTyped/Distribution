package typings.stompit

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import typings.std.Error
import typings.stompit.clientMod.Ack
import typings.stompit.clientMod.Message
import typings.stompit.clientMod.MessageCallback
import typings.stompit.clientMod.SendOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelMod {
  
  @JSImport("stompit/lib/Channel", JSImport.Namespace)
  @js.native
  class ^ protected () extends Channel {
    def this(connectFailover: typings.stompit.connectFailoverMod.^) = this()
    def this(connectFailover: typings.stompit.connectFailoverMod.^, options: ChannelOptions) = this()
  }
  
  type Body = String | Buffer | js.Function0[Readable]
  
  @js.native
  trait Channel extends EventEmitter {
    
    def ack(message: Message): Unit = js.native
    def ack(
      message: Message,
      headers: js.UndefOr[scala.Nothing],
      sendOptions: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def ack(message: Message, headers: js.UndefOr[scala.Nothing], sendOptions: SendOptions): Unit = js.native
    def ack(
      message: Message,
      headers: js.UndefOr[scala.Nothing],
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def ack(message: Message, headers: js.Any): Unit = js.native
    def ack(
      message: Message,
      headers: js.Any,
      sendOptions: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def ack(message: Message, headers: js.Any, sendOptions: SendOptions): Unit = js.native
    def ack(
      message: Message,
      headers: js.Any,
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    
    def begin(): typings.stompit.transactionMod.^ = js.native
    def begin(headers: js.Any): typings.stompit.transactionMod.^ = js.native
    
    def close(error: Error): Unit = js.native
    
    def isEmpty(): Boolean = js.native
    
    def lock(): Unit = js.native
    
    def nack(message: Message): Unit = js.native
    def nack(
      message: Message,
      headers: js.UndefOr[scala.Nothing],
      sendOptions: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def nack(message: Message, headers: js.UndefOr[scala.Nothing], sendOptions: SendOptions): Unit = js.native
    def nack(
      message: Message,
      headers: js.UndefOr[scala.Nothing],
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def nack(message: Message, headers: js.Any): Unit = js.native
    def nack(
      message: Message,
      headers: js.Any,
      sendOptions: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def nack(message: Message, headers: js.Any, sendOptions: SendOptions): Unit = js.native
    def nack(
      message: Message,
      headers: js.Any,
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    
    def send(headers: js.Any, body: Body): this.type = js.native
    def send(headers: js.Any, body: Body, callback: js.Function1[/* err */ Error | Null, Unit]): this.type = js.native
    
    def setImplicitSubscription(id: Double): ChannelSubscription = js.native
    def setImplicitSubscription(id: Double, ack: js.UndefOr[scala.Nothing], msgListener: MessageCallback): ChannelSubscription = js.native
    def setImplicitSubscription(id: Double, ack: Ack): ChannelSubscription = js.native
    def setImplicitSubscription(id: Double, ack: Ack, msgListener: MessageCallback): ChannelSubscription = js.native
    
    def subscribe(
      headers: js.Any,
      onMessageCallback: js.Function3[
          /* err */ Error | Null, 
          /* message */ Message, 
          /* channelSubscription */ ChannelSubscription, 
          Unit
        ]
    ): ChannelSubscription = js.native
    
    def unlock(): Unit = js.native
  }
  
  @js.native
  trait ChannelOptions extends StObject {
    
    var alwaysConnected: js.UndefOr[Boolean] = js.native
    
    var recoverAfterApplicationError: js.UndefOr[Boolean] = js.native
  }
  object ChannelOptions {
    
    @scala.inline
    def apply(): ChannelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelOptions]
    }
    
    @scala.inline
    implicit class ChannelOptionsMutableBuilder[Self <: ChannelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysConnected(value: Boolean): Self = StObject.set(x, "alwaysConnected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysConnectedUndefined: Self = StObject.set(x, "alwaysConnected", js.undefined)
      
      @scala.inline
      def setRecoverAfterApplicationError(value: Boolean): Self = StObject.set(x, "recoverAfterApplicationError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecoverAfterApplicationErrorUndefined: Self = StObject.set(x, "recoverAfterApplicationError", js.undefined)
    }
  }
  
  @js.native
  trait ChannelSubscription extends StObject {
    
    def cancel(): Unit = js.native
    
    def unsubscribe(): Unit = js.native
  }
  object ChannelSubscription {
    
    @scala.inline
    def apply(cancel: () => Unit, unsubscribe: () => Unit): ChannelSubscription = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[ChannelSubscription]
    }
    
    @scala.inline
    implicit class ChannelSubscriptionMutableBuilder[Self <: ChannelSubscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
}
