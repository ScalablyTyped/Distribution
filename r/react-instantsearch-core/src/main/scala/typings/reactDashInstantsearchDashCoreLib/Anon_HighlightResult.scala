package typings
package reactDashInstantsearchDashCoreLib

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
  var _highlightResult: reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.HighlightResult[TDoc]
  var objectID: java.lang.String
}

object Anon_HighlightResult {
  @scala.inline
  def apply[TDoc](
    _highlightResult: reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.HighlightResult[TDoc],
    objectID: java.lang.String
  ): Anon_HighlightResult[TDoc] = {
    val __obj = js.Dynamic.literal(_highlightResult = _highlightResult, objectID = objectID)
  
    __obj.asInstanceOf[Anon_HighlightResult[TDoc]]
  }
}

