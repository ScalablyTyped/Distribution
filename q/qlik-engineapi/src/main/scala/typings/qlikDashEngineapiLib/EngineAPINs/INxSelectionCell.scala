package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxSelectionCell...
  */
trait INxSelectionCell extends js.Object {
  /**
    * Column index to select
    * Indexing starts from 0.
    * If the cell's type is:
    *   D, the index is based on the data matrix.
    *   T, the index is based on the data matrix
    *   L, the index is based on the left dimensions indexes
    */
  var qCol: scala.Double
  /**
    * Row index to select
    * Indexing starts from 0.
    * If the cell's type is:
    * - D, the index is based on the data matrix.
    * - T, the index is based on the top dimensions indexes
    * - L, the index is based on the data matrix
    */
  var qRow: scala.Double
  /**
    * Type of cells to select
    * One of:
    *                 D for data
    *                 T for top dimension cells
    *                 L for left dimension cells
    */
  var qType: NxSelectionCellType
}

