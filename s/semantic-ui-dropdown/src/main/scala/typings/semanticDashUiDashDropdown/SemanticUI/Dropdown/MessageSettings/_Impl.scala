package typings.semanticDashUiDashDropdown.SemanticUI.Dropdown.MessageSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'Add <b>{term}</b>'
    */
  var addResult: String
  /**
    * @default '{count} selected'
    */
  var count: String
  /**
    * @default 'Max {maxCount} selections'
    */
  var maxSelections: String
  /**
    * 'No results found.'
    */
  var noResults: String
}

object _Impl {
  @scala.inline
  def apply(addResult: String, count: String, maxSelections: String, noResults: String): _Impl = {
    val __obj = js.Dynamic.literal(addResult = addResult.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], maxSelections = maxSelections.asInstanceOf[js.Any], noResults = noResults.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

