package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusPeerMessage extends StObject {
  
  /** ConsensusPeerMessage content */
  var content: js.UndefOr[Uint8Array | Null] = js.native
  
  /** ConsensusPeerMessage messageType */
  var messageType: js.UndefOr[String | Null] = js.native
  
  /** ConsensusPeerMessage name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** ConsensusPeerMessage version */
  var version: js.UndefOr[String | Null] = js.native
}
object IConsensusPeerMessage {
  
  @scala.inline
  def apply(): IConsensusPeerMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusPeerMessage]
  }
  
  @scala.inline
  implicit class IConsensusPeerMessageMutableBuilder[Self <: IConsensusPeerMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Uint8Array): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNull: Self = StObject.set(x, "content", null)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTypeNull: Self = StObject.set(x, "messageType", null)
    
    @scala.inline
    def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNull: Self = StObject.set(x, "version", null)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
