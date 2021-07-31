package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceMetadataOption extends StObject {
  
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
object GetInstanceMetadataOption {
  
  @scala.inline
  def apply(httpEndpoint: String, httpPutResponseHopLimit: Double, httpTokens: String): GetInstanceMetadataOption = {
    val __obj = js.Dynamic.literal(httpEndpoint = httpEndpoint.asInstanceOf[js.Any], httpPutResponseHopLimit = httpPutResponseHopLimit.asInstanceOf[js.Any], httpTokens = httpTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceMetadataOption]
  }
  
  @scala.inline
  implicit class GetInstanceMetadataOptionMutableBuilder[Self <: GetInstanceMetadataOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpEndpoint(value: String): Self = StObject.set(x, "httpEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpPutResponseHopLimit(value: Double): Self = StObject.set(x, "httpPutResponseHopLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpTokens(value: String): Self = StObject.set(x, "httpTokens", value.asInstanceOf[js.Any])
  }
}
