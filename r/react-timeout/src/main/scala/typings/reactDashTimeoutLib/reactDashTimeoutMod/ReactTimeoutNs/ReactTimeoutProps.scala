package typings
package reactDashTimeoutLib.reactDashTimeoutMod.ReactTimeoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReactTimeoutProps extends js.Object {
  var cancelAnimationFrame: js.UndefOr[js.Function1[/* id */ Id, scala.Unit]] = js.undefined
  var clearImmediate: js.UndefOr[js.Function1[/* id */ Id, scala.Unit]] = js.undefined
  var clearInterval: js.UndefOr[js.Function1[/* id */ Id, scala.Unit]] = js.undefined
  var clearTimeout: js.UndefOr[js.Function1[/* timer */ Timer, scala.Unit]] = js.undefined
  var requestAnimationFrame: js.UndefOr[js.Function1[/* callback */ js.Function1[/* repeated */js.Any, scala.Unit], Id]] = js.undefined
  var setImmediate: js.UndefOr[
    js.Function2[
      /* callback */ js.Function1[/* repeated */js.Any, scala.Unit], 
      /* repeated */js.Any, 
      Id
    ]
  ] = js.undefined
  var setInterval: js.UndefOr[
    js.Function3[
      /* callback */ js.Function1[/* repeated */js.Any, scala.Unit], 
      /* ms */ scala.Double, 
      /* repeated */js.Any, 
      Id
    ]
  ] = js.undefined
  var setTimeout: js.UndefOr[
    js.Function3[
      /* callback */ js.Function1[/* repeated */js.Any, scala.Unit], 
      /* ms */ scala.Double, 
      /* repeated */js.Any, 
      Timer
    ]
  ] = js.undefined
}

