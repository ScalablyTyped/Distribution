package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnConnectionRoute extends StObject {
  
  var destinationCidrBlock: js.UndefOr[Input[String]] = js.native
  
  var source: js.UndefOr[Input[String]] = js.native
  
  var state: js.UndefOr[Input[String]] = js.native
}
object VpnConnectionRoute {
  
  @scala.inline
  def apply(): VpnConnectionRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnectionRoute]
  }
  
  @scala.inline
  implicit class VpnConnectionRouteMutableBuilder[Self <: VpnConnectionRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationCidrBlock(value: Input[String]): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationCidrBlockUndefined: Self = StObject.set(x, "destinationCidrBlock", js.undefined)
    
    @scala.inline
    def setSource(value: Input[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
