package typings
package simplecrawlerLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialDetails extends js.Object {
  var ca: java.lang.String | js.Array[java.lang.String]
  var cert: java.lang.String
  var ciphers: java.lang.String
  var crl: java.lang.String | js.Array[java.lang.String]
  var key: java.lang.String
  var passphrase: java.lang.String
  var pfx: java.lang.String
}

object CredentialDetails {
  @scala.inline
  def apply(
    ca: java.lang.String | js.Array[java.lang.String],
    cert: java.lang.String,
    ciphers: java.lang.String,
    crl: java.lang.String | js.Array[java.lang.String],
    key: java.lang.String,
    passphrase: java.lang.String,
    pfx: java.lang.String
  ): CredentialDetails = {
    val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], cert = cert, ciphers = ciphers, crl = crl.asInstanceOf[js.Any], key = key, passphrase = passphrase, pfx = pfx)
  
    __obj.asInstanceOf[CredentialDetails]
  }
}

