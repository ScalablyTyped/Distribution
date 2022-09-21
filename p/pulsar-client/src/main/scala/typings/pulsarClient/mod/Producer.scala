package typings.pulsarClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pulsar-client", "Producer")
@js.native
open class Producer () extends StObject {
  
  def close(): js.Promise[Null] = js.native
  
  def flush(): js.Promise[Null] = js.native
  
  def getProducerName(): String = js.native
  
  def getTopic(): String = js.native
  
  def isConnected(): Boolean = js.native
  
  def send(message: ProducerMessage): js.Promise[MessageId] = js.native
}
