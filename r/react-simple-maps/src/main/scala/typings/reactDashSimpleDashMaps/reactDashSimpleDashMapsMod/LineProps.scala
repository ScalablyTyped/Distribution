package typings.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.SVGProps<std.SVGPathElement>, 'from' | 'to'> ]: react.react.SVGProps<std.SVGPathElement>[P]} */ trait LineProps extends js.Object {
  /**
    * @default [[0, 0], [0, 0]]
    */
  var coordinates: js.UndefOr[js.Array[Point]] = js.undefined
  /**
    * @default "transparent"
    */
  var fill: js.UndefOr[String] = js.undefined
  /**
    * @default [0, 0]
    */
  var from: js.UndefOr[Point] = js.undefined
  /**
    * @default "currentcolor"
    */
  var stroke: js.UndefOr[String] = js.undefined
  /**
    * @default 3
    */
  var strokeWidth: js.UndefOr[Double | String] = js.undefined
  /**
    * @default [0, 0]
    */
  var to: js.UndefOr[Point] = js.undefined
}

object LineProps {
  @scala.inline
  def apply(
    coordinates: js.Array[Point] = null,
    fill: String = null,
    from: Point = null,
    stroke: String = null,
    strokeWidth: Double | String = null,
    to: Point = null
  ): LineProps = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineProps]
  }
}

