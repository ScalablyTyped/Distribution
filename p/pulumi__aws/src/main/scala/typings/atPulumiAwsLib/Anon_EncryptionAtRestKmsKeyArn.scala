package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionAtRestKmsKeyArn extends js.Object {
  var encryptionAtRestKmsKeyArn: java.lang.String
  var encryptionInTransit: js.UndefOr[Anon_ClientBroker] = js.undefined
}

object Anon_EncryptionAtRestKmsKeyArn {
  @scala.inline
  def apply(encryptionAtRestKmsKeyArn: java.lang.String, encryptionInTransit: Anon_ClientBroker = null): Anon_EncryptionAtRestKmsKeyArn = {
    val __obj = js.Dynamic.literal(encryptionAtRestKmsKeyArn = encryptionAtRestKmsKeyArn)
    if (encryptionInTransit != null) __obj.updateDynamic("encryptionInTransit")(encryptionInTransit)
    __obj.asInstanceOf[Anon_EncryptionAtRestKmsKeyArn]
  }
}

