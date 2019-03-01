package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionContextEquals extends js.Object {
  var encryptionContextEquals: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var encryptionContextSubset: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object Anon_EncryptionContextEquals {
  @scala.inline
  def apply(
    encryptionContextEquals: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    encryptionContextSubset: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Anon_EncryptionContextEquals = {
    val __obj = js.Dynamic.literal()
    if (encryptionContextEquals != null) __obj.updateDynamic("encryptionContextEquals")(encryptionContextEquals)
    if (encryptionContextSubset != null) __obj.updateDynamic("encryptionContextSubset")(encryptionContextSubset)
    __obj.asInstanceOf[Anon_EncryptionContextEquals]
  }
}

