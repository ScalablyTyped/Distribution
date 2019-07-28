package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyAlgorithm extends js.Object {
  var keyAlgorithm: String
  var signingAlgorithm: String
  var subject: Anon_CommonName
}

object Anon_KeyAlgorithm {
  @scala.inline
  def apply(keyAlgorithm: String, signingAlgorithm: String, subject: Anon_CommonName): Anon_KeyAlgorithm = {
    val __obj = js.Dynamic.literal(keyAlgorithm = keyAlgorithm, signingAlgorithm = signingAlgorithm, subject = subject)
  
    __obj.asInstanceOf[Anon_KeyAlgorithm]
  }
}

