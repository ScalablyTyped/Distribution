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

