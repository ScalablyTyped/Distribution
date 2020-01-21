package typings.recharts.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelListProps extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clockWise: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[ReactElement | ContentRenderer[LabelProps]] = js.undefined
  var data: js.UndefOr[Double] = js.undefined
  var dataKey: String | Double | RechartsFunction
  var formatter: js.UndefOr[LabelFormatter] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[PositionType] = js.undefined
  var valueAccessor: js.UndefOr[RechartsFunction] = js.undefined
}

object LabelListProps {
  @scala.inline
  def apply(
    dataKey: String | Double | RechartsFunction,
    angle: Int | Double = null,
    children: js.Array[ReactNode] | ReactNode = null,
    className: String = null,
    clockWise: js.UndefOr[Boolean] = js.undefined,
    content: ReactElement | ContentRenderer[LabelProps] = null,
    data: Int | Double = null,
    formatter: /* label */ String | Double => ReactNode = null,
    id: String = null,
    offset: Int | Double = null,
    position: PositionType = null,
    valueAccessor: /* repeated */ js.Any => Unit = null
  ): LabelListProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clockWise)) __obj.updateDynamic("clockWise")(clockWise.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (valueAccessor != null) __obj.updateDynamic("valueAccessor")(js.Any.fromFunction1(valueAccessor))
    __obj.asInstanceOf[LabelListProps]
  }
}

