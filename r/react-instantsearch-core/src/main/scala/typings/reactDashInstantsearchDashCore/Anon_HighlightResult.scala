package typings.reactDashInstantsearchDashCore

import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.HighlightResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HighlightResult[TDoc] extends js.Object {
  /**
    * Contains the searchable attributes within the document and shows which part of the
    * attribute was matched by the search terms.  Note that if the index has defined
    * any searchable attributes, this object will only contain those keys and others
    * will not exist.
    */
  var _highlightResult: HighlightResult[TDoc]
  var objectID: String
}

object Anon_HighlightResult {
  @scala.inline
  def apply[TDoc](_highlightResult: HighlightResult[TDoc], objectID: String): Anon_HighlightResult[TDoc] = {
    val __obj = js.Dynamic.literal(_highlightResult = _highlightResult.asInstanceOf[js.Any], objectID = objectID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_HighlightResult[TDoc]]
  }
}

