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
/* static members */
object Client {
  
  @JSImport("pulsar-client", "Client")
  @js.native
  val ^ : js.Any = js.native
  
  inline def setLogHandler(
    logHandler: js.Function4[/* level */ LogLevel, /* file */ String, /* line */ Double, /* message */ String, Unit]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogHandler")(logHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
