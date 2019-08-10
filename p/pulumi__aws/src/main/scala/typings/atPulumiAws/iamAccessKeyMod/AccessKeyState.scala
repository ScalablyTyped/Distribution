package typings.atPulumiAws.iamAccessKeyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessKeyState extends js.Object {
  /**
    * The encrypted secret, base64 encoded.
    * > **NOTE:** The encrypted secret may be decrypted using the command line,
    * for example: `... | base64 --decode | keybase pgp decrypt`.
    */
  val encryptedSecret: js.UndefOr[Input[String]] = js.undefined
  /**
    * The fingerprint of the PGP key used to encrypt
    * the secret
    */
  val keyFingerprint: js.UndefOr[Input[String]] = js.undefined
  /**
    * Either a base-64 encoded PGP public key, or a
    * keybase username in the form `keybase:some_person_that_exists`.
    */
  val pgpKey: js.UndefOr[Input[String]] = js.undefined
  /**
    * The secret access key. Note that this will be written
    * to the state file. Please supply a `pgpKey` instead, which will prevent the
    * secret from being stored in plain text
    */
  val secret: js.UndefOr[Input[String]] = js.undefined
  /**
    * The secret access key converted into an SES SMTP
    * password by applying [AWS's documented conversion
    * algorithm](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/smtp-credentials.html#smtp-credentials-convert).
    */
  val sesSmtpPassword: js.UndefOr[Input[String]] = js.undefined
  /**
    * The access key status to apply. Defaults to `Active`.
    * Valid values are `Active` and `Inactive`.
    */
  val status: js.UndefOr[Input[String]] = js.undefined
  /**
    * The IAM user to associate with this access key.
    */
  val user: js.UndefOr[Input[String]] = js.undefined
}

object AccessKeyState {
  @scala.inline
  def apply(
    encryptedSecret: Input[String] = null,
    keyFingerprint: Input[String] = null,
    pgpKey: Input[String] = null,
    secret: Input[String] = null,
    sesSmtpPassword: Input[String] = null,
    status: Input[String] = null,
    user: Input[String] = null
  ): AccessKeyState = {
    val __obj = js.Dynamic.literal()
    if (encryptedSecret != null) __obj.updateDynamic("encryptedSecret")(encryptedSecret.asInstanceOf[js.Any])
    if (keyFingerprint != null) __obj.updateDynamic("keyFingerprint")(keyFingerprint.asInstanceOf[js.Any])
    if (pgpKey != null) __obj.updateDynamic("pgpKey")(pgpKey.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (sesSmtpPassword != null) __obj.updateDynamic("sesSmtpPassword")(sesSmtpPassword.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKeyState]
  }
}

