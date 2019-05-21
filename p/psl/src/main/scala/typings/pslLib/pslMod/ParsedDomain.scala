package typings
package pslLib.pslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedDomain extends js.Object {
  var domain: java.lang.String | scala.Null
  var error: js.UndefOr[scala.Nothing] = js.undefined
  var input: java.lang.String
  var listed: scala.Boolean
  var sld: java.lang.String | scala.Null
  var subdomain: java.lang.String | scala.Null
  var tld: java.lang.String | scala.Null
}

object ParsedDomain {
  @scala.inline
  def apply(
    input: java.lang.String,
    listed: scala.Boolean,
    domain: java.lang.String = null,
    error: js.UndefOr[scala.Nothing] = js.undefined,
    sld: java.lang.String = null,
    subdomain: java.lang.String = null,
    tld: java.lang.String = null
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

