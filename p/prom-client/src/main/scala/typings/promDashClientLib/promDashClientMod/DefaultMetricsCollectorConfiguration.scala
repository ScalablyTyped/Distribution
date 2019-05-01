package typings
package promDashClientLib.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultMetricsCollectorConfiguration extends js.Object {
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var register: js.UndefOr[Registry] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object DefaultMetricsCollectorConfiguration {
  @scala.inline
  def apply(
    prefix: java.lang.String = null,
    register: Registry = null,
    timeout: scala.Int | scala.Double = null
  ): DefaultMetricsCollectorConfiguration = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (register != null) __obj.updateDynamic("register")(register)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultMetricsCollectorConfiguration]
  }
}

