package typings.pulsarClient.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pulsar-client", "MessageId")
@js.native
class MessageId () extends js.Object {
  
  /**
    * Serialize the message id into a Buffer for storing.
    */
  def serialize(): Buffer = js.native
}
/* static members */
@JSImport("pulsar-client", "MessageId")
@js.native
object MessageId extends js.Object {
  
  /**
    * Deserialize a message id object from a Buffer.
    * @param data
    */
  def deserialize(data: Buffer): MessageId = js.native
  
  /**
    * MessageId representing the earliest, or oldest available message stored in the topic.
    */
  def earliest(): MessageId = js.native
  
  /**
    * MessageId representing the latest, or last published message in the topic.
    */
  def latest(): MessageId = js.native
}
