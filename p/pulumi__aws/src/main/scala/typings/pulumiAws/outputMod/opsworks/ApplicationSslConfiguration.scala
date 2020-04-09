package typings.pulumiAws.outputMod.opsworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSslConfiguration extends js.Object {
  /**
    * The contents of the certificate's domain.crt file.
    */
  var certificate: String = js.native
  /**
    * Can be used to specify an intermediate certificate authority key or client authentication.
    */
  var chain: js.UndefOr[String] = js.native
  /**
    * The private key; the contents of the certificate's domain.key file.
    */
  var privateKey: String = js.native
}

object ApplicationSslConfiguration {
  @scala.inline
  def apply(certificate: String, privateKey: String, chain: String = null): ApplicationSslConfiguration = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    if (chain != null) __obj.updateDynamic("chain")(chain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSslConfiguration]
  }
}

