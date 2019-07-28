package typings.qlikDashVisualizationextensions.BackendAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICharRange extends js.Object {
  /**
    * Number of occurrences found
    * Integer
    */
  var qCharCount: Double
  /**
    * Position of the first search occurrence
    * Integer
    */
  var qCharPos: Double
}

object ICharRange {
  @scala.inline
  def apply(qCharCount: Double, qCharPos: Double): ICharRange = {
    val __obj = js.Dynamic.literal(qCharCount = qCharCount, qCharPos = qCharPos)
  
    __obj.asInstanceOf[ICharRange]
  }
}

