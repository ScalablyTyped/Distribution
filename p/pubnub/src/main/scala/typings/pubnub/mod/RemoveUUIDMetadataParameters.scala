package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveUUIDMetadataParameters extends StObject {
  
  var uuid: js.UndefOr[String] = js.native
}
object RemoveUUIDMetadataParameters {
  
  @scala.inline
  def apply(): RemoveUUIDMetadataParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveUUIDMetadataParameters]
  }
  
  @scala.inline
  implicit class RemoveUUIDMetadataParametersMutableBuilder[Self <: RemoveUUIDMetadataParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
