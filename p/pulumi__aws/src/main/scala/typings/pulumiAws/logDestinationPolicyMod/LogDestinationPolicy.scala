package typings.pulumiAws.logDestinationPolicyMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/cloudwatch/logDestinationPolicy", "LogDestinationPolicy")
@js.native
class LogDestinationPolicy protected () extends CustomResource {
  /**
    * Create a LogDestinationPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LogDestinationPolicyArgs) = this()
  def this(name: String, args: LogDestinationPolicyArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The policy document. This is a JSON formatted string.
    */
  val accessPolicy: Output_[String] = js.native
  
  /**
    * A name for the subscription filter
    */
  val destinationName: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/cloudwatch/logDestinationPolicy", "LogDestinationPolicy")
@js.native
object LogDestinationPolicy extends js.Object {
  
  /**
    * Get an existing LogDestinationPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): LogDestinationPolicy = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LogDestinationPolicy = js.native
  def get(name: String, id: Input[ID], state: LogDestinationPolicyState): LogDestinationPolicy = js.native
  def get(name: String, id: Input[ID], state: LogDestinationPolicyState, opts: CustomResourceOptions): LogDestinationPolicy = js.native
  
  /**
    * Returns true if the given object is an instance of LogDestinationPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logDestinationPolicy.LogDestinationPolicy */ Boolean = js.native
}
