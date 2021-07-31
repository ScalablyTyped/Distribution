package typings.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  var component: Double
  
  var ip: String
  
  var port: Double
}
object Component {
  
  @scala.inline
  def apply(component: Double, ip: String, port: Double): Component = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
  
  @scala.inline
  implicit class ComponentMutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: Double): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
