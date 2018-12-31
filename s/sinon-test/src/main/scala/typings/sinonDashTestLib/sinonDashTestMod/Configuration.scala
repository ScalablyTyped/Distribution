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

