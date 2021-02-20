package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnConnectionRoute extends StObject {
  
  var destinationCidrBlock: String = js.native
  
  var source: String = js.native
  
  var state: String = js.native
}
object VpnConnectionRoute {
  
  @scala.inline
  def apply(destinationCidrBlock: String, source: String, state: String): VpnConnectionRoute = {
    val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnConnectionRoute]
  }
  
  @scala.inline
  implicit class VpnConnectionRouteMutableBuilder[Self <: VpnConnectionRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationCidrBlock(value: String): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
