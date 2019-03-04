package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CertificateChain extends js.Object {
  var certificate: java.lang.String
  var chain: js.UndefOr[java.lang.String] = js.undefined
  var privateKey: java.lang.String
}

object Anon_CertificateChain {
  @scala.inline
  def apply(certificate: java.lang.String, privateKey: java.lang.String, chain: java.lang.String = null): Anon_CertificateChain = {
    val __obj = js.Dynamic.literal(certificate = certificate, privateKey = privateKey)
    if (chain != null) __obj.updateDynamic("chain")(chain)
    __obj.asInstanceOf[Anon_CertificateChain]
  }
}

