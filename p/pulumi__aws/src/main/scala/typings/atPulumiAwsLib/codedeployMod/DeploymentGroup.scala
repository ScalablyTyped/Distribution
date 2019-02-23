package typings
package atPulumiAwsLib.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codedeploy", "DeploymentGroup")
@js.native
class DeploymentGroup protected ()
  extends atPulumiAwsLib.codedeployDeploymentGroupMod.DeploymentGroup {
  /**
    * Create a DeploymentGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.codedeployDeploymentGroupMod.DeploymentGroupArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.codedeployDeploymentGroupMod.DeploymentGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.codedeployDeploymentGroupMod.DeploymentGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.codedeployDeploymentGroupMod.DeploymentGroupState
  ): atPulumiAwsLib.codedeployDeploymentGroupMod.DeploymentGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.codedeployDeploymentGroupMod.DeploymentGroupState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.codedeployDeploymentGroupMod.DeploymentGroup = js.native
}

