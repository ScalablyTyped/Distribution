package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rect...
  */
trait IRect extends js.Object {
  /**
    * Number of rows or elements in the page. The indexing of the rows may vary depending on whether the cells are
    * expanded or not (parameter qAlwaysFullyExpanded in HyperCubeDef).
    */
  var qHeight: Double
  /**
    * Position from the left.
    * Corresponds to the first column.
    */
  var qLeft: Double
  /**
    * Position from the top.
    * Corresponds to the first row.
    */
  var qTop: Double
  /**
    * Number of columns in the page. The indexing of the columns may vary depending on whether the cells are
    * expanded or not (parameter qAlwaysFullyExpanded in HyperCubeDef).
    */
  var qWidth: Double
}

object IRect {
  @scala.inline
  def apply(qHeight: Double, qLeft: Double, qTop: Double, qWidth: Double): IRect = {
    val __obj = js.Dynamic.literal(qHeight = qHeight, qLeft = qLeft, qTop = qTop, qWidth = qWidth)
  
    __obj.asInstanceOf[IRect]
  }
}

