package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveUUIDMetadataParameters extends StObject {
  
  var uuid: js.UndefOr[String] = js.undefined
}
object RemoveUUIDMetadataParameters {
  
  inline def apply(): RemoveUUIDMetadataParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveUUIDMetadataParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveUUIDMetadataParameters] (val x: Self) extends AnyVal {
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
