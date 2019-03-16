package typings
package reactDashHighchartsLib.reactDashHighchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Props for ReactHighcharts component.
  */
trait ReactHighchartsProps extends js.Object {
  /**
    *
    * @param after-render callback.
    */
  var callback: js.UndefOr[
    js.Function1[/* chart */ highchartsLib.highchartsMod.HighchartsNs.ChartObject, scala.Unit]
  ] = js.undefined
  /**
    * Highcharts configuration options.
    */
  var config: highchartsLib.highchartsMod.HighchartsNs.Options
  /**
    * Chart will not rerender if the config is referentially equal to previous and this property is true
    */
  var isPureConfig: js.UndefOr[scala.Boolean] = js.undefined
}

object ReactHighchartsProps {
  @scala.inline
  def apply(
    config: highchartsLib.highchartsMod.HighchartsNs.Options,
    callback: /* chart */ highchartsLib.highchartsMod.HighchartsNs.ChartObject => scala.Unit = null,
    isPureConfig: js.UndefOr[scala.Boolean] = js.undefined
  ): ReactHighchartsProps = {
    val __obj = js.Dynamic.literal(config = config)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(isPureConfig)) __obj.updateDynamic("isPureConfig")(isPureConfig)
    __obj.asInstanceOf[ReactHighchartsProps]
  }
}

