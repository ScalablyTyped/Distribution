package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SerachMatchCombination...
  */
trait ISerachMatchCombination extends js.Object {
  /**
    * Information about the search matches.
    */
  var qFieldMatches: js.Array[ISerachFieldMatch]
  /**
    * Index of the search result, starting from 0.
    */
  var qId: Double
}

object ISerachMatchCombination {
  @scala.inline
  def apply(qFieldMatches: js.Array[ISerachFieldMatch], qId: Double): ISerachMatchCombination = {
    val __obj = js.Dynamic.literal(qFieldMatches = qFieldMatches, qId = qId)
  
    __obj.asInstanceOf[ISerachMatchCombination]
  }
}

