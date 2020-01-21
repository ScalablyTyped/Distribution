package typings.pulumiAws.inputMod.wafregional

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XssMatchSetXssMatchTupleFieldToMatch extends js.Object {
  /**
    * When the value of `type` is `HEADER`, enter the name of the header that you want the WAF to search, for example, `User-Agent` or `Referer`. If the value of `type` is any other value, omit `data`.
    */
  var data: js.UndefOr[Input[String]] = js.native
  /**
    * The part of the web request that you want AWS WAF to search for a specified string. e.g. `HEADER` or `METHOD`
    */
  var `type`: Input[String] = js.native
}

object XssMatchSetXssMatchTupleFieldToMatch {
  @scala.inline
  def apply(`type`: Input[String], data: Input[String] = null): XssMatchSetXssMatchTupleFieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[XssMatchSetXssMatchTupleFieldToMatch]
  }
}

