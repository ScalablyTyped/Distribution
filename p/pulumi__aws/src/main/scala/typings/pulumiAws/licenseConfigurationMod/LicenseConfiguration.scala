package typings.pulumiAws.licenseConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/licensemanager/licenseConfiguration", "LicenseConfiguration")
@js.native
class LicenseConfiguration protected () extends CustomResource {
  /**
    * Create a LicenseConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LicenseConfigurationArgs) = this()
  def this(name: String, args: LicenseConfigurationArgs, opts: CustomResourceOptions) = this()
  /**
    * Description of the license configuration.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * Number of licenses managed by the license configuration.
    */
  val licenseCount: Output_[js.UndefOr[Double]] = js.native
  /**
    * Sets the number of available licenses as a hard limit.
    */
  val licenseCountHardLimit: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Dimension to use to track license inventory. Specify either `vCPU`, `Instance`, `Core` or `Socket`.
    */
  val licenseCountingType: Output_[String] = js.native
  /**
    * Array of configured License Manager rules.
    */
  val licenseRules: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Name of the license configuration.
    */
  val name: Output_[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
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
  def get(name: String, id: Input[ID]): LicenseConfiguration = js.native
  def get(name: String, id: Input[ID], state: LicenseConfigurationState): LicenseConfiguration = js.native
  def get(name: String, id: Input[ID], state: LicenseConfigurationState, opts: CustomResourceOptions): LicenseConfiguration = js.native
  /**
    * Returns true if the given object is an instance of LicenseConfiguration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/licensemanager/licenseConfiguration.LicenseConfiguration */ Boolean = js.native
}

