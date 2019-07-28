package typings.simpleDashUrlDashCache.simpleDashUrlDashCacheMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxAgeRegexRule extends RegexRule {
  var maxAge: Double
}

object MaxAgeRegexRule {
  @scala.inline
  def apply(maxAge: Double, regex: RegExp): MaxAgeRegexRule = {
    val __obj = js.Dynamic.literal(maxAge = maxAge, regex = regex)
  
    __obj.asInstanceOf[MaxAgeRegexRule]
  }
}

