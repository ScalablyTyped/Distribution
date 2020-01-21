package typings.pulumiAws.sshKeyMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/sshKey", "SshKey")
@js.native
class SshKey protected () extends CustomResource {
  /**
    * Create a SshKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SshKeyArgs) = this()
  def this(name: String, args: SshKeyArgs, opts: CustomResourceOptions) = this()
  /**
    * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format, use `SSH`. To retrieve the public key in PEM format, use `PEM`.
    */
  val encoding: Output_[String] = js.native
  /**
    * The MD5 message digest of the SSH public key.
    */
  val fingerprint: Output_[String] = js.native
  /**
    * The SSH public key. The public key must be encoded in ssh-rsa format or PEM format.
    */
  val publicKey: Output_[String] = js.native
  /**
    * The unique identifier for the SSH public key.
    */
  val sshPublicKeyId: Output_[String] = js.native
  /**
    * The status to assign to the SSH public key. Active means the key can be used for authentication with an AWS CodeCommit repository. Inactive means the key cannot be used. Default is `active`.
    */
  val status: Output_[String] = js.native
  /**
    * The name of the IAM user to associate the SSH public key with.
    */
  val username: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/sshKey", "SshKey")
@js.native
object SshKey extends js.Object {
  /**
    * Get an existing SshKey resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): SshKey = js.native
  def get(name: String, id: Input[ID], state: SshKeyState): SshKey = js.native
  def get(name: String, id: Input[ID], state: SshKeyState, opts: CustomResourceOptions): SshKey = js.native
  /**
    * Returns true if the given object is an instance of SshKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/sshKey.SshKey */ Boolean = js.native
}

