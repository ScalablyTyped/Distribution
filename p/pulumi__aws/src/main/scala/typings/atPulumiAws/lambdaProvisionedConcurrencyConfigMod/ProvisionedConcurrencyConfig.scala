package typings.atPulumiAws.lambdaProvisionedConcurrencyConfigMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda/provisionedConcurrencyConfig", "ProvisionedConcurrencyConfig")
@js.native
class ProvisionedConcurrencyConfig protected () extends CustomResource {
  /**
    * Create a ProvisionedConcurrencyConfig resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ProvisionedConcurrencyConfigArgs) = this()
  def this(name: String, args: ProvisionedConcurrencyConfigArgs, opts: CustomResourceOptions) = this()
  /**
    * Name or Amazon Resource Name (ARN) of the Lambda Function.
    */
  val functionName: Output[String] = js.native
  /**
    * Amount of capacity to allocate. Must be greater than or equal to `1`.
    */
  val provisionedConcurrentExecutions: Output[Double] = js.native
  /**
    * Lambda Function version or Lambda Alias name.
    */
  val qualifier: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/lambda/provisionedConcurrencyConfig", "ProvisionedConcurrencyConfig")
@js.native
object ProvisionedConcurrencyConfig extends js.Object {
  /**
    * Get an existing ProvisionedConcurrencyConfig resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ProvisionedConcurrencyConfig = js.native
  def get(name: String, id: Input[ID], state: ProvisionedConcurrencyConfigState): ProvisionedConcurrencyConfig = js.native
  def get(name: String, id: Input[ID], state: ProvisionedConcurrencyConfigState, opts: CustomResourceOptions): ProvisionedConcurrencyConfig = js.native
  /**
    * Returns true if the given object is an instance of ProvisionedConcurrencyConfig.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/provisionedConcurrencyConfig.ProvisionedConcurrencyConfig */ Boolean = js.native
}

