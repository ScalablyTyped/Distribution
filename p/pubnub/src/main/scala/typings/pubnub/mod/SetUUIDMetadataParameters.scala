package typings.pubnub.mod

import typings.pubnub.anon.CustomFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetUUIDMetadataParameters[Custom /* <: ObjectCustom */] extends StObject {
  
  var data: UUIDMetadata[Custom]
  
  var include: js.UndefOr[CustomFields] = js.undefined
  
  var uuid: js.UndefOr[String] = js.undefined
}
object SetUUIDMetadataParameters {
  
  @scala.inline
  def apply[Custom /* <: ObjectCustom */](data: UUIDMetadata[Custom]): SetUUIDMetadataParameters[Custom] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUUIDMetadataParameters[Custom]]
  }
  
  @scala.inline
  implicit class SetUUIDMetadataParametersMutableBuilder[Self <: SetUUIDMetadataParameters[?], Custom /* <: ObjectCustom */] (val x: Self & SetUUIDMetadataParameters[Custom]) extends AnyVal {
    
    @scala.inline
    def setData(value: UUIDMetadata[Custom]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude(value: CustomFields): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
