package typings.qiniu.qiniuMod.conf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * @default true
    */
  var useCdnDomain: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var useHttpsDomain: js.UndefOr[Boolean] = js.undefined
  /**
    * @default null
    */
  var zone: js.UndefOr[Zone] = js.undefined
  /**
    * @default -1
    */
  var zoneExpire: js.UndefOr[Double] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    useCdnDomain: js.UndefOr[Boolean] = js.undefined,
    useHttpsDomain: js.UndefOr[Boolean] = js.undefined,
    zone: Zone = null,
    zoneExpire: Int | Double = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useCdnDomain)) __obj.updateDynamic("useCdnDomain")(useCdnDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(useHttpsDomain)) __obj.updateDynamic("useHttpsDomain")(useHttpsDomain.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    if (zoneExpire != null) __obj.updateDynamic("zoneExpire")(zoneExpire.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

