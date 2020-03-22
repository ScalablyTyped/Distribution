package typings.pulumiAws.accessKeyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessKeyState extends js.Object {
  /**
    * The encrypted secret, base64 encoded, if `pgpKey` was specified.
    * > **NOTE:** The encrypted secret may be decrypted using the command line,
    */
  val encryptedSecret: js.UndefOr[Input[String]] = js.native
  /**
    * The fingerprint of the PGP key used to encrypt
    * the secret
    */
  val keyFingerprint: js.UndefOr[Input[String]] = js.native
  /**
    * Either a base-64 encoded PGP public key, or a
    * keybase username in the form `keybase:some_person_that_exists`, for use
    * in the `encryptedSecret` output attribute.
    */
  val pgpKey: js.UndefOr[Input[String]] = js.native
  /**
    * The secret access key. Note that this will be written
    * to the state file. If you use this, please protect your backend state file
    * judiciously. Alternatively, you may supply a `pgpKey` instead, which will
    * prevent the secret from being stored in plaintext, at the cost of preventing
    * the use of the secret key in automation.
    */
  val secret: js.UndefOr[Input[String]] = js.native
  /**
    * **DEPRECATED** The secret access key converted into an SES SMTP
    * password by applying [AWS's documented conversion
    *
    * @deprecated AWS SigV2 for SES SMTP passwords isy deprecated.
  Use 'ses_smtp_password_v4' for region-specific AWS SigV4 signed SES SMTP password instead.
    */
  val sesSmtpPassword: js.UndefOr[Input[String]] = js.native
  /**
    * The secret access key converted into an SES SMTP
    * password by applying [AWS's documented Sigv4 conversion
    * algorithm](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/smtp-credentials.html#smtp-credentials-convert).
    * As SigV4 is region specific, valid Provider regions are `ap-south-1`, `ap-southeast-2`, `eu-central-1`, `eu-west-1`, `us-east-1` and `us-west-2`. See current [AWS SES regions](https://docs.aws.amazon.com/general/latest/gr/rande.html#ses_region)
    */
  val sesSmtpPasswordV4: js.UndefOr[Input[String]] = js.native
  /**
    * The access key status to apply. Defaults to `Active`.
    * Valid values are `Active` and `Inactive`.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM user to associate with this access key.
    */
  val user: js.UndefOr[Input[String]] = js.native
}

object AccessKeyState {
  @scala.inline
  def apply(
    encryptedSecret: Input[String] = null,
    keyFingerprint: Input[String] = null,
    pgpKey: Input[String] = null,
    secret: Input[String] = null,
    sesSmtpPassword: Input[String] = null,
    sesSmtpPasswordV4: Input[String] = null,
    status: Input[String] = null,
    user: Input[String] = null
  ): AccessKeyState = {
    val __obj = js.Dynamic.literal()
    if (encryptedSecret != null) __obj.updateDynamic("encryptedSecret")(encryptedSecret.asInstanceOf[js.Any])
    if (keyFingerprint != null) __obj.updateDynamic("keyFingerprint")(keyFingerprint.asInstanceOf[js.Any])
    if (pgpKey != null) __obj.updateDynamic("pgpKey")(pgpKey.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (sesSmtpPassword != null) __obj.updateDynamic("sesSmtpPassword")(sesSmtpPassword.asInstanceOf[js.Any])
    if (sesSmtpPasswordV4 != null) __obj.updateDynamic("sesSmtpPasswordV4")(sesSmtpPasswordV4.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKeyState]
  }
}

