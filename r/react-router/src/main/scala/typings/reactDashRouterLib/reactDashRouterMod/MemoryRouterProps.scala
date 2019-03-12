package typings
package reactDashRouterLib.reactDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryRouterProps extends js.Object {
  var getUserConfirmation: js.UndefOr[
    js.Function2[
      /* message */ java.lang.String, 
      /* callback */ js.Function1[/* ok */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var initialEntries: js.UndefOr[
    js.Array[historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState]]
  ] = js.undefined
  var initialIndex: js.UndefOr[scala.Double] = js.undefined
  var keyLength: js.UndefOr[scala.Double] = js.undefined
}

object MemoryRouterProps {
  @scala.inline
  def apply(
    getUserConfirmation: (/* message */ java.lang.String, /* callback */ js.Function1[/* ok */ scala.Boolean, scala.Unit]) => scala.Unit = null,
    initialEntries: js.Array[historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState]] = null,
    initialIndex: scala.Int | scala.Double = null,
    keyLength: scala.Int | scala.Double = null
  ): MemoryRouterProps = {
    val __obj = js.Dynamic.literal()
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2(getUserConfirmation))
    if (initialEntries != null) __obj.updateDynamic("initialEntries")(initialEntries)
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (keyLength != null) __obj.updateDynamic("keyLength")(keyLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryRouterProps]
  }
}

