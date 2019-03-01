package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchEncryptionMode extends js.Object {
  var cloudwatchEncryptionMode: js.UndefOr[java.lang.String] = js.undefined
  var kmsKeyArn: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CloudwatchEncryptionMode {
  @scala.inline
  def apply(cloudwatchEncryptionMode: java.lang.String = null, kmsKeyArn: java.lang.String = null): Anon_CloudwatchEncryptionMode = {
    val __obj = js.Dynamic.literal()
    if (cloudwatchEncryptionMode != null) __obj.updateDynamic("cloudwatchEncryptionMode")(cloudwatchEncryptionMode)
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn)
    __obj.asInstanceOf[Anon_CloudwatchEncryptionMode]
  }
}

