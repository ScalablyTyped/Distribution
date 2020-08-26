package typings.pulumiAws.swfDomainMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/swf/domain", "Domain")
@js.native
class Domain protected () extends CustomResource {
  /**
    * Create a Domain resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DomainArgs) = this()
  def this(name: String, args: DomainArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN)
    */
  val arn: Output_[String] = js.native
  /**
    * The domain description.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of the domain. If omitted, this provider will assign a random, unique name.
    */
  val name: Output_[String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: Output_[js.UndefOr[String]] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * Length of time that SWF will continue to retain information about the workflow execution after the workflow execution is complete, must be between 0 and 90 days.
    */
  val workflowExecutionRetentionPeriodInDays: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/swf/domain", "Domain")
@js.native
object Domain extends js.Object {
  /**
    * Get an existing Domain resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Domain = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Domain = js.native
  def get(name: String, id: Input[ID], state: DomainState): Domain = js.native
  def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): Domain = js.native
  /**
    * Returns true if the given object is an instance of Domain.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/swf/domain.Domain */ Boolean = js.native
}

