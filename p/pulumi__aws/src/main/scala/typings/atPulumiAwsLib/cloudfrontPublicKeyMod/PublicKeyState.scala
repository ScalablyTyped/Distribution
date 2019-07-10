package typings
package atPulumiAwsLib.cloudfrontPublicKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyState extends js.Object {
  /**
    * Internal value used by CloudFront to allow future updates to the public key configuration.
    */
  val callerReference: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * An optional comment about the public key.
    */
  val comment: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The encoded public key that you want to add to CloudFront to use with features like field-level encryption.
    */
  val encodedKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The current version of the public key. For example: `E2QWRUHAPOMQZL`.
    */
  val etag: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name for the public key. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object PublicKeyState {
  @scala.inline
  def apply(
    callerReference: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    comment: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    encodedKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    etag: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): PublicKeyState = {
    val __obj = js.Dynamic.literal()
    if (callerReference != null) __obj.updateDynamic("callerReference")(callerReference.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (encodedKey != null) __obj.updateDynamic("encodedKey")(encodedKey.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyState]
  }
}

