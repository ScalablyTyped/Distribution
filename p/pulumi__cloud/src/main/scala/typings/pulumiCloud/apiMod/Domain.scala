package typings.pulumiCloud.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends js.Object {
  /**
    * An SSL/TLS certficicate issued for this domain (`cert.pem`).
    */
  var certificateBody: String
  /**
    * The certificate chain for the SSL/TLS certificate provided for this
    * domain (`chain.pem`).
    */
  var certificateChain: String
  /**
    * An SSL/TLS private key issued for thie domain (`privkey.pem`).
    */
  var certificatePrivateKey: String
  /**
    * The domain name to associate with the API.
    */
  var domainName: String
}

object Domain {
  @scala.inline
  def apply(
    certificateBody: String,
    certificateChain: String,
    certificatePrivateKey: String,
    domainName: String
  ): Domain = {
    val __obj = js.Dynamic.literal(certificateBody = certificateBody.asInstanceOf[js.Any], certificateChain = certificateChain.asInstanceOf[js.Any], certificatePrivateKey = certificatePrivateKey.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Domain]
  }
}

