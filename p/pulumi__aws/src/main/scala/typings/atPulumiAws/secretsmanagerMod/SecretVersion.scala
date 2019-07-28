package typings.atPulumiAws.secretsmanagerMod

import typings.atPulumiAws.secretsmanagerSecretVersionMod.SecretVersionArgs
import typings.atPulumiAws.secretsmanagerSecretVersionMod.SecretVersionState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/secretsmanager", "SecretVersion")
@js.native
class SecretVersion protected ()
  extends typings.atPulumiAws.secretsmanagerSecretVersionMod.SecretVersion {
  /**
    * Create a SecretVersion resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SecretVersionArgs) = this()
  def this(name: String, args: SecretVersionArgs, opts: CustomResourceOptions) = this()
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.secretsmanagerSecretVersionMod.SecretVersion = js.native
  def get(name: String, id: Input[ID], state: SecretVersionState): typings.atPulumiAws.secretsmanagerSecretVersionMod.SecretVersion = js.native
  def get(name: String, id: Input[ID], state: SecretVersionState, opts: CustomResourceOptions): typings.atPulumiAws.secretsmanagerSecretVersionMod.SecretVersion = js.native
  /**
    * Returns true if the given object is an instance of SecretVersion.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secretVersion.SecretVersion */ Boolean = js.native
}

