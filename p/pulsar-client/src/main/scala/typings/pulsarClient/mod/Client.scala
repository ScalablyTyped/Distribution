package typings.pulsarClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pulsar-client", "Client")
@js.native
open class Client protected () extends StObject {
  def this(config: ClientConfig) = this()
  
  def close(): js.Promise[Null] = js.native
  
  def createProducer(config: ProducerConfig): js.Promise[Producer] = js.native
  
  def createReader(config: ReaderConfig): js.Promise[Reader] = js.native
  
  def subscribe(config: ConsumerConfig): js.Promise[Consumer] = js.native
}
