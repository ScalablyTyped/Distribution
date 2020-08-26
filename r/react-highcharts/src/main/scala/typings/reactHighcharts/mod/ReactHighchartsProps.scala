package typings.reactHighcharts.mod

import typings.highcharts.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Props for ReactHighcharts component.
  */
@js.native
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
  ] = js.native
  /**
    * Highcharts configuration options.
    */
  var config: Options = js.native
  /**
    * Chart will not rerender if the config is referentially equal to previous and this property is true
    */
  var isPureConfig: js.UndefOr[Boolean] = js.native
}

object ReactHighchartsProps {
  @scala.inline
  def apply(config: Options): ReactHighchartsProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactHighchartsProps]
  }
  @scala.inline
  implicit class ReactHighchartsPropsOps[Self <: ReactHighchartsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfig(value: Options): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallback(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Highcharts.ChartObject */ /* chart */ js.Any => Unit
    ): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setIsPureConfig(value: Boolean): Self = this.set("isPureConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPureConfig: Self = this.set("isPureConfig", js.undefined)
  }
  
}

