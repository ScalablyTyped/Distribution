package typings.atPulumiAws.typesInputMod.opsworksNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationSslConfiguration extends js.Object {
  var certificate: Input[String]
  var chain: js.UndefOr[Input[String]] = js.undefined
  var privateKey: Input[String]
}

object ApplicationSslConfiguration {
  @scala.inline
  def apply(certificate: Input[String], privateKey: Input[String], chain: Input[String] = null): ApplicationSslConfiguration = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    if (chain != null) __obj.updateDynamic("chain")(chain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSslConfiguration]
  }
}

