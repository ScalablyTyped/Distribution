package typings
package atPulumiAwsLib.lightsailKeyPairMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lightsail/keyPair", "KeyPair")
@js.native
class KeyPair protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a KeyPair resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: KeyPairArgs) = this()
  def this(name: java.lang.String, args: KeyPairArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the Lightsail key pair
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The MD5 public key fingerprint for the encrypted
    * private key
    */
  val encryptedFingerprint: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * the private key material, base 64 encoded and
    * encrypted with the given `pgp_key`. This is only populated when creating a new
    * key and `pgp_key` is supplied
    */
  val encryptedPrivateKey: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
    */
  val fingerprint: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val namePrefix: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * An optional PGP key to encrypt the resulting private
    * key material. Only used when creating a new key pair
    */
  val pgpKey: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * the private key, base64 encoded. This is only populated
    * when creating a new key, and when no `pgp_key` is provided
    */
  val privateKey: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The public key material. This public key will be
    * imported into Lightsail
    */
  val publicKey: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.lightsailKeyPairMod.KeyPair = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.lightsailKeyPairMod.KeyPairState
  ): atPulumiAwsLib.lightsailKeyPairMod.KeyPair = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.lightsailKeyPairMod.KeyPairState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.lightsailKeyPairMod.KeyPair = js.native
  /**
    * Returns true if the given object is an instance of KeyPair.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/keyPair.KeyPair */ scala.Boolean = js.native
}

