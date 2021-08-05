package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceMetadataOptions extends StObject {
  
  /**
    * Whether the metadata service is available. Can be `"enabled"` or `"disabled"`. (Default: `"enabled"`).
    */
  var httpEndpoint: String
  
  /**
    * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. Can be an integer from `1` to `64`. (Default: `1`).
    */
  var httpPutResponseHopLimit: Double
  
  /**
    * Whether or not the metadata service requires session tokens, also referred to as _Instance Metadata Service Version 2_. Can be `"optional"` or `"required"`. (Default: `"optional"`).
    */
  var httpTokens: String
}
object InstanceMetadataOptions {
  
  inline def apply(httpEndpoint: String, httpPutResponseHopLimit: Double, httpTokens: String): InstanceMetadataOptions = {
    val __obj = js.Dynamic.literal(httpEndpoint = httpEndpoint.asInstanceOf[js.Any], httpPutResponseHopLimit = httpPutResponseHopLimit.asInstanceOf[js.Any], httpTokens = httpTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceMetadataOptions]
  }
  
  extension [Self <: InstanceMetadataOptions](x: Self) {
    
    inline def setHttpEndpoint(value: String): Self = StObject.set(x, "httpEndpoint", value.asInstanceOf[js.Any])
    
    inline def setHttpPutResponseHopLimit(value: Double): Self = StObject.set(x, "httpPutResponseHopLimit", value.asInstanceOf[js.Any])
    
    inline def setHttpTokens(value: String): Self = StObject.set(x, "httpTokens", value.asInstanceOf[js.Any])
  }
}
