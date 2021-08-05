package typings.pulumiAws.outputMod.msk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterConfigurationInfo extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
    */
  var arn: String
  
  /**
    * Revision of the MSK Configuration to use in the cluster.
    */
  var revision: Double
}
object ClusterConfigurationInfo {
  
  inline def apply(arn: String, revision: Double): ClusterConfigurationInfo = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterConfigurationInfo]
  }
  
  extension [Self <: ClusterConfigurationInfo](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
