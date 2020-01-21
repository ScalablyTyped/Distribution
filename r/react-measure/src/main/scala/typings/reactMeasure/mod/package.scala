package typings.reactMeasure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BoundingRect = typings.reactMeasure.mod.Dimensions with typings.reactMeasure.mod.Margin
  type Margin = typings.reactMeasure.mod.TopLeft with typings.reactMeasure.mod.BottomRight
  type Measure = typings.react.mod.Component[typings.reactMeasure.mod.MeasureProps, js.Object, js.Any]
  type MeasuredComponent[T] = typings.react.mod.ComponentType[T with typings.reactMeasure.mod.MeasuredComponentProps]
  type Rect = typings.reactMeasure.mod.TopLeft with typings.reactMeasure.mod.Dimensions
}
