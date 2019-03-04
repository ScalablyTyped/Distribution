package typings
package reactDashEasyDashChartLib.reactDashEasyDashChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendProps extends js.Object {
  /** Override the color of the items */
  var config: js.UndefOr[js.Array[reactDashEasyDashChartLib.Anon_ColorString]] = js.undefined
  var data: js.Array[_]
  var dataId: java.lang.String
  /** change list items to inline-block (default block) */
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  /** Override the css styles of individual components, see http://rma-consulting.github.io/react-easy-chart/legend/index.html */
  var styles: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.CSSProperties]
  ] = js.undefined
}

object LegendProps {
  @scala.inline
  def apply(
    data: js.Array[_],
    dataId: java.lang.String,
    config: js.Array[reactDashEasyDashChartLib.Anon_ColorString] = null,
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    styles: org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.CSSProperties] = null
  ): LegendProps = {
    val __obj = js.Dynamic.literal(data = data, dataId = dataId)
    if (config != null) __obj.updateDynamic("config")(config)
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[LegendProps]
  }
}

