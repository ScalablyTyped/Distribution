package typings.pulumiAws.outputMod.codedeploy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupEc2TagSet extends StObject {
  
  /**
    * Tag filters associated with the deployment group. See the AWS docs for details.
    */
  var ec2TagFilters: js.UndefOr[js.Array[DeploymentGroupEc2TagSetEc2TagFilter]] = js.undefined
}
object DeploymentGroupEc2TagSet {
  
  inline def apply(): DeploymentGroupEc2TagSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupEc2TagSet]
  }
  
  extension [Self <: DeploymentGroupEc2TagSet](x: Self) {
    
    inline def setEc2TagFilters(value: js.Array[DeploymentGroupEc2TagSetEc2TagFilter]): Self = StObject.set(x, "ec2TagFilters", value.asInstanceOf[js.Any])
    
    inline def setEc2TagFiltersUndefined: Self = StObject.set(x, "ec2TagFilters", js.undefined)
    
    inline def setEc2TagFiltersVarargs(value: DeploymentGroupEc2TagSetEc2TagFilter*): Self = StObject.set(x, "ec2TagFilters", js.Array(value :_*))
  }
}
