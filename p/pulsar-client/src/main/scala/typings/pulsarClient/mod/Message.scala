package typings.pulsarClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pulsar-client", "Message")
@js.native
open class Message () extends StObject {
  
  def getData(): Buffer = js.native
  
  def getEventTimestamp(): Double = js.native
  
  def getMessageId(): MessageId = js.native
  
  def getPartitionKey(): String = js.native
  
  def getProperties(): StringDictionary[String] = js.native
  
  def getPublishTimestamp(): Double = js.native
  
  def getRedeliveryCount(): Double = js.native
  
  def getTopicName(): String = js.native
}
