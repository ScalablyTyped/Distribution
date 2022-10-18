package typings.pubnub.mod

import typings.pubnub.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetUUIDMetadataParameters[Custom /* <: ObjectCustom */] extends StObject {
  
  var data: UUIDMetadata[Custom]
  
  var include: js.UndefOr[`0`] = js.undefined
  
  var uuid: js.UndefOr[String] = js.undefined
}
object SetUUIDMetadataParameters {
  
  inline def apply[Custom /* <: ObjectCustom */](data: UUIDMetadata[Custom]): SetUUIDMetadataParameters[Custom] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUUIDMetadataParameters[Custom]]
  }
  
  extension [Self <: SetUUIDMetadataParameters[?], Custom /* <: ObjectCustom */](x: Self & SetUUIDMetadataParameters[Custom]) {
    
    inline def setData(value: UUIDMetadata[Custom]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setInclude(value: `0`): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
