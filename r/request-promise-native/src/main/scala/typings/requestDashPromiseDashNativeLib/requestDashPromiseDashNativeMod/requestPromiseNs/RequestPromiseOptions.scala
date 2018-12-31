package typings
package requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestPromiseOptions
  extends requestLib.requestMod.requestNs.CoreOptions {
  var resolveWithFullResponse: js.UndefOr[scala.Boolean] = js.undefined
  var simple: js.UndefOr[scala.Boolean] = js.undefined
  var transform: js.UndefOr[
    js.Function3[
      /* body */ js.Any, 
      /* response */ requestLib.requestMod.requestNs.Response, 
      /* resolveWithFullResponse */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  var transform2xxOnly: js.UndefOr[scala.Boolean] = js.undefined
}

