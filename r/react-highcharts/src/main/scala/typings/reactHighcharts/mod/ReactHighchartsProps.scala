package typings.reactHighcharts.mod

import typings.highcharts.mod.Options
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
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Highcharts.ChartObject */ /* chart */ js.Any, 
      Unit
    ]
  ] = js.undefined
  /**
    * Highcharts configuration options.
    */
  var config: Options
  /**
    * Chart will not rerender if the config is referentially equal to previous and this property is true
    */
  var isPureConfig: js.UndefOr[Boolean] = js.undefined
}

object ReactHighchartsProps {
  @scala.inline
  def apply(
    config: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Highcharts.ChartObject */ /* chart */ js.Any => Unit = null,
    isPureConfig: js.UndefOr[Boolean] = js.undefined
  ): ReactHighchartsProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(isPureConfig)) __obj.updateDynamic("isPureConfig")(isPureConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactHighchartsProps]
  }
}

