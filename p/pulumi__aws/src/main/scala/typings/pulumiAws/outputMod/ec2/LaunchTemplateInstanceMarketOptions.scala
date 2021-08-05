package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateInstanceMarketOptions extends StObject {
  
  /**
    * The market type. Can be `spot`.
    */
  var marketType: js.UndefOr[String] = js.undefined
  
  /**
    * The options for [Spot Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html)
    */
  var spotOptions: js.UndefOr[LaunchTemplateInstanceMarketOptionsSpotOptions] = js.undefined
}
object LaunchTemplateInstanceMarketOptions {
  
  inline def apply(): LaunchTemplateInstanceMarketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptions]
  }
  
  extension [Self <: LaunchTemplateInstanceMarketOptions](x: Self) {
    
    inline def setMarketType(value: String): Self = StObject.set(x, "marketType", value.asInstanceOf[js.Any])
    
    inline def setMarketTypeUndefined: Self = StObject.set(x, "marketType", js.undefined)
    
    inline def setSpotOptions(value: LaunchTemplateInstanceMarketOptionsSpotOptions): Self = StObject.set(x, "spotOptions", value.asInstanceOf[js.Any])
    
    inline def setSpotOptionsUndefined: Self = StObject.set(x, "spotOptions", js.undefined)
  }
}
