package typings.primereact.componentsChartChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Object] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object ChartProps {
  @scala.inline
  def apply(
    className: String = null,
    data: js.Object = null,
    height: String = null,
    id: String = null,
    options: js.Object = null,
    style: js.Object = null,
    `type`: String = null,
    width: String = null
  ): ChartProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (data != null) __obj.updateDynamic("data")(data)
    if (height != null) __obj.updateDynamic("height")(height)
    if (id != null) __obj.updateDynamic("id")(id)
    if (options != null) __obj.updateDynamic("options")(options)
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ChartProps]
  }
}

