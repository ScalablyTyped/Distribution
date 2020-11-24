package typings.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pulsar-client", "Producer")
@js.native
class Producer () extends js.Object {
  
  /**
    * Closes the producer and releases all resources allocated to it. If close() is called then no more messages will be accepted from the publisher.
    * This method will return Promise object, and when all pending publish requests have been persisted by Pulsar then run executor function.
    * If an error is thrown, no pending writes will be retried.
    */
  def close(): js.Promise[Null] = js.native
  
  /**
    * Sends message from send queue to Pulser broker. When the message is successfully acknowledged by the Pulsar broker,
    * or an error will be thrown, the Promise object run executor function.
    */
  def flush(): js.Promise[Null] = js.native
  
  /**
    * Publishes a message to the producer's topic. When the message is successfully acknowledged by the Pulsar broker,
    * or an error will be thrown, the Promise object run executor function.
    * @param message Message to be published.
    */
  def send(message: ProducerMessage): js.Promise[Null] = js.native
}
