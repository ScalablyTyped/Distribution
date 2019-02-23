package typings
package atPulumiAwsLib.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/secretsmanager", "SecretVersion")
@js.native
class SecretVersion protected ()
  extends atPulumiAwsLib.secretsmanagerSecretVersionMod.SecretVersion {
  /**
    * Create a SecretVersion resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.secretsmanagerSecretVersionMod.SecretVersionArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.secretsmanagerSecretVersionMod.SecretVersionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/secretsmanager", "SecretVersion")
@js.native
object SecretVersion extends js.Object {
  /**
    * Get an existing SecretVersion resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.secretsmanagerSecretVersionMod.SecretVersion = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.secretsmanagerSecretVersionMod.SecretVersionState
  ): atPulumiAwsLib.secretsmanagerSecretVersionMod.SecretVersion = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.secretsmanagerSecretVersionMod.SecretVersionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.secretsmanagerSecretVersionMod.SecretVersion = js.native
}

