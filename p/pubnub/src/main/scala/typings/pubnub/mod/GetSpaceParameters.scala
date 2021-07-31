package typings.pubnub.mod

import typings.pubnub.anon.CustomFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSpaceParameters extends StObject {
  
  var include: js.UndefOr[CustomFields] = js.undefined
  
  var spaceId: String
}
object GetSpaceParameters {
  
  @scala.inline
  def apply(spaceId: String): GetSpaceParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSpaceParameters]
  }
  
  @scala.inline
  implicit class GetSpaceParametersMutableBuilder[Self <: GetSpaceParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInclude(value: CustomFields): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setSpaceId(value: String): Self = StObject.set(x, "spaceId", value.asInstanceOf[js.Any])
  }
}
