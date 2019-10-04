package typings.atPulumiAws.typesOutputMod.opsworksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationSslConfiguration extends js.Object {
  var certificate: String
  var chain: js.UndefOr[String] = js.undefined
  var privateKey: String
}

object ApplicationSslConfiguration {
  @scala.inline
  def apply(certificate: String, privateKey: String, chain: String = null): ApplicationSslConfiguration = {
    val __obj = js.Dynamic.literal(certificate = certificate, privateKey = privateKey)
    if (chain != null) __obj.updateDynamic("chain")(chain)
    __obj.asInstanceOf[ApplicationSslConfiguration]
  }
}

