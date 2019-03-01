package typings
package sinonDashTestLib.sinonDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var injectInto: js.UndefOr[js.Any] = js.undefined
  var injectIntoThis: js.UndefOr[scala.Boolean] = js.undefined
  var properties: js.UndefOr[
    js.Array[
      sinonDashTestLib.sinonDashTestLibStrings.spy | sinonDashTestLib.sinonDashTestLibStrings.stub | sinonDashTestLib.sinonDashTestLibStrings.mock | sinonDashTestLib.sinonDashTestLibStrings.clock | sinonDashTestLib.sinonDashTestLibStrings.server | sinonDashTestLib.sinonDashTestLibStrings.requests
    ]
  ] = js.undefined
  var useFakeServer: js.UndefOr[scala.Boolean] = js.undefined
  var useFakeTimers: js.UndefOr[scala.Boolean] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    injectInto: js.Any = null,
    injectIntoThis: js.UndefOr[scala.Boolean] = js.undefined,
    properties: js.Array[
      sinonDashTestLib.sinonDashTestLibStrings.spy | sinonDashTestLib.sinonDashTestLibStrings.stub | sinonDashTestLib.sinonDashTestLibStrings.mock | sinonDashTestLib.sinonDashTestLibStrings.clock | sinonDashTestLib.sinonDashTestLibStrings.server | sinonDashTestLib.sinonDashTestLibStrings.requests
    ] = null,
    useFakeServer: js.UndefOr[scala.Boolean] = js.undefined,
    useFakeTimers: js.UndefOr[scala.Boolean] = js.undefined
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (injectInto != null) __obj.updateDynamic("injectInto")(injectInto)
    if (!js.isUndefined(injectIntoThis)) __obj.updateDynamic("injectIntoThis")(injectIntoThis)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (!js.isUndefined(useFakeServer)) __obj.updateDynamic("useFakeServer")(useFakeServer)
    if (!js.isUndefined(useFakeTimers)) __obj.updateDynamic("useFakeTimers")(useFakeTimers)
    __obj.asInstanceOf[Configuration]
  }
}

