package typings.semanticUiSearch.SemanticUI.Search.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default '.category'
    */
  var category: String = js.native
  /**
    * @default '.prompt'
    */
  var prompt: String = js.native
  /**
    * @default '.result'
    */
  var result: String = js.native
  /**
    * @default '.results'
    */
  var results: String = js.native
  /**
    * @default '.search.button'
    */
  var searchButton: String = js.native
}

object Impl {
  @scala.inline
  def apply(category: String, prompt: String, result: String, results: String, searchButton: String): Impl = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], searchButton = searchButton.asInstanceOf[js.Any])
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setResults(value: String): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchButton(value: String): Self = this.set("searchButton", value.asInstanceOf[js.Any])
  }
  
}

