package typings.recharts.rechartsMod

import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait LabelProps extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[ReactElement | ContentRenderer[_]] = js.undefined
  var formatter: js.UndefOr[LabelFormatter] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[PositionType] = js.undefined
  var value: js.UndefOr[Double | String] = js.undefined
  var viewBox: js.UndefOr[ViewBox | PolarViewBox] = js.undefined
}

object LabelProps {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    children: js.Array[ReactNode] | ReactNode = null,
    className: String = null,
    content: ReactElement | ContentRenderer[_] = null,
    formatter: LabelFormatter = null,
    offset: Int | Double = null,
    position: PositionType = null,
    value: Double | String = null,
    viewBox: ViewBox | PolarViewBox = null
  ): LabelProps = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelProps]
  }
}

