package typings.semanticDashUiDashSearch.SemanticUI.Search.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default '.category'
    */
  var category: String
  /**
    * @default '.prompt'
    */
  var prompt: String
  /**
    * @default '.result'
    */
  var result: String
  /**
    * @default '.results'
    */
  var results: String
  /**
    * @default '.search.button'
    */
  var searchButton: String
}

object _Impl {
  @scala.inline
  def apply(category: String, prompt: String, result: String, results: String, searchButton: String): _Impl = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], searchButton = searchButton.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

