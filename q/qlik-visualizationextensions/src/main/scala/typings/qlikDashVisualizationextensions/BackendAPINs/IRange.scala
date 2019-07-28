package typings.qlikDashVisualizationextensions.BackendAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRange extends js.Object {
  /**
    * Highest value in the range
    * Double
    */
  var qMax: Double
  /**
    * If set to true, the range includes the highest value in the range of
    * selections (Equals to ). [bn(50500)]
    * Example: The range is [1,10]. If qMinInclEq is set to true it means
    * that 10 is included in the range of selections.
    */
  var qMaxInclEq: Boolean
  /**
    * Lowest value in the range
    * Double
    */
  var qMin: Double
  /**
    * If set to true, the range includes the lowest value in the range of
    * selections (Equals to ). [bn(50500)]
    * Example: The range is [1,10]. If qMinInclEq is set to true it means
    * that 1 is included in the range of selections.
    */
  var qMinInclEq: Boolean
}

object IRange {
  @scala.inline
  def apply(qMax: Double, qMaxInclEq: Boolean, qMin: Double, qMinInclEq: Boolean): IRange = {
    val __obj = js.Dynamic.literal(qMax = qMax, qMaxInclEq = qMaxInclEq, qMin = qMin, qMinInclEq = qMinInclEq)
  
    __obj.asInstanceOf[IRange]
  }
}

