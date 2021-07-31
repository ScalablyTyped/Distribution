package typings.stompit

import typings.node.streamMod.Writable
import typings.std.Error
import typings.stompit.clientMod.Ack
import typings.stompit.clientMod.MessageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionMod {
  
  @JSImport("stompit/lib/client/Subscription", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Subscription {
    def this(id: Double, ack: Ack, onMessageCallback: MessageCallback, client: typings.stompit.clientMod.^) = this()
  }
  
  @js.native
  trait Subscription extends StObject {
    
    def getId(): Double = js.native
    
    def processMessageFrame(error: Null, frame: Writable): Unit = js.native
    def processMessageFrame(error: Error, frame: Writable): Unit = js.native
    
    def unsubscribe(): Unit = js.native
    def unsubscribe(headers: js.Any): Unit = js.native
  }
}
