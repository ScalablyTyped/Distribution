package typings.atPulumiAws.codedeployMod

import typings.atPulumiAws.codedeployDeploymentGroupMod.DeploymentGroupArgs
import typings.atPulumiAws.codedeployDeploymentGroupMod.DeploymentGroupState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codedeploy", "DeploymentGroup")
@js.native
class DeploymentGroup protected ()
  extends typings.atPulumiAws.codedeployDeploymentGroupMod.DeploymentGroup {
  /**
    * Create a DeploymentGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DeploymentGroupArgs) = this()
  def this(name: String, args: DeploymentGroupArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/codedeploy", "DeploymentGroup")
@js.native
object DeploymentGroup extends js.Object {
  /**
    * Get an existing DeploymentGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.codedeployDeploymentGroupMod.DeploymentGroup = js.native
  def get(name: String, id: Input[ID], state: DeploymentGroupState): typings.atPulumiAws.codedeployDeploymentGroupMod.DeploymentGroup = js.native
  def get(name: String, id: Input[ID], state: DeploymentGroupState, opts: CustomResourceOptions): typings.atPulumiAws.codedeployDeploymentGroupMod.DeploymentGroup = js.native
  /**
    * Returns true if the given object is an instance of DeploymentGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/deploymentGroup.DeploymentGroup */ Boolean = js.native
}

