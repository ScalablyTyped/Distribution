package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentGroupEc2TagSet extends js.Object {
  
  /**
    * Tag filters associated with the deployment group. See the AWS docs for details.
    */
  var ec2TagFilters: js.UndefOr[Input[js.Array[Input[DeploymentGroupEc2TagSetEc2TagFilter]]]] = js.native
}
object DeploymentGroupEc2TagSet {
  
  @scala.inline
  def apply(): DeploymentGroupEc2TagSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupEc2TagSet]
  }
  
  @scala.inline
  implicit class DeploymentGroupEc2TagSetOps[Self <: DeploymentGroupEc2TagSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEc2TagFiltersVarargs(value: Input[DeploymentGroupEc2TagSetEc2TagFilter]*): Self = this.set("ec2TagFilters", js.Array(value :_*))
    
    @scala.inline
    def setEc2TagFilters(value: Input[js.Array[Input[DeploymentGroupEc2TagSetEc2TagFilter]]]): Self = this.set("ec2TagFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2TagFilters: Self = this.set("ec2TagFilters", js.undefined)
  }
}
