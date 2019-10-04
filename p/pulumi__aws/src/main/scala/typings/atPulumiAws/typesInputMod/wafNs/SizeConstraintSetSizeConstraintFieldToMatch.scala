package typings.atPulumiAws.typesInputMod.wafNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeConstraintSetSizeConstraintFieldToMatch extends js.Object {
  /**
    * When `type` is `HEADER`, enter the name of the header that you want to search, e.g. `User-Agent` or `Referer`.
    * If `type` is any other value, omit this field.
    */
  var data: js.UndefOr[Input[String]] = js.undefined
  /**
    * The part of the web request that you want AWS WAF to search for a specified string.
    * e.g. `HEADER`, `METHOD` or `BODY`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_FieldToMatch.html)
    * for all supported values.
    */
  var `type`: Input[String]
}

object SizeConstraintSetSizeConstraintFieldToMatch {
  @scala.inline
  def apply(`type`: Input[String], data: Input[String] = null): SizeConstraintSetSizeConstraintFieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeConstraintSetSizeConstraintFieldToMatch]
  }
}

