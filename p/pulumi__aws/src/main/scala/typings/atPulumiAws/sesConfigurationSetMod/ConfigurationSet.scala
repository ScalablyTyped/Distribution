package typings.atPulumiAws.sesConfigurationSetMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses/configurationSet", "ConfigurationSet")
@js.native
class ConfigurationSet protected () extends CustomResource {
  /**
    * Create a ConfigurationSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ConfigurationSetArgs) = this()
  def this(name: String, args: ConfigurationSetArgs, opts: CustomResourceOptions) = this()
  /**
    * The name of the configuration set
    */
  val name: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ses/configurationSet", "ConfigurationSet")
@js.native
object ConfigurationSet extends js.Object {
  /**
    * Get an existing ConfigurationSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ConfigurationSet = js.native
  def get(name: String, id: Input[ID], state: ConfigurationSetState): ConfigurationSet = js.native
  def get(name: String, id: Input[ID], state: ConfigurationSetState, opts: CustomResourceOptions): ConfigurationSet = js.native
  /**
    * Returns true if the given object is an instance of ConfigurationSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/configurationSet.ConfigurationSet */ Boolean = js.native
}

