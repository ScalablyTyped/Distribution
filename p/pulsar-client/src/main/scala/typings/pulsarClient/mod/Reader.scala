package typings.pulsarClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pulsar-client", "Reader")
@js.native
open class Reader () extends StObject {
  
  def close(): js.Promise[Null] = js.native
  
  def hasNext(): Boolean = js.native
  
  def isConnected(): Boolean = js.native
  
  def readNext(): js.Promise[Message] = js.native
  def readNext(timeout: Double): js.Promise[Message] = js.native
  
  def seek(messageId: MessageId): js.Promise[Null] = js.native
  
  def seekTimestamp(timestamp: Double): js.Promise[Null] = js.native
}
