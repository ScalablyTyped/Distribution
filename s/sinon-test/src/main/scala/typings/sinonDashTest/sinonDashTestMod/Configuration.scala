package typings.sinonDashTest.sinonDashTestMod

import typings.sinonDashTest.sinonDashTestStrings.clock
import typings.sinonDashTest.sinonDashTestStrings.mock
import typings.sinonDashTest.sinonDashTestStrings.requests
import typings.sinonDashTest.sinonDashTestStrings.server
import typings.sinonDashTest.sinonDashTestStrings.spy
import typings.sinonDashTest.sinonDashTestStrings.stub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var injectInto: js.UndefOr[js.Any] = js.undefined
  var injectIntoThis: js.UndefOr[Boolean] = js.undefined
  var properties: js.UndefOr[js.Array[spy | stub | mock | clock | server | requests]] = js.undefined
  var useFakeServer: js.UndefOr[Boolean] = js.undefined
  var useFakeTimers: js.UndefOr[Boolean] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    injectInto: js.Any = null,
    injectIntoThis: js.UndefOr[Boolean] = js.undefined,
    properties: js.Array[spy | stub | mock | clock | server | requests] = null,
    useFakeServer: js.UndefOr[Boolean] = js.undefined,
    useFakeTimers: js.UndefOr[Boolean] = js.undefined
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

