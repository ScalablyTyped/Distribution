package typings
package atPulumiAwsLib.lightsailKeyPairMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPairState extends js.Object {
  /**
    * The ARN of the Lightsail key pair
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The MD5 public key fingerprint for the encrypted
    * private key
    */
  val encryptedFingerprint: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * the private key material, base 64 encoded and
    * encrypted with the given `pgp_key`. This is only populated when creating a new
    * key and `pgp_key` is supplied
    */
  val encryptedPrivateKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
    */
  val fingerprint: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val namePrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * An optional PGP key to encrypt the resulting private
    * key material. Only used when creating a new key pair
    */
  val pgpKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * the private key, base64 encoded. This is only populated
    * when creating a new key, and when no `pgp_key` is provided
    */
  val privateKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The public key material. This public key will be
    * imported into Lightsail
    */
  val publicKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object KeyPairState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    encryptedFingerprint: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    encryptedPrivateKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    fingerprint: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    pgpKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    privateKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    publicKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): KeyPairState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (encryptedFingerprint != null) __obj.updateDynamic("encryptedFingerprint")(encryptedFingerprint.asInstanceOf[js.Any])
    if (encryptedPrivateKey != null) __obj.updateDynamic("encryptedPrivateKey")(encryptedPrivateKey.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (pgpKey != null) __obj.updateDynamic("pgpKey")(pgpKey.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairState]
  }
}

