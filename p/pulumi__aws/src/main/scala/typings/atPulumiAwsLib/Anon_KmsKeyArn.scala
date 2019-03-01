package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KmsKeyArn extends js.Object {
  var kmsKeyArn: js.UndefOr[java.lang.String] = js.undefined
  var s3EncryptionMode: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_KmsKeyArn {
  @scala.inline
  def apply(kmsKeyArn: java.lang.String = null, s3EncryptionMode: java.lang.String = null): Anon_KmsKeyArn = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn)
    if (s3EncryptionMode != null) __obj.updateDynamic("s3EncryptionMode")(s3EncryptionMode)
    __obj.asInstanceOf[Anon_KmsKeyArn]
  }
}

