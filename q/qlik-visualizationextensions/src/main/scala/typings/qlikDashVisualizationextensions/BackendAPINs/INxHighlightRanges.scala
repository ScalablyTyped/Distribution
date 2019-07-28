package typings.qlikDashVisualizationextensions.BackendAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxHighlightRanges extends js.Object {
  /**
    * Ranges of highlighted values
    * Array of CharRange
    */
  var qRanges: js.Array[ICharRange]
}

object INxHighlightRanges {
  @scala.inline
  def apply(qRanges: js.Array[ICharRange]): INxHighlightRanges = {
    val __obj = js.Dynamic.literal(qRanges = qRanges)
  
    __obj.asInstanceOf[INxHighlightRanges]
  }
}

