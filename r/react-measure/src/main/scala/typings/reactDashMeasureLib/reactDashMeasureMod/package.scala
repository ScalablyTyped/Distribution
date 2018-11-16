package typings
package reactDashMeasureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMeasureMod {
  type BoundingRect = Dimensions with Margin
  type Margin = TopLeft with BottomRight
  type Measure = reactLib.reactMod.Component[MeasureProps, js.Object, js.Any]
  type MeasurementType = reactDashMeasureLib.reactDashMeasureLibStrings.client | reactDashMeasureLib.reactDashMeasureLibStrings.offset | reactDashMeasureLib.reactDashMeasureLibStrings.scroll | reactDashMeasureLib.reactDashMeasureLibStrings.bounds | reactDashMeasureLib.reactDashMeasureLibStrings.margin
  type Rect = TopLeft with Dimensions
}
