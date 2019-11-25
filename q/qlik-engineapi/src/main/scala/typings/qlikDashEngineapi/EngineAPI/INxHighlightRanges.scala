package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxHighlightRanges...
  */
trait INxHighlightRanges extends js.Object {
  /**
    * Ranges of highlighted values
    */
  var qRanges: js.Array[ICharRange]
}

object INxHighlightRanges {
  @scala.inline
  def apply(qRanges: js.Array[ICharRange]): INxHighlightRanges = {
    val __obj = js.Dynamic.literal(qRanges = qRanges.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxHighlightRanges]
  }
}

