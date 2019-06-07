package typings
package atPulumiAwsLib.cloudformationStackSetInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudformation/stackSetInstance", "StackSetInstance")
@js.native
class StackSetInstance protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a StackSetInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: StackSetInstanceArgs) = this()
  def this(name: java.lang.String, args: StackSetInstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Target AWS Account ID to create a Stack based on the Stack Set. Defaults to current account.
    */
  val accountId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Key-value map of input parameters to override from the Stack Set for this Instance.
    */
  val parameterOverrides: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]]] = js.native
  /**
    * Target AWS Region to create a Stack based on the Stack Set. Defaults to current region.
    */
  val region: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * During Terraform resource destroy, remove Instance from Stack Set while keeping the Stack and its associated resources. Must be enabled in Terraform state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new Stack Set. Defaults to `false`.
    */
  val retainStack: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Stack identifier
    */
  val stackId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Name of the Stack Set.
    */
  val stackSetName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloudformation/stackSetInstance", "StackSetInstance")
@js.native
object StackSetInstance extends js.Object {
  /**
    * Get an existing StackSetInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudformationStackSetInstanceMod.StackSetInstance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudformationStackSetInstanceMod.StackSetInstanceState
  ): atPulumiAwsLib.cloudformationStackSetInstanceMod.StackSetInstance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudformationStackSetInstanceMod.StackSetInstanceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cloudformationStackSetInstanceMod.StackSetInstance = js.native
  /**
    * Returns true if the given object is an instance of StackSetInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stackSetInstance.StackSetInstance */ scala.Boolean = js.native
}

