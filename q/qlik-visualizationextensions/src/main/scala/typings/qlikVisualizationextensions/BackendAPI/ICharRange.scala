package typings.qlikVisualizationextensions.BackendAPI

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
    val __obj = js.Dynamic.literal(qCharCount = qCharCount.asInstanceOf[js.Any], qCharPos = qCharPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICharRange]
  }
}

