package typings
package semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.MessageSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'Add <b>{term}</b>'
    */
  var addResult: java.lang.String
  /**
    * @default '{count} selected'
    */
  var count: java.lang.String
  /**
    * @default 'Max {maxCount} selections'
    */
  var maxSelections: java.lang.String
  /**
    * 'No results found.'
    */
  var noResults: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    addResult: java.lang.String,
    count: java.lang.String,
    maxSelections: java.lang.String,
    noResults: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal(addResult = addResult, count = count, maxSelections = maxSelections, noResults = noResults)
  
    __obj.asInstanceOf[_Impl]
  }
}

