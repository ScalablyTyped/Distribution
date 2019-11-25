package typings.sparkpost.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DKIM extends js.Object {
  /** Header fields to be included in the DKIM signature. This field is currently ignored. */
  var headers: js.UndefOr[String] = js.undefined
  /** DKIM private key. */
  var `private`: js.UndefOr[String] = js.undefined
  /** DKIM public key. */
  var public: String
  /** DomainKey selector. */
  var selector: String
  /** Signing Domain Identifier (SDID). SparkPost Enterprise API only. */
  var signing_domain: js.UndefOr[String] = js.undefined
}

object DKIM {
  @scala.inline
  def apply(
    public: String,
    selector: String,
    headers: String = null,
    `private`: String = null,
    signing_domain: String = null
  ): DKIM = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (`private` != null) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    if (signing_domain != null) __obj.updateDynamic("signing_domain")(signing_domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DKIM]
  }
}

