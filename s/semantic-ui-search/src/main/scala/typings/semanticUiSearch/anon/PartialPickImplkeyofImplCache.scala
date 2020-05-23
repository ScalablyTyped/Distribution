package typings.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.MetadataSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.MetadataSettings._Impl>> */
trait PartialPickImplkeyofImplCache extends js.Object {
  var cache: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplCache {
  @scala.inline
  def apply(cache: String = null, results: String = null): PartialPickImplkeyofImplCache = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplCache]
  }
}

