package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JobBookmarksEncryptionMode extends js.Object {
  var jobBookmarksEncryptionMode: js.UndefOr[java.lang.String] = js.undefined
  var kmsKeyArn: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_JobBookmarksEncryptionMode {
  @scala.inline
  def apply(jobBookmarksEncryptionMode: java.lang.String = null, kmsKeyArn: java.lang.String = null): Anon_JobBookmarksEncryptionMode = {
    val __obj = js.Dynamic.literal()
    if (jobBookmarksEncryptionMode != null) __obj.updateDynamic("jobBookmarksEncryptionMode")(jobBookmarksEncryptionMode)
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn)
    __obj.asInstanceOf[Anon_JobBookmarksEncryptionMode]
  }
}

