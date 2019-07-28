package typings.atPulumiAws.kmsExternalKeyMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalKeyState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the key.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Duration in days after which the key is deleted after destruction of the resource. Must be between `7` and `30` days. Defaults to `30`.
    */
  val deletionWindowInDays: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Description of the key.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies whether the key is enabled. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Whether the key material expires. Empty when pending key material import, otherwise `KEY_MATERIAL_EXPIRES` or `KEY_MATERIAL_DOES_NOT_EXPIRE`.
    */
  val expirationModel: js.UndefOr[Input[String]] = js.undefined
  /**
    * Base64 encoded 256-bit symmetric encryption key material to import. The CMK is permanently associated with this key material. The same key material can be reimported, but you cannot import different key material.
    */
  val keyMaterialBase64: js.UndefOr[Input[String]] = js.undefined
  /**
    * The state of the CMK.
    */
  val keyState: js.UndefOr[Input[String]] = js.undefined
  /**
    * The cryptographic operations for which you can use the CMK.
    */
  val keyUsage: js.UndefOr[Input[String]] = js.undefined
  /**
    * A key policy JSON document. If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK.
    */
  val policy: js.UndefOr[Input[String]] = js.undefined
  /**
    * A key-value map of tags to assign to the key.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
    */
  val validTo: js.UndefOr[Input[String]] = js.undefined
}

object ExternalKeyState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    deletionWindowInDays: Input[Double] = null,
    description: Input[String] = null,
    enabled: Input[Boolean] = null,
    expirationModel: Input[String] = null,
    keyMaterialBase64: Input[String] = null,
    keyState: Input[String] = null,
    keyUsage: Input[String] = null,
    policy: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    validTo: Input[String] = null
  ): ExternalKeyState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (deletionWindowInDays != null) __obj.updateDynamic("deletionWindowInDays")(deletionWindowInDays.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (expirationModel != null) __obj.updateDynamic("expirationModel")(expirationModel.asInstanceOf[js.Any])
    if (keyMaterialBase64 != null) __obj.updateDynamic("keyMaterialBase64")(keyMaterialBase64.asInstanceOf[js.Any])
    if (keyState != null) __obj.updateDynamic("keyState")(keyState.asInstanceOf[js.Any])
    if (keyUsage != null) __obj.updateDynamic("keyUsage")(keyUsage.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (validTo != null) __obj.updateDynamic("validTo")(validTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalKeyState]
  }
}

