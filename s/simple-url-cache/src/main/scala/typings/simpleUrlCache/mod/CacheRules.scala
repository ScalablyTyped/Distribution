package typings.simpleUrlCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheRules extends js.Object {
  var cacheAlways: js.Array[RegexRule] = js.native
  var cacheMaxAge: js.Array[MaxAgeRegexRule] = js.native
  var cacheNever: js.Array[RegexRule] = js.native
  var default: String = js.native
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
  @scala.inline
  implicit class CacheRulesOps[Self <: CacheRules] (val x: Self) extends AnyVal {
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
    def setCacheAlwaysVarargs(value: RegexRule*): Self = this.set("cacheAlways", js.Array(value :_*))
    @scala.inline
    def setCacheAlways(value: js.Array[RegexRule]): Self = this.set("cacheAlways", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheMaxAgeVarargs(value: MaxAgeRegexRule*): Self = this.set("cacheMaxAge", js.Array(value :_*))
    @scala.inline
    def setCacheMaxAge(value: js.Array[MaxAgeRegexRule]): Self = this.set("cacheMaxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheNeverVarargs(value: RegexRule*): Self = this.set("cacheNever", js.Array(value :_*))
    @scala.inline
    def setCacheNever(value: js.Array[RegexRule]): Self = this.set("cacheNever", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
  }
  
}

