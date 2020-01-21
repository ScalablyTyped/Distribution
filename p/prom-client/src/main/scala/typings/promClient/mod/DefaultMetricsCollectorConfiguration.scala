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
    timeout: Int | Double = null,
    timestamps: js.UndefOr[Boolean] = js.undefined
  ): DefaultMetricsCollectorConfiguration = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (register != null) __obj.updateDynamic("register")(register.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamps)) __obj.updateDynamic("timestamps")(timestamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultMetricsCollectorConfiguration]
  }
}

