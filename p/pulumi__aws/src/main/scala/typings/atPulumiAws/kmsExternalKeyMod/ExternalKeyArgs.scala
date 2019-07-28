package typings.atPulumiAws.kmsExternalKeyMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalKeyArgs extends js.Object {
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
    * Base64 encoded 256-bit symmetric encryption key material to import. The CMK is permanently associated with this key material. The same key material can be reimported, but you cannot import different key material.
    */
  val keyMaterialBase64: js.UndefOr[Input[String]] = js.undefined
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

object ExternalKeyArgs {
  @scala.inline
  def apply(
    deletionWindowInDays: Input[Double] = null,
    description: Input[String] = null,
    enabled: Input[Boolean] = null,
    keyMaterialBase64: Input[String] = null,
    policy: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    validTo: Input[String] = null
  ): ExternalKeyArgs = {
    val __obj = js.Dynamic.literal()
    if (deletionWindowInDays != null) __obj.updateDynamic("deletionWindowInDays")(deletionWindowInDays.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (keyMaterialBase64 != null) __obj.updateDynamic("keyMaterialBase64")(keyMaterialBase64.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (validTo != null) __obj.updateDynamic("validTo")(validTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalKeyArgs]
  }
}

