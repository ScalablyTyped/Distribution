package typings.pulumiAws.inputMod.wafregional

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch extends js.Object {
  /**
    * When `type` is `HEADER`, enter the name of the header that you want to search, e.g. `User-Agent` or `Referer`.
    * If `type` is any other value, omit this field.
    */
  var data: js.UndefOr[Input[String]] = js.native
  /**
    * The part of the web request that you want AWS WAF to search for a specified string.
    * e.g. `HEADER`, `METHOD` or `BODY`.
    * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_regional_FieldToMatch.html)
    * for all supported values.
    */
  var `type`: Input[String] = js.native
}

object SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch {
  @scala.inline
  def apply(`type`: Input[String], data: Input[String] = null): SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch]
  }
}

