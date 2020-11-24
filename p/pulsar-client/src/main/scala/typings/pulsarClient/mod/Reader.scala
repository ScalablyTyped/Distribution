package typings.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pulsar-client", "Reader")
@js.native
class Reader () extends js.Object {
  
  /**
    * Closes the reader, disabling its ability to receive messages from the broker.
    */
  def close(): js.Promise[Null] = js.native
  
  /**
    * Return whether Broker has next message in target topic.
    */
  def hasNext(): Boolean = js.native
  
  /**
    * Receives the next message on the topic (analogous to the receive method for consumers)
    * with optional specific timeout in milliseconds.
    * @param timeout Wait timeout in milliseconds.
    */
  def readNext(): js.Promise[Message] = js.native
  def readNext(timeout: Double): js.Promise[Message] = js.native
}
