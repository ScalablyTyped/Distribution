package typings.pubnub.mod

import typings.pubnub.anon.Custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembershipsInputParameters extends GetObjectsParameters {
  
  var spaces: js.Array[Custom] = js.native
  
  var userId: String = js.native
}
object MembershipsInputParameters {
  
  @scala.inline
  def apply(spaces: js.Array[Custom], userId: String): MembershipsInputParameters = {
    val __obj = js.Dynamic.literal(spaces = spaces.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembershipsInputParameters]
  }
  
  @scala.inline
  implicit class MembershipsInputParametersMutableBuilder[Self <: MembershipsInputParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpaces(value: js.Array[Custom]): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacesVarargs(value: Custom*): Self = StObject.set(x, "spaces", js.Array(value :_*))
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
