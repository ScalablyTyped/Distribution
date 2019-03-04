package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchEncryption extends js.Object {
  var cloudwatchEncryption: Anon_CloudwatchEncryptionMode
  var jobBookmarksEncryption: Anon_JobBookmarksEncryptionMode
  var s3Encryption: Anon_KmsKeyArn
}

object Anon_CloudwatchEncryption {
  @scala.inline
  def apply(
    cloudwatchEncryption: Anon_CloudwatchEncryptionMode,
    jobBookmarksEncryption: Anon_JobBookmarksEncryptionMode,
    s3Encryption: Anon_KmsKeyArn
  ): Anon_CloudwatchEncryption = {
    val __obj = js.Dynamic.literal(cloudwatchEncryption = cloudwatchEncryption, jobBookmarksEncryption = jobBookmarksEncryption, s3Encryption = s3Encryption)
  
    __obj.asInstanceOf[Anon_CloudwatchEncryption]
  }
}

