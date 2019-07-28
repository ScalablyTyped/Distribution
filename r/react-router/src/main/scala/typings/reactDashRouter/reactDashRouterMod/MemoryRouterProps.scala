package typings.reactDashRouter.reactDashRouterMod

import typings.history.historyMod.LocationDescriptor
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryRouterProps extends js.Object {
  var getUserConfirmation: js.UndefOr[
    js.Function2[/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit], Unit]
  ] = js.undefined
  var initialEntries: js.UndefOr[js.Array[LocationDescriptor[LocationState]]] = js.undefined
  var initialIndex: js.UndefOr[Double] = js.undefined
  var keyLength: js.UndefOr[Double] = js.undefined
}

object MemoryRouterProps {
  @scala.inline
  def apply(
    getUserConfirmation: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit = null,
    initialEntries: js.Array[LocationDescriptor[LocationState]] = null,
    initialIndex: Int | Double = null,
    keyLength: Int | Double = null
  ): MemoryRouterProps = {
    val __obj = js.Dynamic.literal()
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2(getUserConfirmation))
    if (initialEntries != null) __obj.updateDynamic("initialEntries")(initialEntries)
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (keyLength != null) __obj.updateDynamic("keyLength")(keyLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryRouterProps]
  }
}

