package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.GossipMessage.ContentType
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGossipMessage extends StObject {
  
  /** GossipMessage content */
  var content: js.UndefOr[Uint8Array | Null] = js.native
  
  /** GossipMessage contentType */
  var contentType: js.UndefOr[ContentType | Null] = js.native
  
  /** GossipMessage timeToLive */
  var timeToLive: js.UndefOr[Double | Null] = js.native
}
object IGossipMessage {
  
  @scala.inline
  def apply(): IGossipMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipMessage]
  }
  
  @scala.inline
  implicit class IGossipMessageMutableBuilder[Self <: IGossipMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Uint8Array): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNull: Self = StObject.set(x, "content", null)
    
    @scala.inline
    def setContentType(value: ContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setTimeToLive(value: Double): Self = StObject.set(x, "timeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToLiveNull: Self = StObject.set(x, "timeToLive", null)
    
    @scala.inline
    def setTimeToLiveUndefined: Self = StObject.set(x, "timeToLive", js.undefined)
  }
}
