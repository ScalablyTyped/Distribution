package typings
package atPulumiAwsLib.ec2KeyPairMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/keyPair", "KeyPair")
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
  def this(name: java.lang.String, args: KeyPairArgs) = this()
  def this(name: java.lang.String, args: KeyPairArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
    */
  val fingerprint: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name for the key pair.
    */
  val keyName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `key_name`.
    */
  val keyNamePrefix: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The public key material.
    */
  val publicKey: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/keyPair", "KeyPair")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2KeyPairMod.KeyPair = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2KeyPairMod.KeyPairState
  ): atPulumiAwsLib.ec2KeyPairMod.KeyPair = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2KeyPairMod.KeyPairState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2KeyPairMod.KeyPair = js.native
  /**
    * Returns true if the given object is an instance of KeyPair.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/keyPair.KeyPair */ scala.Boolean = js.native
}

