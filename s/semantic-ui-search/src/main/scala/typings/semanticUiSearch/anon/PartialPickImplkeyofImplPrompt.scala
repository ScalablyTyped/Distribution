package typings.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplPrompt extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var result: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[String] = js.undefined
  var searchButton: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplPrompt {
  @scala.inline
  def apply(
    category: String = null,
    prompt: String = null,
    result: String = null,
    results: String = null,
    searchButton: String = null
  ): PartialPickImplkeyofImplPrompt = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (searchButton != null) __obj.updateDynamic("searchButton")(searchButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplPrompt]
  }
}

