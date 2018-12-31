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

