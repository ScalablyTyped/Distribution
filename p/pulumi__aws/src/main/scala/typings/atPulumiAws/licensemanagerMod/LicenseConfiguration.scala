package typings.atPulumiAws.licensemanagerMod

import typings.atPulumiAws.licensemanagerLicenseConfigurationMod.LicenseConfigurationArgs
import typings.atPulumiAws.licensemanagerLicenseConfigurationMod.LicenseConfigurationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/licensemanager", "LicenseConfiguration")
@js.native
class LicenseConfiguration protected ()
  extends typings.atPulumiAws.licensemanagerLicenseConfigurationMod.LicenseConfiguration {
  /**
    * Create a LicenseConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LicenseConfigurationArgs) = this()
  def this(name: String, args: LicenseConfigurationArgs, opts: CustomResourceOptions) = this()
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.licensemanagerLicenseConfigurationMod.LicenseConfiguration = js.native
  def get(name: String, id: Input[ID], state: LicenseConfigurationState): typings.atPulumiAws.licensemanagerLicenseConfigurationMod.LicenseConfiguration = js.native
  def get(name: String, id: Input[ID], state: LicenseConfigurationState, opts: CustomResourceOptions): typings.atPulumiAws.licensemanagerLicenseConfigurationMod.LicenseConfiguration = js.native
  /**
    * Returns true if the given object is an instance of LicenseConfiguration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/licensemanager/licenseConfiguration.LicenseConfiguration */ Boolean = js.native
}

