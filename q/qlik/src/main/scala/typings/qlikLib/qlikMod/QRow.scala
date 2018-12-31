package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRow extends js.Object {
  var cells: js.Array[QDimensionCell | QMeasureCell]
  var dimensions: js.Array[QDimensionCell]
  var measures: js.Array[QMeasureCell]
}

