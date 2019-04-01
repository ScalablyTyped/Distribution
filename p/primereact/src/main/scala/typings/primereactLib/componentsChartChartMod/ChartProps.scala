package typings
package primereactLib.componentsChartChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Object] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object ChartProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    data: js.Object = null,
    height: java.lang.String = null,
    id: java.lang.String = null,
    options: js.Object = null,
    style: js.Object = null,
    `type`: java.lang.String = null,
    width: java.lang.String = null
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

