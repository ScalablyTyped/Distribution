package typings
package simpleDashUrlDashCacheLib.simpleDashUrlDashCacheMod.privateNNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheCategory extends js.Object {
  /* private */ def getCacheCategory(): java.lang.String
  def getCategory(): java.lang.String
  def getCurrentUrl(): java.lang.String
  /* private */ def getRegexTest(u: simpleDashUrlDashCacheLib.simpleDashUrlDashCacheMod.RegexRule): scala.Boolean
}

object CacheCategory {
  @scala.inline
  def apply(
    getCacheCategory: js.Function0[java.lang.String],
    getCategory: js.Function0[java.lang.String],
    getCurrentUrl: js.Function0[java.lang.String],
    getRegexTest: js.Function1[simpleDashUrlDashCacheLib.simpleDashUrlDashCacheMod.RegexRule, scala.Boolean]
  ): CacheCategory = {
    val __obj = js.Dynamic.literal(getCacheCategory = getCacheCategory, getCategory = getCategory, getCurrentUrl = getCurrentUrl, getRegexTest = getRegexTest)
  
    __obj.asInstanceOf[CacheCategory]
  }
}

