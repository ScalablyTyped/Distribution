package typings
package atPulumiAwsLib.kmsKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyArgs extends js.Object {
  /**
    * Duration in days after which the key is deleted
    * after destruction of the resource, must be between 7 and 30 days. Defaults to 30 days.
    */
  val deletionWindowInDays: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The description of the key as viewed in AWS console.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies whether [key rotation](http://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html)
    * is enabled. Defaults to false.
    */
  val enableKeyRotation: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies whether the key is enabled. Defaults to true.
    */
  val isEnabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies the intended use of the key.
    * Defaults to ENCRYPT_DECRYPT, and only symmetric encryption and decryption are supported.
    */
  val keyUsage: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A valid policy JSON document. For more information about building AWS IAM policy documents with Terraform, see the [AWS IAM Policy Document Guide](https://www.terraform.io/docs/providers/aws/guides/iam-policy-documents.html).
    */
  val policy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object KeyArgs {
  @scala.inline
  def apply(
    deletionWindowInDays: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    enableKeyRotation: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    isEnabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    keyUsage: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    policy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): KeyArgs = {
    val __obj = js.Dynamic.literal()
    if (deletionWindowInDays != null) __obj.updateDynamic("deletionWindowInDays")(deletionWindowInDays.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enableKeyRotation != null) __obj.updateDynamic("enableKeyRotation")(enableKeyRotation.asInstanceOf[js.Any])
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(isEnabled.asInstanceOf[js.Any])
    if (keyUsage != null) __obj.updateDynamic("keyUsage")(keyUsage.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyArgs]
  }
}

