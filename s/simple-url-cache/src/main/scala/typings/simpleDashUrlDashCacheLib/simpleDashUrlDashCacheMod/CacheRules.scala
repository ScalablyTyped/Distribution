package typings
package simpleDashUrlDashCacheLib.simpleDashUrlDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheRules extends js.Object {
  var cacheAlways: js.Array[RegexRule]
  var cacheMaxAge: js.Array[MaxAgeRegexRule]
  var cacheNever: js.Array[RegexRule]
  var default: java.lang.String
}

object CacheRules {
  @scala.inline
  def apply(
    cacheAlways: js.Array[RegexRule],
    cacheMaxAge: js.Array[MaxAgeRegexRule],
    cacheNever: js.Array[RegexRule],
    default: java.lang.String
  ): CacheRules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cacheAlways")(cacheAlways)
    __obj.updateDynamic("cacheMaxAge")(cacheMaxAge)
    __obj.updateDynamic("cacheNever")(cacheNever)
    __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[CacheRules]
  }
}

