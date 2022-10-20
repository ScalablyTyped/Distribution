package typings.pulsarClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pulsar-client", "Consumer")
@js.native
open class Consumer () extends StObject {
  
  def acknowledge(message: Message): js.Promise[Null] = js.native
  
  def acknowledgeCumulative(message: Message): js.Promise[Null] = js.native
  
  def acknowledgeCumulativeId(messageId: MessageId): js.Promise[Null] = js.native
  
  def acknowledgeId(messageId: MessageId): js.Promise[Null] = js.native
  
  def close(): js.Promise[Null] = js.native
  
  def isConnected(): Boolean = js.native
  
  def negativeAcknowledge(message: Message): Unit = js.native
  
  def negativeAcknowledgeId(messageId: MessageId): Unit = js.native
  
  def receive(): js.Promise[Message] = js.native
  def receive(timeout: Double): js.Promise[Message] = js.native
  
  def unsubscribe(): js.Promise[Null] = js.native
}
