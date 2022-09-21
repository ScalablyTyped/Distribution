package typings.pulsarClient.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pulsar-client", "MessageId")
@js.native
open class MessageId () extends StObject {
  
  def serialize(): Buffer = js.native
}
/* static members */
object MessageId {
  
  @JSImport("pulsar-client", "MessageId")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserialize(data: Buffer): MessageId = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any]).asInstanceOf[MessageId]
  
  inline def earliest(): MessageId = ^.asInstanceOf[js.Dynamic].applyDynamic("earliest")().asInstanceOf[MessageId]
  
  inline def latest(): MessageId = ^.asInstanceOf[js.Dynamic].applyDynamic("latest")().asInstanceOf[MessageId]
}
