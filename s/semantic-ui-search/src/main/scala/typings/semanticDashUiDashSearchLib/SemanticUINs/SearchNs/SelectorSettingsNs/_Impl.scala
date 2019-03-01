package typings
package semanticDashUiDashSearchLib.SemanticUINs.SearchNs.SelectorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default '.category'
    */
  var category: java.lang.String
  /**
    * @default '.prompt'
    */
  var prompt: java.lang.String
  /**
    * @default '.result'
    */
  var result: java.lang.String
  /**
    * @default '.results'
    */
  var results: java.lang.String
  /**
    * @default '.search.button'
    */
  var searchButton: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    category: java.lang.String,
    prompt: java.lang.String,
    result: java.lang.String,
    results: java.lang.String,
    searchButton: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("category")(category)
    __obj.updateDynamic("prompt")(prompt)
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("results")(results)
    __obj.updateDynamic("searchButton")(searchButton)
    __obj.asInstanceOf[_Impl]
  }
}

