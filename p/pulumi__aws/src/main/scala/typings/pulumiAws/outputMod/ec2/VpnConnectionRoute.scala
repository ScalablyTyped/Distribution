package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnConnectionRoute extends StObject {
  
  var destinationCidrBlock: String
  
  var source: String
  
  var state: String
}
object VpnConnectionRoute {
  
  inline def apply(destinationCidrBlock: String, source: String, state: String): VpnConnectionRoute = {
    val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnConnectionRoute]
  }
  
  extension [Self <: VpnConnectionRoute](x: Self) {
    
    inline def setDestinationCidrBlock(value: String): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
