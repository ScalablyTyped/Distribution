package typings.simpleDashUrlDashCache.simpleDashUrlDashCacheMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexRule extends js.Object {
  var regex: RegExp
}

object RegexRule {
  @scala.inline
  def apply(regex: RegExp): RegexRule = {
    val __obj = js.Dynamic.literal(regex = regex)
  
    __obj.asInstanceOf[RegexRule]
  }
}

