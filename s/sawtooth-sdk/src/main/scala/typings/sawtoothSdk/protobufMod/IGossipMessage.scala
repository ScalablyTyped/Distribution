package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.GossipMessage.ContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGossipMessage extends StObject {
  
  /** GossipMessage content */
  var content: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** GossipMessage contentType */
  var contentType: js.UndefOr[ContentType | Null] = js.undefined
  
  /** GossipMessage timeToLive */
  var timeToLive: js.UndefOr[Double | Null] = js.undefined
}
object IGossipMessage {
  
  inline def apply(): IGossipMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGossipMessage] (val x: Self) extends AnyVal {
    
    inline def setContent(value: js.typedarray.Uint8Array): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setTimeToLive(value: Double): Self = StObject.set(x, "timeToLive", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveNull: Self = StObject.set(x, "timeToLive", null)
    
    inline def setTimeToLiveUndefined: Self = StObject.set(x, "timeToLive", js.undefined)
  }
}
