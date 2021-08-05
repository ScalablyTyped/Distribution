package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchTemplateMetadataOption extends StObject {
  
  /**
    * The state of the metadata service: `enabled`, `disabled`.
    */
  var httpEndpoint: String
  
  /**
    * The desired HTTP PUT response hop limit for instance metadata requests.
    */
  var httpPutResponseHopLimit: Double
  
  /**
    * If session tokens are required: `optional`, `required`.
    */
  var httpTokens: String
}
object GetLaunchTemplateMetadataOption {
  
  inline def apply(httpEndpoint: String, httpPutResponseHopLimit: Double, httpTokens: String): GetLaunchTemplateMetadataOption = {
    val __obj = js.Dynamic.literal(httpEndpoint = httpEndpoint.asInstanceOf[js.Any], httpPutResponseHopLimit = httpPutResponseHopLimit.asInstanceOf[js.Any], httpTokens = httpTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateMetadataOption]
  }
  
  extension [Self <: GetLaunchTemplateMetadataOption](x: Self) {
    
    inline def setHttpEndpoint(value: String): Self = StObject.set(x, "httpEndpoint", value.asInstanceOf[js.Any])
    
    inline def setHttpPutResponseHopLimit(value: Double): Self = StObject.set(x, "httpPutResponseHopLimit", value.asInstanceOf[js.Any])
    
    inline def setHttpTokens(value: String): Self = StObject.set(x, "httpTokens", value.asInstanceOf[js.Any])
  }
}
