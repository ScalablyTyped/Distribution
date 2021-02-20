package typings.reactNavigationCore.anon

import typings.react.mod.ReactText
import typings.reactNavigationCore.reactNavigationCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends StObject {
  
  var location: js.Array[ReactText] = js.native
  
  var reason: String = js.native
  
  var serializable: `false` = js.native
}
object Location {
  
  @scala.inline
  def apply(location: js.Array[ReactText], reason: String, serializable: `false`): Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], serializable = serializable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: js.Array[ReactText]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationVarargs(value: ReactText*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializable(value: `false`): Self = StObject.set(x, "serializable", value.asInstanceOf[js.Any])
  }
}
