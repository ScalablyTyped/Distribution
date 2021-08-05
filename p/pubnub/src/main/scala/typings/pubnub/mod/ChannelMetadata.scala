package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent pubnub.pubnub.v2ObjectParam<Custom> */
/* Inlined parent std.Partial<pubnub.pubnub.ChannelMetadataFields> */
trait ChannelMetadata[Custom /* <: ObjectCustom */] extends StObject {
  
  var custom: js.UndefOr[Custom] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object ChannelMetadata {
  
  inline def apply[Custom /* <: ObjectCustom */](): ChannelMetadata[Custom] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMetadata[Custom]]
  }
  
  extension [Self <: ChannelMetadata[?], Custom /* <: ObjectCustom */](x: Self & ChannelMetadata[Custom]) {
    
    inline def setCustom(value: Custom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
