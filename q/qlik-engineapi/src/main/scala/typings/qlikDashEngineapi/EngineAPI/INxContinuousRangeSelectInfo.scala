package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxContinuousRangeSelectInfo with extends of RangeSelectInfo
  */
trait INxContinuousRangeSelectInfo extends IRangeSelectInfo {
  /**
    * Dimension index.
    */
  var qDimIx: Double
}

object INxContinuousRangeSelectInfo {
  @scala.inline
  def apply(qDimIx: Double, qRange: IRange): INxContinuousRangeSelectInfo = {
    val __obj = js.Dynamic.literal(qDimIx = qDimIx.asInstanceOf[js.Any], qRange = qRange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxContinuousRangeSelectInfo]
  }
}

