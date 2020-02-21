package typings.pulumiAws.keyMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyArgs extends js.Object {
  /**
    * Specifies whether the key contains a symmetric key or an asymmetric key pair and the encryption algorithms or signing algorithms that the key supports.
    * Valid values: `SYMMETRIC_DEFAULT`,  `RSA_2048`, `RSA_3072`, `RSA_4096`, `ECC_NIST_P256`, `ECC_NIST_P384`, `ECC_NIST_P521`, or `ECC_SECG_P256K1`. Defaults to `SYMMETRIC_DEFAULT`. For help with choosing a key spec, see the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html).
    */
  val customerMasterKeySpec: js.UndefOr[Input[String]] = js.native
  /**
    * Duration in days after which the key is deleted
    * after destruction of the resource, must be between 7 and 30 days. Defaults to 30 days.
    */
  val deletionWindowInDays: js.UndefOr[Input[Double]] = js.native
  /**
    * The description of the key as viewed in AWS console.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether [key rotation](http://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html)
    * is enabled. Defaults to false.
    */
  val enableKeyRotation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies whether the key is enabled. Defaults to true.
    */
  val isEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies the intended use of the key. Valid values: `ENCRYPT_DECRYPT` or `SIGN_VERIFY`.
    * Defaults to `ENCRYPT_DECRYPT`.
    */
  val keyUsage: js.UndefOr[Input[String]] = js.native
  val policy: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object KeyArgs {
  @scala.inline
  def apply(
    customerMasterKeySpec: Input[String] = null,
    deletionWindowInDays: Input[Double] = null,
    description: Input[String] = null,
    enableKeyRotation: Input[Boolean] = null,
    isEnabled: Input[Boolean] = null,
    keyUsage: Input[String] = null,
    policy: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): KeyArgs = {
    val __obj = js.Dynamic.literal()
    if (customerMasterKeySpec != null) __obj.updateDynamic("customerMasterKeySpec")(customerMasterKeySpec.asInstanceOf[js.Any])
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

