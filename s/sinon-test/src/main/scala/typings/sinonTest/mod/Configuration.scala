package typings.sinonTest.mod

import typings.sinonTest.sinonTestStrings.clock
import typings.sinonTest.sinonTestStrings.mock
import typings.sinonTest.sinonTestStrings.requests
import typings.sinonTest.sinonTestStrings.server
import typings.sinonTest.sinonTestStrings.spy
import typings.sinonTest.sinonTestStrings.stub
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
    if (injectInto != null) __obj.updateDynamic("injectInto")(injectInto.asInstanceOf[js.Any])
    if (!js.isUndefined(injectIntoThis)) __obj.updateDynamic("injectIntoThis")(injectIntoThis.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(useFakeServer)) __obj.updateDynamic("useFakeServer")(useFakeServer.asInstanceOf[js.Any])
    if (!js.isUndefined(useFakeTimers)) __obj.updateDynamic("useFakeTimers")(useFakeTimers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

