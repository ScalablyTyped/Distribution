package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchSuggestItem...
  */
trait ISearchSuggestItem extends js.Object {
  /**
    * Index of the suggestion value.
    * The indexing starts from 0 and from the left.
    */
  var qTerm: Double
  /**
    * Value of the suggestion.
    */
  var qValue: String
}

object ISearchSuggestItem {
  @scala.inline
  def apply(qTerm: Double, qValue: String): ISearchSuggestItem = {
    val __obj = js.Dynamic.literal(qTerm = qTerm.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISearchSuggestItem]
  }
}

