package typings.reactInstantsearchCore

import typings.reactInstantsearchCore.mod.HighlightResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHighlightResult[TDoc] extends js.Object {
  /**
    * Contains the searchable attributes within the document and shows which part of the
    * attribute was matched by the search terms.  Note that if the index has defined
    * any searchable attributes, this object will only contain those keys and others
    * will not exist.
    */
  var _highlightResult: HighlightResult[TDoc]
  var objectID: String
}

object AnonHighlightResult {
  @scala.inline
  def apply[TDoc](_highlightResult: HighlightResult[TDoc], objectID: String): AnonHighlightResult[TDoc] = {
    val __obj = js.Dynamic.literal(_highlightResult = _highlightResult.asInstanceOf[js.Any], objectID = objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHighlightResult[TDoc]]
  }
}

