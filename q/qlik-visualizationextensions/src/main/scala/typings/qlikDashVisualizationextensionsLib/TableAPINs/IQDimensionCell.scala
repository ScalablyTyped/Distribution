package typings
package qlikDashVisualizationextensionsLib.TableAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IQDimensionCell extends IQMeasureCell {
  /**
           * Cell value index.
           */
  var qElemNumber: scala.Double
  /**
           * Cell state.
           */
  var qState: java.lang.String
  /**
           * Selects the value in this cell.
           */
  def select(): scala.Unit
}

