package typings.pulumiAws.outputMod.wafv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRegexPatternSetRegularExpression extends js.Object {
  /**
    * (Required) The string representing the regular expression, see the AWS WAF [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/waf-regex-pattern-set-creating.html) for more information.
    */
  var regexString: String = js.native
}

object GetRegexPatternSetRegularExpression {
  @scala.inline
  def apply(regexString: String): GetRegexPatternSetRegularExpression = {
    val __obj = js.Dynamic.literal(regexString = regexString.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRegexPatternSetRegularExpression]
  }
  @scala.inline
  implicit class GetRegexPatternSetRegularExpressionOps[Self <: GetRegexPatternSetRegularExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRegexString(value: String): Self = this.set("regexString", value.asInstanceOf[js.Any])
  }
  
}

