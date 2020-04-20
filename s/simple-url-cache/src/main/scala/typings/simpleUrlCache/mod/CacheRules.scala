package typings.simpleUrlCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheRules extends js.Object {
  var cacheAlways: js.Array[RegexRule]
  var cacheMaxAge: js.Array[MaxAgeRegexRule]
  var cacheNever: js.Array[RegexRule]
  var default: String
}

object CacheRules {
  @scala.inline
  def apply(
    cacheAlways: js.Array[RegexRule],
    cacheMaxAge: js.Array[MaxAgeRegexRule],
    cacheNever: js.Array[RegexRule],
    default: String
  ): CacheRules = {
    val __obj = js.Dynamic.literal(cacheAlways = cacheAlways.asInstanceOf[js.Any], cacheMaxAge = cacheMaxAge.asInstanceOf[js.Any], cacheNever = cacheNever.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheRules]
  }
}

