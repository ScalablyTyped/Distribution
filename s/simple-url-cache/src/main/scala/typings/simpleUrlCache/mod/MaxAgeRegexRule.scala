package typings.simpleUrlCache.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxAgeRegexRule extends RegexRule {
  var maxAge: Double = js.native
}

object MaxAgeRegexRule {
  @scala.inline
  def apply(maxAge: Double, regex: RegExp): MaxAgeRegexRule = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAgeRegexRule]
  }
  @scala.inline
  implicit class MaxAgeRegexRuleOps[Self <: MaxAgeRegexRule] (val x: Self) extends AnyVal {
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
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
  }
  
}

