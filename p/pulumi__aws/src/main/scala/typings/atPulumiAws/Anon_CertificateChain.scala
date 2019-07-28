package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CertificateChain extends js.Object {
  var certificate: String
  var chain: js.UndefOr[String] = js.undefined
  var privateKey: String
}

object Anon_CertificateChain {
  @scala.inline
  def apply(certificate: String, privateKey: String, chain: String = null): Anon_CertificateChain = {
    val __obj = js.Dynamic.literal(certificate = certificate, privateKey = privateKey)
    if (chain != null) __obj.updateDynamic("chain")(chain)
    __obj.asInstanceOf[Anon_CertificateChain]
  }
}

