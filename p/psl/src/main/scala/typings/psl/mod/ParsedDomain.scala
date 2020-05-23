package typings.psl.mod

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
    sld: String = null,
    subdomain: String = null,
    tld: String = null
  ): ParsedDomain = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], listed = listed.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], sld = sld.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any], tld = tld.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedDomain]
  }
}

