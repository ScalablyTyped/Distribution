package typings.stompit

import typings.node.streamMod.Writable
import typings.stompit.libClientMod.Ack
import typings.stompit.libClientMod.MessageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClientSubscriptionMod {
  
  @JSImport("stompit/lib/client/Subscription", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Subscription {
    def this(id: Double, ack: Ack, onMessageCallback: MessageCallback, client: typings.stompit.libClientMod.^) = this()
  }
  
  @js.native
  trait Subscription extends StObject {
    
    def getId(): Double = js.native
    
    def processMessageFrame(error: js.Error, frame: Writable): Unit = js.native
    def processMessageFrame(error: Null, frame: Writable): Unit = js.native
    
    def unsubscribe(): Unit = js.native
    def unsubscribe(headers: Any): Unit = js.native
  }
}
