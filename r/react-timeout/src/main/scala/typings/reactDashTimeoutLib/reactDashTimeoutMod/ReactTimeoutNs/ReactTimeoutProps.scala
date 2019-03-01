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
  var requestAnimationFrame: js.UndefOr[js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], Id]] = js.undefined
  var setImmediate: js.UndefOr[
    js.Function2[
      /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], 
      /* repeated */ js.Any, 
      Id
    ]
  ] = js.undefined
  var setInterval: js.UndefOr[
    js.Function3[
      /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], 
      /* ms */ scala.Double, 
      /* repeated */ js.Any, 
      Id
    ]
  ] = js.undefined
  var setTimeout: js.UndefOr[
    js.Function3[
      /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], 
      /* ms */ scala.Double, 
      /* repeated */ js.Any, 
      Timer
    ]
  ] = js.undefined
}

object ReactTimeoutProps {
  @scala.inline
  def apply(
    cancelAnimationFrame: js.Function1[/* id */ Id, scala.Unit] = null,
    clearImmediate: js.Function1[/* id */ Id, scala.Unit] = null,
    clearInterval: js.Function1[/* id */ Id, scala.Unit] = null,
    clearTimeout: js.Function1[/* timer */ Timer, scala.Unit] = null,
    requestAnimationFrame: js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], Id] = null,
    setImmediate: js.Function2[
      /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], 
      /* repeated */ js.Any, 
      Id
    ] = null,
    setInterval: js.Function3[
      /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], 
      /* ms */ scala.Double, 
      /* repeated */ js.Any, 
      Id
    ] = null,
    setTimeout: js.Function3[
      /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], 
      /* ms */ scala.Double, 
      /* repeated */ js.Any, 
      Timer
    ] = null
  ): ReactTimeoutProps = {
    val __obj = js.Dynamic.literal()
    if (cancelAnimationFrame != null) __obj.updateDynamic("cancelAnimationFrame")(cancelAnimationFrame)
    if (clearImmediate != null) __obj.updateDynamic("clearImmediate")(clearImmediate)
    if (clearInterval != null) __obj.updateDynamic("clearInterval")(clearInterval)
    if (clearTimeout != null) __obj.updateDynamic("clearTimeout")(clearTimeout)
    if (requestAnimationFrame != null) __obj.updateDynamic("requestAnimationFrame")(requestAnimationFrame)
    if (setImmediate != null) __obj.updateDynamic("setImmediate")(setImmediate)
    if (setInterval != null) __obj.updateDynamic("setInterval")(setInterval)
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(setTimeout)
    __obj.asInstanceOf[ReactTimeoutProps]
  }
}

