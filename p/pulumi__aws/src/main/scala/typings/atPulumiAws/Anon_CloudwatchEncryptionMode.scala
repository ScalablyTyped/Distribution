package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchEncryptionMode extends js.Object {
  var cloudwatchEncryptionMode: js.UndefOr[String] = js.undefined
  var kmsKeyArn: js.UndefOr[String] = js.undefined
}

object Anon_CloudwatchEncryptionMode {
  @scala.inline
  def apply(cloudwatchEncryptionMode: String = null, kmsKeyArn: String = null): Anon_CloudwatchEncryptionMode = {
    val __obj = js.Dynamic.literal()
    if (cloudwatchEncryptionMode != null) __obj.updateDynamic("cloudwatchEncryptionMode")(cloudwatchEncryptionMode)
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn)
    __obj.asInstanceOf[Anon_CloudwatchEncryptionMode]
  }
}

