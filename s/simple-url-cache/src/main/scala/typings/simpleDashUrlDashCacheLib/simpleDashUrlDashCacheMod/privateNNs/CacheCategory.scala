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
    getCacheCategory: () => java.lang.String,
    getCategory: () => java.lang.String,
    getCurrentUrl: () => java.lang.String,
    getRegexTest: simpleDashUrlDashCacheLib.simpleDashUrlDashCacheMod.RegexRule => scala.Boolean
  ): CacheCategory = {
    val __obj = js.Dynamic.literal(getCacheCategory = js.Any.fromFunction0(getCacheCategory), getCategory = js.Any.fromFunction0(getCategory), getCurrentUrl = js.Any.fromFunction0(getCurrentUrl), getRegexTest = js.Any.fromFunction1(getRegexTest))
  
    __obj.asInstanceOf[CacheCategory]
  }
}

