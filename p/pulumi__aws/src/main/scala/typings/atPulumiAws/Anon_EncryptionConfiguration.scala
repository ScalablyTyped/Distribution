package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionConfiguration extends js.Object {
  var encryptionConfiguration: js.UndefOr[Anon_EncryptionOptionKmsKeyArn] = js.undefined
  var outputLocation: js.UndefOr[String] = js.undefined
}

object Anon_EncryptionConfiguration {
  @scala.inline
  def apply(encryptionConfiguration: Anon_EncryptionOptionKmsKeyArn = null, outputLocation: String = null): Anon_EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (encryptionConfiguration != null) __obj.updateDynamic("encryptionConfiguration")(encryptionConfiguration)
    if (outputLocation != null) __obj.updateDynamic("outputLocation")(outputLocation)
    __obj.asInstanceOf[Anon_EncryptionConfiguration]
  }
}

