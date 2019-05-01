package typings
package reactDashMeasureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMeasureMod {
  type BoundingRect = Dimensions with Margin
  type Margin = TopLeft with BottomRight
  type Measure = reactLib.reactMod.Component[MeasureProps, js.Object, js.Any]
  type MeasuredComponent[T] = reactLib.reactMod.ComponentType[T with MeasuredComponentProps]
  type Rect = TopLeft with Dimensions
}
