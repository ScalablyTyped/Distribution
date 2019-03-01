package typings
package atPulumiAwsLib.ec2KeyPairMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPairState extends js.Object {
  /**
    * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
    */
  val fingerprint: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name for the key pair.
    */
  val keyName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `key_name`.
    */
  val keyNamePrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The public key material.
    */
  val publicKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object KeyPairState {
  @scala.inline
  def apply(
    fingerprint: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    keyName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    keyNamePrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    publicKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): KeyPairState = {
    val __obj = js.Dynamic.literal()
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    if (keyNamePrefix != null) __obj.updateDynamic("keyNamePrefix")(keyNamePrefix.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairState]
  }
}

