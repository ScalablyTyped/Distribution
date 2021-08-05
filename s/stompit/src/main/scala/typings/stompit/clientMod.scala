package typings.stompit

import typings.node.streamMod.Duplex
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import typings.std.Error
import typings.stompit.incomingFrameStreamMod.IncomingFrame
import typings.stompit.socketMod.SocketOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("stompit/lib/Client", JSImport.Namespace)
  @js.native
  class ^ protected () extends Client {
    def this(transportSocket: Duplex) = this()
    def this(transportSocket: Duplex, options: SocketOptions) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stompit.stompitStrings.auto
    - typings.stompit.stompitStrings.client
    - typings.stompit.stompitStrings.`client-individual`
  */
  trait Ack extends StObject
  object Ack {
    
    inline def auto: typings.stompit.stompitStrings.auto = "auto".asInstanceOf[typings.stompit.stompitStrings.auto]
    
    inline def client: typings.stompit.stompitStrings.client = "client".asInstanceOf[typings.stompit.stompitStrings.client]
    
    inline def `client-individual`: typings.stompit.stompitStrings.`client-individual` = "client-individual".asInstanceOf[typings.stompit.stompitStrings.`client-individual`]
  }
  
  @js.native
  trait Client
    extends typings.stompit.socketMod.^ {
    
    def ack(message: Message): Unit = js.native
    def ack(message: Message, headers: js.Any): Unit = js.native
    def ack(
      message: Message,
      headers: js.Any,
      sendOptions: Unit,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def ack(message: Message, headers: js.Any, sendOptions: SendOptions): Unit = js.native
    def ack(
      message: Message,
      headers: js.Any,
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def ack(
      message: Message,
      headers: Unit,
      sendOptions: Unit,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def ack(message: Message, headers: Unit, sendOptions: SendOptions): Unit = js.native
    def ack(
      message: Message,
      headers: Unit,
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    
    def begin(): typings.stompit.transactionMod.^ = js.native
    def begin(headers: js.Any): typings.stompit.transactionMod.^ = js.native
    
    def connect(): Unit = js.native
    def connect(headers: js.Any): Unit = js.native
    def connect(headers: js.Any, callback: js.Function2[/* err */ Error | Null, /* client */ this.type, Unit]): Unit = js.native
    def connect(headers: Unit, callback: js.Function2[/* err */ Error | Null, /* client */ this.type, Unit]): Unit = js.native
    
    def disconnect(): Unit = js.native
    def disconnect(callback: js.Function2[/* error */ Error | Null, /* client */ this.type, Unit]): Unit = js.native
    
    def getOptions(): SocketOptions = js.native
    
    def getSubscription(id: Double): typings.stompit.subscriptionMod.^ = js.native
    
    def nack(message: Message): Unit = js.native
    def nack(message: Message, headers: js.Any): Unit = js.native
    def nack(
      message: Message,
      headers: js.Any,
      sendOptions: Unit,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def nack(message: Message, headers: js.Any, sendOptions: SendOptions): Unit = js.native
    def nack(
      message: Message,
      headers: js.Any,
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def nack(
      message: Message,
      headers: Unit,
      sendOptions: Unit,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def nack(message: Message, headers: Unit, sendOptions: SendOptions): Unit = js.native
    def nack(
      message: Message,
      headers: Unit,
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    
    def readEmptyBody(frame: typings.stompit.incomingFrameStreamMod.^): Unit = js.native
    def readEmptyBody(
      frame: typings.stompit.incomingFrameStreamMod.^,
      callback: js.Function1[/* client */ this.type, Unit]
    ): Unit = js.native
    
    def send(): Writable = js.native
    def send(headers: js.Any): Writable = js.native
    def send(headers: js.Any, options: SendOptions): Writable = js.native
    def send(headers: Unit, options: SendOptions): Writable = js.native
    
    def sendFrame(command: String, headers: js.Any, options: SendOptions): Writable = js.native
    def sendFrame(command: String, headers: Unit, options: SendOptions): Writable = js.native
    
    def sendString(): Unit = js.native
    def sendString(headers: js.Any): Unit = js.native
    def sendString(headers: js.Any, body: js.Any): Unit = js.native
    def sendString(
      headers: js.Any,
      body: js.Any,
      options: Unit,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def sendString(headers: js.Any, body: js.Any, options: SendOptions): Unit = js.native
    def sendString(
      headers: js.Any,
      body: js.Any,
      options: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def sendString(
      headers: js.Any,
      body: Unit,
      options: Unit,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def sendString(headers: js.Any, body: Unit, options: SendOptions): Unit = js.native
    def sendString(
      headers: js.Any,
      body: Unit,
      options: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def sendString(headers: Unit, body: js.Any): Unit = js.native
    def sendString(
      headers: Unit,
      body: js.Any,
      options: Unit,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def sendString(headers: Unit, body: js.Any, options: SendOptions): Unit = js.native
    def sendString(
      headers: Unit,
      body: js.Any,
      options: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def sendString(
      headers: Unit,
      body: Unit,
      options: Unit,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def sendString(headers: Unit, body: Unit, options: SendOptions): Unit = js.native
    def sendString(
      headers: Unit,
      body: Unit,
      options: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    
    def setImplicitSubscription(id: Double): typings.stompit.subscriptionMod.^ = js.native
    def setImplicitSubscription(id: Double, ack: Unit, messageListener: MessageCallback): typings.stompit.subscriptionMod.^ = js.native
    def setImplicitSubscription(id: Double, ack: Ack): typings.stompit.subscriptionMod.^ = js.native
    def setImplicitSubscription(id: Double, ack: Ack, messageListener: MessageCallback): typings.stompit.subscriptionMod.^ = js.native
    
    def subscribe(): typings.stompit.subscriptionMod.^ = js.native
    def subscribe(headers: js.Any): typings.stompit.subscriptionMod.^ = js.native
    def subscribe(headers: js.Any, messageListener: MessageCallback): typings.stompit.subscriptionMod.^ = js.native
    def subscribe(headers: Unit, messageListener: MessageCallback): typings.stompit.subscriptionMod.^ = js.native
  }
  
  @js.native
  trait Message extends IncomingFrame {
    
    def ack(): Unit = js.native
    
    def nack(): Unit = js.native
  }
  
  type MessageCallback = js.Function2[/* err */ Error | Null, /* message */ Message, Unit]
  
  trait SendOptions
    extends StObject
       with WritableOptions {
    
    def onError(err: Error): Unit
    
    def onReceipt(): Unit
  }
  object SendOptions {
    
    inline def apply(onError: Error => Unit, onReceipt: () => Unit): SendOptions = {
      val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError), onReceipt = js.Any.fromFunction0(onReceipt))
      __obj.asInstanceOf[SendOptions]
    }
    
    extension [Self <: SendOptions](x: Self) {
      
      inline def setOnError(value: Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnReceipt(value: () => Unit): Self = StObject.set(x, "onReceipt", js.Any.fromFunction0(value))
    }
  }
}
