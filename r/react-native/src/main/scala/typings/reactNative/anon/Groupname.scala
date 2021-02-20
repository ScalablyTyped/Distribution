package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Groupname extends StObject {
  
  var group_name: String = js.native
  
  var image: IsStored = js.native
  
  var location: Altitude = js.native
  
  var timestamp: Double = js.native
  
  var `type`: String = js.native
}
object Groupname {
  
  @scala.inline
  def apply(group_name: String, image: IsStored, location: Altitude, timestamp: Double, `type`: String): Groupname = {
    val __obj = js.Dynamic.literal(group_name = group_name.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groupname]
  }
  
  @scala.inline
  implicit class GroupnameMutableBuilder[Self <: Groupname] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup_name(value: String): Self = StObject.set(x, "group_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: IsStored): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Altitude): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
