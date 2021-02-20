package typings.pubnub.mod

import typings.pubnub.anon.CustomFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUserParameters extends StObject {
  
  var include: js.UndefOr[CustomFields] = js.native
  
  var userId: String = js.native
}
object GetUserParameters {
  
  @scala.inline
  def apply(userId: String): GetUserParameters = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserParameters]
  }
  
  @scala.inline
  implicit class GetUserParametersMutableBuilder[Self <: GetUserParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInclude(value: CustomFields): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
