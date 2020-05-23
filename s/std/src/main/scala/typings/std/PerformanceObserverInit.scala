package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceObserverInit extends js.Object {
  var buffered: js.UndefOr[scala.Boolean] = js.undefined
  var entryTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object PerformanceObserverInit {
  @scala.inline
  def apply(
    buffered: js.UndefOr[scala.Boolean] = js.undefined,
    entryTypes: js.Array[java.lang.String] = null,
    `type`: java.lang.String = null
  ): PerformanceObserverInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffered)) __obj.updateDynamic("buffered")(buffered.get.asInstanceOf[js.Any])
    if (entryTypes != null) __obj.updateDynamic("entryTypes")(entryTypes.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceObserverInit]
  }
}

