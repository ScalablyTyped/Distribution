package typings.simpleUrlCache.mod.privateN

import typings.simpleUrlCache.mod.RegexRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheCategory extends js.Object {
  /* private */ def getCacheCategory(): String
  def getCategory(): String
  def getCurrentUrl(): String
  /* private */ def getRegexTest(u: RegexRule): Boolean
}

object CacheCategory {
  @scala.inline
  def apply(
    getCacheCategory: () => String,
    getCategory: () => String,
    getCurrentUrl: () => String,
    getRegexTest: RegexRule => Boolean
  ): CacheCategory = {
    val __obj = js.Dynamic.literal(getCacheCategory = js.Any.fromFunction0(getCacheCategory), getCategory = js.Any.fromFunction0(getCategory), getCurrentUrl = js.Any.fromFunction0(getCurrentUrl), getRegexTest = js.Any.fromFunction1(getRegexTest))
    __obj.asInstanceOf[CacheCategory]
  }
}

