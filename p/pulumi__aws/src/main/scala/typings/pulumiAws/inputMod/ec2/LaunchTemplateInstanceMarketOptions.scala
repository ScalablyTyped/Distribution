package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateInstanceMarketOptions extends StObject {
  
  /**
    * The market type. Can be `spot`.
    */
  var marketType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The options for [Spot Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html)
    */
  var spotOptions: js.UndefOr[Input[LaunchTemplateInstanceMarketOptionsSpotOptions]] = js.undefined
}
object LaunchTemplateInstanceMarketOptions {
  
  inline def apply(): LaunchTemplateInstanceMarketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptions]
  }
  
  extension [Self <: LaunchTemplateInstanceMarketOptions](x: Self) {
    
    inline def setMarketType(value: Input[String]): Self = StObject.set(x, "marketType", value.asInstanceOf[js.Any])
    
    inline def setMarketTypeUndefined: Self = StObject.set(x, "marketType", js.undefined)
    
    inline def setSpotOptions(value: Input[LaunchTemplateInstanceMarketOptionsSpotOptions]): Self = StObject.set(x, "spotOptions", value.asInstanceOf[js.Any])
    
    inline def setSpotOptionsUndefined: Self = StObject.set(x, "spotOptions", js.undefined)
  }
}
