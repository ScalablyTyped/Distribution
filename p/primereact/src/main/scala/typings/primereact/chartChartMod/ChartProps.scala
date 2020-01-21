package typings.primereact.chartChartMod

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
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartProps]
  }
}

