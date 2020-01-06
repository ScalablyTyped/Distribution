package typings.atPulumiAws.lambdaMod

import typings.atPulumiAws.lambdaProvisionedConcurrencyConfigMod.ProvisionedConcurrencyConfigArgs
import typings.atPulumiAws.lambdaProvisionedConcurrencyConfigMod.ProvisionedConcurrencyConfigState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda", "ProvisionedConcurrencyConfig")
@js.native
class ProvisionedConcurrencyConfig protected ()
  extends typings.atPulumiAws.lambdaProvisionedConcurrencyConfigMod.ProvisionedConcurrencyConfig {
  /**
    * Create a ProvisionedConcurrencyConfig resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ProvisionedConcurrencyConfigArgs) = this()
  def this(name: String, args: ProvisionedConcurrencyConfigArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/lambda", "ProvisionedConcurrencyConfig")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.lambdaProvisionedConcurrencyConfigMod.ProvisionedConcurrencyConfig = js.native
  def get(name: String, id: Input[ID], state: ProvisionedConcurrencyConfigState): typings.atPulumiAws.lambdaProvisionedConcurrencyConfigMod.ProvisionedConcurrencyConfig = js.native
  def get(name: String, id: Input[ID], state: ProvisionedConcurrencyConfigState, opts: CustomResourceOptions): typings.atPulumiAws.lambdaProvisionedConcurrencyConfigMod.ProvisionedConcurrencyConfig = js.native
  /**
    * Returns true if the given object is an instance of ProvisionedConcurrencyConfig.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/provisionedConcurrencyConfig.ProvisionedConcurrencyConfig */ Boolean = js.native
}

