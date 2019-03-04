package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DKIM extends js.Object {
  /** Header fields to be included in the DKIM signature. This field is currently ignored. */
  var headers: js.UndefOr[java.lang.String] = js.undefined
  /** DKIM private key. */
  var `private`: js.UndefOr[java.lang.String] = js.undefined
  /** DKIM public key. */
  var public: java.lang.String
  /** DomainKey selector. */
  var selector: java.lang.String
  /** Signing Domain Identifier (SDID). SparkPost Enterprise API only. */
  var signing_domain: js.UndefOr[java.lang.String] = js.undefined
}

object DKIM {
  @scala.inline
  def apply(
    public: java.lang.String,
    selector: java.lang.String,
    headers: java.lang.String = null,
    `private`: java.lang.String = null,
    signing_domain: java.lang.String = null
  ): DKIM = {
    val __obj = js.Dynamic.literal(public = public, selector = selector)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (`private` != null) __obj.updateDynamic("private")(`private`)
    if (signing_domain != null) __obj.updateDynamic("signing_domain")(signing_domain)
    __obj.asInstanceOf[DKIM]
  }
}

