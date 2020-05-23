package typings.promClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultMetricsCollectorConfiguration extends js.Object {
  var prefix: js.UndefOr[String] = js.undefined
  var register: js.UndefOr[Registry] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var timestamps: js.UndefOr[Boolean] = js.undefined
}

object DefaultMetricsCollectorConfiguration {
  @scala.inline
  def apply(
    prefix: String = null,
    register: Registry = null,
    timeout: js.UndefOr[Double] = js.undefined,
    timestamps: js.UndefOr[Boolean] = js.undefined
  ): DefaultMetricsCollectorConfiguration = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (register != null) __obj.updateDynamic("register")(register.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamps)) __obj.updateDynamic("timestamps")(timestamps.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultMetricsCollectorConfiguration]
  }
}

