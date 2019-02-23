package typings
package atPulumiAwsLib.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/licensemanager", "LicenseConfiguration")
@js.native
class LicenseConfiguration protected ()
  extends atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfiguration {
  /**
    * Create a LicenseConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfigurationArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfigurationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/licensemanager", "LicenseConfiguration")
@js.native
object LicenseConfiguration extends js.Object {
  /**
    * Get an existing LicenseConfiguration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfiguration = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfigurationState
  ): atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfiguration = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfigurationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfiguration = js.native
}

