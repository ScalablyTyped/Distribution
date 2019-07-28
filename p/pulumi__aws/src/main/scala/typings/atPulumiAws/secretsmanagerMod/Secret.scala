package typings.atPulumiAws.secretsmanagerMod

import typings.atPulumiAws.secretsmanagerSecretMod.SecretArgs
import typings.atPulumiAws.secretsmanagerSecretMod.SecretState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/secretsmanager", "Secret")
@js.native
class Secret protected ()
  extends typings.atPulumiAws.secretsmanagerSecretMod.Secret {
  /**
    * Create a Secret resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: SecretArgs) = this()
  def this(name: String, args: SecretArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/secretsmanager", "Secret")
@js.native
object Secret extends js.Object {
  /**
    * Get an existing Secret resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.secretsmanagerSecretMod.Secret = js.native
  def get(name: String, id: Input[ID], state: SecretState): typings.atPulumiAws.secretsmanagerSecretMod.Secret = js.native
  def get(name: String, id: Input[ID], state: SecretState, opts: CustomResourceOptions): typings.atPulumiAws.secretsmanagerSecretMod.Secret = js.native
  /**
    * Returns true if the given object is an instance of Secret.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secret.Secret */ Boolean = js.native
}

