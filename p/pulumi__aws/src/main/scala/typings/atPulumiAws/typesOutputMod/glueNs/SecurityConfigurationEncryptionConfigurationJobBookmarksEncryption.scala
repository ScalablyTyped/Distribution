package typings.atPulumiAws.typesOutputMod.glueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption extends js.Object {
  /**
    * Encryption mode to use for job bookmarks data. Valid values: `CSE-KMS`, `DISABLED`. Default value: `DISABLED`.
    */
  var jobBookmarksEncryptionMode: js.UndefOr[String] = js.undefined
  /**
    * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var kmsKeyArn: js.UndefOr[String] = js.undefined
}

object SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption {
  @scala.inline
  def apply(jobBookmarksEncryptionMode: String = null, kmsKeyArn: String = null): SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption = {
    val __obj = js.Dynamic.literal()
    if (jobBookmarksEncryptionMode != null) __obj.updateDynamic("jobBookmarksEncryptionMode")(jobBookmarksEncryptionMode)
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn)
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption]
  }
}

