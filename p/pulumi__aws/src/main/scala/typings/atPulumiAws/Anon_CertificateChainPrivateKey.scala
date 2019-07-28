package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CertificateChainPrivateKey extends js.Object {
  var certificate: Input[String]
  var chain: js.UndefOr[Input[String]] = js.undefined
  var privateKey: Input[String]
}

object Anon_CertificateChainPrivateKey {
  @scala.inline
  def apply(certificate: Input[String], privateKey: Input[String], chain: Input[String] = null): Anon_CertificateChainPrivateKey = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    if (chain != null) __obj.updateDynamic("chain")(chain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CertificateChainPrivateKey]
  }
}

