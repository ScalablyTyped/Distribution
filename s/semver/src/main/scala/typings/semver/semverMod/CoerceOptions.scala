package typings.semver.semverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoerceOptions extends Options {
  /**
    * Used by `coerce()` to coerce from right to left.
    *
    * @default false
    *
    * @example
    * coerce('1.2.3.4', { rtl: true });
    * // => SemVer { version: '2.3.4', ... }
    *
    * @since 6.2.0
    */
  var rtl: js.UndefOr[Boolean] = js.undefined
}

object CoerceOptions {
  @scala.inline
  def apply(
    includePrerelease: js.UndefOr[Boolean] = js.undefined,
    loose: js.UndefOr[Boolean] = js.undefined,
    rtl: js.UndefOr[Boolean] = js.undefined
  ): CoerceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includePrerelease)) __obj.updateDynamic("includePrerelease")(includePrerelease)
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose)
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    __obj.asInstanceOf[CoerceOptions]
  }
}

