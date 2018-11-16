package typings
package reactDashDomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object testDashUtilsMod {
  type EventSimulator = js.Function2[
    /* element */ reactLib.Element | (reactLib.reactMod.Component[js.Any, js.Object, js.Any]), 
    /* eventData */ js.UndefOr[SyntheticEventData], 
    scala.Unit
  ]
}
