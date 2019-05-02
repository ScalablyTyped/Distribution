package typings
package simplecrawlerLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureContextOptions extends js.Object {
  var ca: js.UndefOr[java.lang.String | simplecrawlerLib.Buffer] = js.undefined
  var cert: js.UndefOr[java.lang.String | simplecrawlerLib.Buffer] = js.undefined
  var ciphers: js.UndefOr[java.lang.String] = js.undefined
  var crl: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var honorCipherOrder: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String | simplecrawlerLib.Buffer] = js.undefined
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  var pfx: js.UndefOr[java.lang.String | simplecrawlerLib.Buffer] = js.undefined
}

object SecureContextOptions {
  @scala.inline
  def apply(
    ca: java.lang.String | simplecrawlerLib.Buffer = null,
    cert: java.lang.String | simplecrawlerLib.Buffer = null,
    ciphers: java.lang.String = null,
    crl: java.lang.String | js.Array[java.lang.String] = null,
    honorCipherOrder: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String | simplecrawlerLib.Buffer = null,
    passphrase: java.lang.String = null,
    pfx: java.lang.String | simplecrawlerLib.Buffer = null
  ): SecureContextOptions = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureContextOptions]
  }
}

