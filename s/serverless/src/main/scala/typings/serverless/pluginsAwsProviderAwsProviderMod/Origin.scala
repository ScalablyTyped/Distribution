package typings.serverless.pluginsAwsProviderAwsProviderMod

import typings.serverless.anon.OriginProtocolPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Origin extends StObject {
  
  var CustomOriginConfig: OriginProtocolPolicy
  
  var DomainName: String
  
  var OriginPath: String
}
object Origin {
  
  inline def apply(CustomOriginConfig: OriginProtocolPolicy, DomainName: String, OriginPath: String): Origin = {
    val __obj = js.Dynamic.literal(CustomOriginConfig = CustomOriginConfig.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], OriginPath = OriginPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origin]
  }
  
  extension [Self <: Origin](x: Self) {
    
    inline def setCustomOriginConfig(value: OriginProtocolPolicy): Self = StObject.set(x, "CustomOriginConfig", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setOriginPath(value: String): Self = StObject.set(x, "OriginPath", value.asInstanceOf[js.Any])
  }
}
