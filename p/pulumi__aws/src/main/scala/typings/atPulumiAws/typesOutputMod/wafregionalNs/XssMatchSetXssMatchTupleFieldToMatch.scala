package typings.atPulumiAws.typesOutputMod.wafregionalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XssMatchSetXssMatchTupleFieldToMatch extends js.Object {
  /**
    * When the value of `type` is `HEADER`, enter the name of the header that you want the WAF to search, for example, `User-Agent` or `Referer`. If the value of `type` is any other value, omit `data`.
    */
  var data: js.UndefOr[String] = js.undefined
  /**
    * The part of the web request that you want AWS WAF to search for a specified string. e.g. `HEADER` or `METHOD`
    */
  var `type`: String
}

object XssMatchSetXssMatchTupleFieldToMatch {
  @scala.inline
  def apply(`type`: String, data: String = null): XssMatchSetXssMatchTupleFieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[XssMatchSetXssMatchTupleFieldToMatch]
  }
}

