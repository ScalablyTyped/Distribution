package typings
package qlikDashVisualizationextensionsLib.TableAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IQMeasureCell extends js.Object {
  /**
           * Optional. Cell numeric value, if cell is numeric.
           */
  var qNum: js.UndefOr[scala.Double] = js.undefined
  /**
           * Cell value formatted as set up in properties.
           */
  var qText: java.lang.String
  /**
           * Gets the value of this cell as a percentage of the total.
           * Might be more than 100% if this is an average.
           */
  def getPercent(): scala.Double
  /**
           * Gets the value of this cell as a percentage of the maximum.
           */
  def getPercentOfMax(): scala.Double
}

