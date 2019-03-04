package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxPageTreeLevel extends js.Object {
  /**
    * Number of dimensions to include in the tree.
    */
  var qDepth: scala.Double
  /**
    * The first dimension that is to be part of the tree, counted from the left.
    * For example, if qLeft is equal to 1, omit nodes from the first dimension in the current sort order.
    */
  var qLeft: scala.Double
}

object INxPageTreeLevel {
  @scala.inline
  def apply(qDepth: scala.Double, qLeft: scala.Double): INxPageTreeLevel = {
    val __obj = js.Dynamic.literal(qDepth = qDepth, qLeft = qLeft)
  
    __obj.asInstanceOf[INxPageTreeLevel]
  }
}

