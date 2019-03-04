package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CertificateChainPrivateKey extends js.Object {
  var certificate: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var chain: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var privateKey: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_CertificateChainPrivateKey {
  @scala.inline
  def apply(
    certificate: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    privateKey: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    chain: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_CertificateChainPrivateKey = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    if (chain != null) __obj.updateDynamic("chain")(chain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CertificateChainPrivateKey]
  }
}

