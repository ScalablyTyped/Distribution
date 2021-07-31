package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterConfigurationInfo extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
    */
  var arn: Input[String]
  
  /**
    * Revision of the MSK Configuration to use in the cluster.
    */
  var revision: Input[Double]
}
object ClusterConfigurationInfo {
  
  @scala.inline
  def apply(arn: Input[String], revision: Input[Double]): ClusterConfigurationInfo = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterConfigurationInfo]
  }
  
  @scala.inline
  implicit class ClusterConfigurationInfoMutableBuilder[Self <: ClusterConfigurationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Input[Double]): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
