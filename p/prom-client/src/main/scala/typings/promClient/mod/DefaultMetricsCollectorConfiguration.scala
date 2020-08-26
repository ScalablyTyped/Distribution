package typings.promClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultMetricsCollectorConfiguration extends js.Object {
  var prefix: js.UndefOr[String] = js.native
  var register: js.UndefOr[Registry] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var timestamps: js.UndefOr[Boolean] = js.native
}

object DefaultMetricsCollectorConfiguration {
  @scala.inline
  def apply(): DefaultMetricsCollectorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultMetricsCollectorConfiguration]
  }
  @scala.inline
  implicit class DefaultMetricsCollectorConfigurationOps[Self <: DefaultMetricsCollectorConfiguration] (val x: Self) extends AnyVal {
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
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setRegister(value: Registry): Self = this.set("register", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegister: Self = this.set("register", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTimestamps(value: Boolean): Self = this.set("timestamps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamps: Self = this.set("timestamps", js.undefined)
  }
  
}

