package typings.reactInstantsearchCore

import typings.reactInstantsearchCore.mod.HighlightResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-instantsearch-core.react-instantsearch-core.Hit<{  count  :number,   isRefined  :boolean,   label  :string,   value  :std.Array<string>}> */
trait HitcountnumberisRefinedbo extends js.Object {
  /**
    * Contains the searchable attributes within the document and shows which part of the
    * attribute was matched by the search terms.  Note that if the index has defined
    * any searchable attributes, this object will only contain those keys and others
    * will not exist.
    */
  var _highlightResult: HighlightResult[AnonValue]
  var count: Double
  var isRefined: Boolean
  var label: String
  var objectID: String
  var value: js.Array[String]
}

object HitcountnumberisRefinedbo {
  @scala.inline
  def apply(
    _highlightResult: HighlightResult[AnonValue],
    count: Double,
    isRefined: Boolean,
    label: String,
    objectID: String,
    value: js.Array[String]
  ): HitcountnumberisRefinedbo = {
    val __obj = js.Dynamic.literal(_highlightResult = _highlightResult.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], isRefined = isRefined.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], objectID = objectID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HitcountnumberisRefinedbo]
  }
}

