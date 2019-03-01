package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyAlgorithm extends js.Object {
  var keyAlgorithm: java.lang.String
  var signingAlgorithm: java.lang.String
  var subject: Anon_CommonName
}

object Anon_KeyAlgorithm {
  @scala.inline
  def apply(keyAlgorithm: java.lang.String, signingAlgorithm: java.lang.String, subject: Anon_CommonName): Anon_KeyAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keyAlgorithm")(keyAlgorithm)
    __obj.updateDynamic("signingAlgorithm")(signingAlgorithm)
    __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[Anon_KeyAlgorithm]
  }
}

