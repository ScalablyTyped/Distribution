package typings.atPulumiAws.lightsailKeyPairMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lightsail/keyPair", "KeyPair")
@js.native
class KeyPair protected () extends CustomResource {
  /**
    * Create a KeyPair resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: KeyPairArgs) = this()
  def this(name: String, args: KeyPairArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the Lightsail key pair
    */
  val arn: Output[String] = js.native
  /**
    * The MD5 public key fingerprint for the encrypted
    * private key
    */
  val encryptedFingerprint: Output[String] = js.native
  /**
    * the private key material, base 64 encoded and
    * encrypted with the given `pgp_key`. This is only populated when creating a new
    * key and `pgp_key` is supplied
    */
  val encryptedPrivateKey: Output[String] = js.native
  /**
    * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
    */
  val fingerprint: Output[String] = js.native
  val name: Output[String] = js.native
  val namePrefix: Output[js.UndefOr[String]] = js.native
  /**
    * An optional PGP key to encrypt the resulting private
    * key material. Only used when creating a new key pair
    */
  val pgpKey: Output[js.UndefOr[String]] = js.native
  /**
    * the private key, base64 encoded. This is only populated
    * when creating a new key, and when no `pgp_key` is provided
    */
  val privateKey: Output[String] = js.native
  /**
    * The public key material. This public key will be
    * imported into Lightsail
    */
  val publicKey: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/lightsail/keyPair", "KeyPair")
@js.native
object KeyPair extends js.Object {
  /**
    * Get an existing KeyPair resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): KeyPair = js.native
  def get(name: String, id: Input[ID], state: KeyPairState): KeyPair = js.native
  def get(name: String, id: Input[ID], state: KeyPairState, opts: CustomResourceOptions): KeyPair = js.native
  /**
    * Returns true if the given object is an instance of KeyPair.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/keyPair.KeyPair */ Boolean = js.native
}

