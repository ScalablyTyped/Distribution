package typings.atPulumiAws.emrMod

import typings.atPulumiAws.emrSecurityConfigurationMod.SecurityConfigurationArgs
import typings.atPulumiAws.emrSecurityConfigurationMod.SecurityConfigurationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/emr", "SecurityConfiguration")
@js.native
class SecurityConfiguration protected ()
  extends typings.atPulumiAws.emrSecurityConfigurationMod.SecurityConfiguration {
  /**
    * Create a SecurityConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SecurityConfigurationArgs) = this()
  def this(name: String, args: SecurityConfigurationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/emr", "SecurityConfiguration")
@js.native
object SecurityConfiguration extends js.Object {
  /**
    * Get an existing SecurityConfiguration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.emrSecurityConfigurationMod.SecurityConfiguration = js.native
  def get(name: String, id: Input[ID], state: SecurityConfigurationState): typings.atPulumiAws.emrSecurityConfigurationMod.SecurityConfiguration = js.native
  def get(name: String, id: Input[ID], state: SecurityConfigurationState, opts: CustomResourceOptions): typings.atPulumiAws.emrSecurityConfigurationMod.SecurityConfiguration = js.native
  /**
    * Returns true if the given object is an instance of SecurityConfiguration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/securityConfiguration.SecurityConfiguration */ Boolean = js.native
}

