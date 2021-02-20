package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeaveSpacesParameters extends GetObjectsParameters {
  
  var spaces: js.Array[String] = js.native
  
  var userId: String = js.native
}
object LeaveSpacesParameters {
  
  @scala.inline
  def apply(spaces: js.Array[String], userId: String): LeaveSpacesParameters = {
    val __obj = js.Dynamic.literal(spaces = spaces.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaveSpacesParameters]
  }
  
  @scala.inline
  implicit class LeaveSpacesParametersMutableBuilder[Self <: LeaveSpacesParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpaces(value: js.Array[String]): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacesVarargs(value: String*): Self = StObject.set(x, "spaces", js.Array(value :_*))
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
