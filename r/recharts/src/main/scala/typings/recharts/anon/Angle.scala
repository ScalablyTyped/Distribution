package typings.recharts.anon

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.recharts.mod.ContentRenderer
import typings.recharts.mod.LabelFormatter
import typings.recharts.mod.LabelProps
import typings.recharts.mod.PositionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Angle extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clockWise: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[ReactElement | ContentRenderer[LabelProps]] = js.undefined
  var data: js.UndefOr[Double] = js.undefined
  var formatter: js.UndefOr[LabelFormatter] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[PositionType] = js.undefined
}

object Angle {
  @scala.inline
  def apply(
    angle: js.UndefOr[Double] = js.undefined,
    children: js.Array[ReactNode] | ReactNode = null,
    className: String = null,
    clockWise: js.UndefOr[Boolean] = js.undefined,
    content: ReactElement | ContentRenderer[LabelProps] = null,
    data: js.UndefOr[Double] = js.undefined,
    formatter: /* label */ String | Double => ReactNode = null,
    id: String = null,
    offset: js.UndefOr[Double] = js.undefined,
    position: PositionType = null
  ): Angle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clockWise)) __obj.updateDynamic("clockWise")(clockWise.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.get.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Angle]
  }
}

