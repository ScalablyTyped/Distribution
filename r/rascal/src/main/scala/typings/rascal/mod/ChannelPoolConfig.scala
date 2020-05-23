package typings.rascal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelPoolConfig extends js.Object {
  var autostart: js.UndefOr[Boolean] = js.undefined
  var evictionRunIntervalMillis: js.UndefOr[Double] = js.undefined
  var idleTimeoutMillis: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var testOnBorrow: js.UndefOr[Boolean] = js.undefined
}

object ChannelPoolConfig {
  @scala.inline
  def apply(
    autostart: js.UndefOr[Boolean] = js.undefined,
    evictionRunIntervalMillis: js.UndefOr[Double] = js.undefined,
    idleTimeoutMillis: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    testOnBorrow: js.UndefOr[Boolean] = js.undefined
  ): ChannelPoolConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(evictionRunIntervalMillis)) __obj.updateDynamic("evictionRunIntervalMillis")(evictionRunIntervalMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(idleTimeoutMillis)) __obj.updateDynamic("idleTimeoutMillis")(idleTimeoutMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(testOnBorrow)) __obj.updateDynamic("testOnBorrow")(testOnBorrow.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelPoolConfig]
  }
}

