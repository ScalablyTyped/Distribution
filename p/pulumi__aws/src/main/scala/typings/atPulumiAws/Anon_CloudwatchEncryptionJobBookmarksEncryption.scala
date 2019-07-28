package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchEncryptionJobBookmarksEncryption extends js.Object {
  var cloudwatchEncryption: Input[Anon_CloudwatchEncryptionModeKmsKeyArn]
  var jobBookmarksEncryption: Input[Anon_JobBookmarksEncryptionModeKmsKeyArn]
  var s3Encryption: Input[Anon_KmsKeyArnS3EncryptionMode]
}

object Anon_CloudwatchEncryptionJobBookmarksEncryption {
  @scala.inline
  def apply(
    cloudwatchEncryption: Input[Anon_CloudwatchEncryptionModeKmsKeyArn],
    jobBookmarksEncryption: Input[Anon_JobBookmarksEncryptionModeKmsKeyArn],
    s3Encryption: Input[Anon_KmsKeyArnS3EncryptionMode]
  ): Anon_CloudwatchEncryptionJobBookmarksEncryption = {
    val __obj = js.Dynamic.literal(cloudwatchEncryption = cloudwatchEncryption.asInstanceOf[js.Any], jobBookmarksEncryption = jobBookmarksEncryption.asInstanceOf[js.Any], s3Encryption = s3Encryption.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CloudwatchEncryptionJobBookmarksEncryption]
  }
}

