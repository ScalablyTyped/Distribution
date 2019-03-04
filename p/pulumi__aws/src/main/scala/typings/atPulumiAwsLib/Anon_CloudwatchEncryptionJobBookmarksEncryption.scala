package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchEncryptionJobBookmarksEncryption extends js.Object {
  var cloudwatchEncryption: atPulumiPulumiLib.outputMod.Input[Anon_CloudwatchEncryptionModeKmsKeyArn]
  var jobBookmarksEncryption: atPulumiPulumiLib.outputMod.Input[Anon_JobBookmarksEncryptionModeKmsKeyArn]
  var s3Encryption: atPulumiPulumiLib.outputMod.Input[Anon_KmsKeyArnS3EncryptionMode]
}

object Anon_CloudwatchEncryptionJobBookmarksEncryption {
  @scala.inline
  def apply(
    cloudwatchEncryption: atPulumiPulumiLib.outputMod.Input[Anon_CloudwatchEncryptionModeKmsKeyArn],
    jobBookmarksEncryption: atPulumiPulumiLib.outputMod.Input[Anon_JobBookmarksEncryptionModeKmsKeyArn],
    s3Encryption: atPulumiPulumiLib.outputMod.Input[Anon_KmsKeyArnS3EncryptionMode]
  ): Anon_CloudwatchEncryptionJobBookmarksEncryption = {
    val __obj = js.Dynamic.literal(cloudwatchEncryption = cloudwatchEncryption.asInstanceOf[js.Any], jobBookmarksEncryption = jobBookmarksEncryption.asInstanceOf[js.Any], s3Encryption = s3Encryption.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CloudwatchEncryptionJobBookmarksEncryption]
  }
}

