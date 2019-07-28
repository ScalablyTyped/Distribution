package typings.atPulumiAws.iamMod

import typings.atPulumiAws.iamSamlProviderMod.SamlProviderArgs
import typings.atPulumiAws.iamSamlProviderMod.SamlProviderState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam", "SamlProvider")
@js.native
class SamlProvider protected ()
  extends typings.atPulumiAws.iamSamlProviderMod.SamlProvider {
  /**
    * Create a SamlProvider resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SamlProviderArgs) = this()
  def this(name: String, args: SamlProviderArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/iam", "SamlProvider")
@js.native
object SamlProvider extends js.Object {
  /**
    * Get an existing SamlProvider resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.iamSamlProviderMod.SamlProvider = js.native
  def get(name: String, id: Input[ID], state: SamlProviderState): typings.atPulumiAws.iamSamlProviderMod.SamlProvider = js.native
  def get(name: String, id: Input[ID], state: SamlProviderState, opts: CustomResourceOptions): typings.atPulumiAws.iamSamlProviderMod.SamlProvider = js.native
  /**
    * Returns true if the given object is an instance of SamlProvider.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/samlProvider.SamlProvider */ Boolean = js.native
}

