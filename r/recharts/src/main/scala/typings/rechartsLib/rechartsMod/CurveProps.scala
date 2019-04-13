package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait CurveProps extends EventAttributes {
  var baseLine: js.UndefOr[scala.Double | js.Array[_]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var connectNulls: js.UndefOr[scala.Boolean] = js.undefined
  var layout: js.UndefOr[LayoutType] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var pathRef: js.UndefOr[reactLib.reactMod.Ref[_]] = js.undefined
  var points: js.UndefOr[js.Array[js.Object]] = js.undefined
  var `type`: js.UndefOr[LineType] = js.undefined
}

object CurveProps {
  @scala.inline
  def apply(
    baseLine: scala.Double | js.Array[_] = null,
    className: java.lang.String = null,
    connectNulls: js.UndefOr[scala.Boolean] = js.undefined,
    layout: LayoutType = null,
    onClick: RechartsFunction = null,
    onMouseDown: RechartsFunction = null,
    onMouseEnter: RechartsFunction = null,
    onMouseLeave: RechartsFunction = null,
    onMouseMove: RechartsFunction = null,
    onMouseOut: RechartsFunction = null,
    onMouseOver: RechartsFunction = null,
    onMouseUp: RechartsFunction = null,
    onTouchCancel: RechartsFunction = null,
    onTouchEnd: RechartsFunction = null,
    onTouchMove: RechartsFunction = null,
    onTouchStart: RechartsFunction = null,
    path: java.lang.String = null,
    pathRef: reactLib.reactMod.Ref[_] = null,
    points: js.Array[js.Object] = null,
    `type`: LineType = null
  ): CurveProps = {
    val __obj = js.Dynamic.literal()
    if (baseLine != null) __obj.updateDynamic("baseLine")(baseLine.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(connectNulls)) __obj.updateDynamic("connectNulls")(connectNulls)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathRef != null) __obj.updateDynamic("pathRef")(pathRef.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurveProps]
  }
}

