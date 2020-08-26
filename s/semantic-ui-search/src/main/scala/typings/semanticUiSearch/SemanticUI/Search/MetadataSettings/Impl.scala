package typings.semanticUiSearch.SemanticUI.Search.MetadataSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'cache'
    */
  var cache: String = js.native
  /**
    * @default 'results'
    */
  var results: String = js.native
}

object Impl {
  @scala.inline
  def apply(cache: String, results: String): Impl = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
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
    def setCache(value: String): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setResults(value: String): Self = this.set("results", value.asInstanceOf[js.Any])
  }
  
}

