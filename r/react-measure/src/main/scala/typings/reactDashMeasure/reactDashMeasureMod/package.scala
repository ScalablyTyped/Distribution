package typings.reactDashMeasure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMeasureMod {
  import typings.react.reactMod.Component
  import typings.react.reactMod.ComponentType

  type BoundingRect = Dimensions with Margin
  type Margin = TopLeft with BottomRight
  type Measure = Component[MeasureProps, js.Object, js.Any]
  type MeasuredComponent[T] = ComponentType[T with MeasuredComponentProps]
  type Rect = TopLeft with Dimensions
}
