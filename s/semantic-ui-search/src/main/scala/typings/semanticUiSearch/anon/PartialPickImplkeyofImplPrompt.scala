package typings.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplPrompt extends js.Object {
  var category: js.UndefOr[String] = js.native
  var prompt: js.UndefOr[String] = js.native
  var result: js.UndefOr[String] = js.native
  var results: js.UndefOr[String] = js.native
  var searchButton: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplPrompt {
  @scala.inline
  def apply(): PartialPickImplkeyofImplPrompt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplPrompt]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplPromptOps[Self <: PartialPickImplkeyofImplPrompt] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setResults(value: String): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setSearchButton(value: String): Self = this.set("searchButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchButton: Self = this.set("searchButton", js.undefined)
  }
  
}

