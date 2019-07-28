package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KmsKeyArnS3EncryptionMode extends js.Object {
  var kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
  var s3EncryptionMode: js.UndefOr[Input[String]] = js.undefined
}

object Anon_KmsKeyArnS3EncryptionMode {
  @scala.inline
  def apply(kmsKeyArn: Input[String] = null, s3EncryptionMode: Input[String] = null): Anon_KmsKeyArnS3EncryptionMode = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (s3EncryptionMode != null) __obj.updateDynamic("s3EncryptionMode")(s3EncryptionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KmsKeyArnS3EncryptionMode]
  }
}

