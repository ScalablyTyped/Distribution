package typings.pulsarClient.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pulsar-client", "Message")
@js.native
class Message () extends js.Object {
  
  /**
    * Getter method of message data.
    */
  def getData(): Buffer = js.native
  
  /**
    * Getter method of event timestamp.
    */
  def getEventTimestamp(): Double = js.native
  
  /**
    * Getter method of message id object.
    */
  def getMessageId(): MessageId = js.native
  
  /**
    * Getter method of partition key.
    */
  def getPartitionKey(): String = js.native
  
  /**
    * Getter method of properties.
    */
  def getProperties(): MessageProperties = js.native
  
  /**
    * Getter method of publish timestamp.
    */
  def getPublishTimestamp(): Double = js.native
  
  /**
    * Getter method of topic name.
    */
  def getTopicName(): String = js.native
}
