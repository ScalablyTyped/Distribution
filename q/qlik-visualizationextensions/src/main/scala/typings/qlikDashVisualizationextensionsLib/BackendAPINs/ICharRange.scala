package typings
package qlikDashVisualizationextensionsLib.BackendAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICharRange extends js.Object {
  /**
    * Number of occurrences found
    * Integer
    */
  var qCharCount: scala.Double
  /**
    * Position of the first search occurrence
    * Integer
    */
  var qCharPos: scala.Double
}

object ICharRange {
  @scala.inline
  def apply(qCharCount: scala.Double, qCharPos: scala.Double): ICharRange = {
    val __obj = js.Dynamic.literal(qCharCount = qCharCount, qCharPos = qCharPos)
  
    __obj.asInstanceOf[ICharRange]
  }
}

