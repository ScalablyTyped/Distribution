package typings
package atPulumiAwsLib.glueSecurityConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/glue/securityConfiguration", "SecurityConfiguration")
@js.native
class SecurityConfiguration protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a SecurityConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: SecurityConfigurationArgs) = this()
  def this(name: java.lang.String, args: SecurityConfigurationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Configuration block containing encryption configuration. Detailed below.
    */
  val encryptionConfiguration: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_CloudwatchEncryption] = js.native
  /**
    * Name of the security configuration.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/glue/securityConfiguration", "SecurityConfiguration")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.glueSecurityConfigurationMod.SecurityConfiguration = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.glueSecurityConfigurationMod.SecurityConfigurationState
  ): atPulumiAwsLib.glueSecurityConfigurationMod.SecurityConfiguration = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.glueSecurityConfigurationMod.SecurityConfigurationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.glueSecurityConfigurationMod.SecurityConfiguration = js.native
}

