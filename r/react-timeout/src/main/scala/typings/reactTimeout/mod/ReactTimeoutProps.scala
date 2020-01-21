package typings.reactTimeout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTimeoutProps extends js.Object {
  var cancelAnimationFrame: js.UndefOr[js.Function1[/* id */ Id, Unit]] = js.undefined
  var clearImmediate: js.UndefOr[js.Function1[/* id */ Id, Unit]] = js.undefined
  var clearInterval: js.UndefOr[js.Function1[/* id */ Id, Unit]] = js.undefined
  var clearTimeout: js.UndefOr[js.Function1[/* timer */ Timer, Unit]] = js.undefined
  var requestAnimationFrame: js.UndefOr[js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Id]] = js.undefined
  var setImmediate: js.UndefOr[
    js.Function2[/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any, Id]
  ] = js.undefined
  var setInterval: js.UndefOr[
    js.Function3[
      /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
      /* ms */ Double, 
      /* repeated */ js.Any, 
      Id
    ]
  ] = js.undefined
  var setTimeout: js.UndefOr[
    js.Function3[
      /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
      /* ms */ Double, 
      /* repeated */ js.Any, 
      Timer
    ]
  ] = js.undefined
}

object ReactTimeoutProps {
  @scala.inline
  def apply(
    cancelAnimationFrame: /* id */ Id => Unit = null,
    clearImmediate: /* id */ Id => Unit = null,
    clearInterval: /* id */ Id => Unit = null,
    clearTimeout: /* timer */ Timer => Unit = null,
    requestAnimationFrame: /* callback */ js.Function1[/* repeated */ js.Any, Unit] => Id = null,
    setImmediate: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any) => Id = null,
    setInterval: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* ms */ Double, /* repeated */ js.Any) => Id = null,
    setTimeout: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* ms */ Double, /* repeated */ js.Any) => Timer = null
  ): ReactTimeoutProps = {
    val __obj = js.Dynamic.literal()
    if (cancelAnimationFrame != null) __obj.updateDynamic("cancelAnimationFrame")(js.Any.fromFunction1(cancelAnimationFrame))
    if (clearImmediate != null) __obj.updateDynamic("clearImmediate")(js.Any.fromFunction1(clearImmediate))
    if (clearInterval != null) __obj.updateDynamic("clearInterval")(js.Any.fromFunction1(clearInterval))
    if (clearTimeout != null) __obj.updateDynamic("clearTimeout")(js.Any.fromFunction1(clearTimeout))
    if (requestAnimationFrame != null) __obj.updateDynamic("requestAnimationFrame")(js.Any.fromFunction1(requestAnimationFrame))
    if (setImmediate != null) __obj.updateDynamic("setImmediate")(js.Any.fromFunction2(setImmediate))
    if (setInterval != null) __obj.updateDynamic("setInterval")(js.Any.fromFunction3(setInterval))
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(js.Any.fromFunction3(setTimeout))
    __obj.asInstanceOf[ReactTimeoutProps]
  }
}

