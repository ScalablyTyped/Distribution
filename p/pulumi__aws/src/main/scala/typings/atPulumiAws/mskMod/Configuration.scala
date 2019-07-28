package typings.atPulumiAws.mskMod

import typings.atPulumiAws.mskConfigurationMod.ConfigurationArgs
import typings.atPulumiAws.mskConfigurationMod.ConfigurationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/msk", "Configuration")
@js.native
class Configuration protected ()
  extends typings.atPulumiAws.mskConfigurationMod.Configuration {
  /**
    * Create a Configuration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ConfigurationArgs) = this()
  def this(name: String, args: ConfigurationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/msk", "Configuration")
@js.native
object Configuration extends js.Object {
  /**
    * Get an existing Configuration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.mskConfigurationMod.Configuration = js.native
  def get(name: String, id: Input[ID], state: ConfigurationState): typings.atPulumiAws.mskConfigurationMod.Configuration = js.native
  def get(name: String, id: Input[ID], state: ConfigurationState, opts: CustomResourceOptions): typings.atPulumiAws.mskConfigurationMod.Configuration = js.native
  /**
    * Returns true if the given object is an instance of Configuration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/msk/configuration.Configuration */ Boolean = js.native
}

