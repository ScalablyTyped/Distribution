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
}

object ReactHighchartsProps {
  @scala.inline
  def apply(
    config: highchartsLib.highchartsMod.HighchartsNs.Options,
    callback: /* chart */ highchartsLib.highchartsMod.HighchartsNs.ChartObject => scala.Unit = null
  ): ReactHighchartsProps = {
    val __obj = js.Dynamic.literal(config = config)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    __obj.asInstanceOf[ReactHighchartsProps]
  }
}

