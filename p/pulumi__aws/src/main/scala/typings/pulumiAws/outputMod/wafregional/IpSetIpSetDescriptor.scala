package typings.pulumiAws.outputMod.wafregional

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpSetIpSetDescriptor extends StObject {
  
  /**
    * The string like IPV4 or IPV6.
    */
  var `type`: String = js.native
  
  /**
    * The CIDR notation.
    */
  var value: String = js.native
}
object IpSetIpSetDescriptor {
  
  @scala.inline
  def apply(`type`: String, value: String): IpSetIpSetDescriptor = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpSetIpSetDescriptor]
  }
  
  @scala.inline
  implicit class IpSetIpSetDescriptorMutableBuilder[Self <: IpSetIpSetDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
