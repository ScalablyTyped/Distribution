package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnConnectionRoute extends StObject {
  
  var destinationCidrBlock: js.UndefOr[Input[String]] = js.undefined
  
  var source: js.UndefOr[Input[String]] = js.undefined
  
  var state: js.UndefOr[Input[String]] = js.undefined
}
object VpnConnectionRoute {
  
  inline def apply(): VpnConnectionRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnectionRoute]
  }
  
  extension [Self <: VpnConnectionRoute](x: Self) {
    
    inline def setDestinationCidrBlock(value: Input[String]): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationCidrBlockUndefined: Self = StObject.set(x, "destinationCidrBlock", js.undefined)
    
    inline def setSource(value: Input[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
