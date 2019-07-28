package typings.psl.pslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedDomain extends js.Object {
  var domain: String | Null
  var error: js.UndefOr[scala.Nothing] = js.undefined
  var input: String
  var listed: Boolean
  var sld: String | Null
  var subdomain: String | Null
  var tld: String | Null
}

object ParsedDomain {
  @scala.inline
  def apply(
    input: String,
    listed: Boolean,
    domain: String = null,
    error: js.UndefOr[scala.Nothing] = js.undefined,
    sld: String = null,
    subdomain: String = null,
    tld: String = null
  ): ParsedDomain = {
    val __obj = js.Dynamic.literal(input = input, listed = listed)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (sld != null) __obj.updateDynamic("sld")(sld)
    if (subdomain != null) __obj.updateDynamic("subdomain")(subdomain)
    if (tld != null) __obj.updateDynamic("tld")(tld)
    __obj.asInstanceOf[ParsedDomain]
  }
}

