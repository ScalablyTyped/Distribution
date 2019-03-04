package typings
package qlikDashVisualizationextensionsLib.BackendAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxPage extends js.Object {
  /**
    * Number of rows or elements in the page. The indexing of the rows may vary depending on
    * whether the cells are expanded or not (parameter qAlwaysFullyExpanded in HyperCubeDef).
    */
  var qHeight: scala.Double
  /**
    * Position from the left.
    * Corresponds to the first column.
    */
  var qLeft: scala.Double
  /**
    * Position from the top.
    * Corresponds to the first row.
    */
  var qTop: scala.Double
  /**
    * Number of columns in the page. The indexing of the columns may vary depending on whether
    * the cells are expanded or not (parameter qAlwaysFullyExpanded in HyperCubeDef).
    */
  var qWidth: scala.Double
}

object INxPage {
  @scala.inline
  def apply(qHeight: scala.Double, qLeft: scala.Double, qTop: scala.Double, qWidth: scala.Double): INxPage = {
    val __obj = js.Dynamic.literal(qHeight = qHeight, qLeft = qLeft, qTop = qTop, qWidth = qWidth)
  
    __obj.asInstanceOf[INxPage]
  }
}

