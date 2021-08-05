package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchTemplateInstanceMarketOption extends StObject {
  
  var marketType: String
  
  var spotOptions: js.Array[GetLaunchTemplateInstanceMarketOptionSpotOption]
}
object GetLaunchTemplateInstanceMarketOption {
  
  inline def apply(marketType: String, spotOptions: js.Array[GetLaunchTemplateInstanceMarketOptionSpotOption]): GetLaunchTemplateInstanceMarketOption = {
    val __obj = js.Dynamic.literal(marketType = marketType.asInstanceOf[js.Any], spotOptions = spotOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateInstanceMarketOption]
  }
  
  extension [Self <: GetLaunchTemplateInstanceMarketOption](x: Self) {
    
    inline def setMarketType(value: String): Self = StObject.set(x, "marketType", value.asInstanceOf[js.Any])
    
    inline def setSpotOptions(value: js.Array[GetLaunchTemplateInstanceMarketOptionSpotOption]): Self = StObject.set(x, "spotOptions", value.asInstanceOf[js.Any])
    
    inline def setSpotOptionsVarargs(value: GetLaunchTemplateInstanceMarketOptionSpotOption*): Self = StObject.set(x, "spotOptions", js.Array(value :_*))
  }
}
