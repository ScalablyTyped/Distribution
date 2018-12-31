package typings
package atPulumiAwsLib.licensemanagerLicenseConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/licensemanager/licenseConfiguration", "LicenseConfiguration")
@js.native
class LicenseConfiguration protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a LicenseConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: LicenseConfigurationArgs) = this()
  def this(name: java.lang.String, args: LicenseConfigurationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Description of the license configuration.
    */
  val description: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Number of licenses managed by the license configuration.
    */
  val licenseCount: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * Sets the number of available licenses as a hard limit.
    */
  val licenseCountHardLimit: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Dimension to use to track license inventory. Specify either `vCPU`, `Instance`, `Core` or `Socket`.
    */
  val licenseCountingType: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Array of configured License Manager rules.
    */
  val licenseRules: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * Name of the license configuration.
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
}

@JSImport("@pulumi/aws/licensemanager/licenseConfiguration", "LicenseConfiguration")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfiguration = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfigurationState
  ): atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfiguration = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfigurationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfiguration = js.native
}

