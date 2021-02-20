package typings.roslib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name extends StObject {
  
  var name: java.lang.String = js.native
  
  var ros: typings.roslib.mod.Ros = js.native
}
object Name {
  
  @scala.inline
  def apply(name: java.lang.String, ros: typings.roslib.mod.Ros): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRos(value: typings.roslib.mod.Ros): Self = StObject.set(x, "ros", value.asInstanceOf[js.Any])
  }
}
