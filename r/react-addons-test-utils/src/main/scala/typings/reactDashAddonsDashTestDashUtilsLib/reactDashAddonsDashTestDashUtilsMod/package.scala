package typings
package reactDashAddonsDashTestDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashAddonsDashTestDashUtilsMod {
  type EventSimulator = js.Function2[
    /* element */ stdLib.Element | (reactLib.reactMod.Component[js.Any, js.Object, js.Any]), 
    /* eventData */ js.UndefOr[SyntheticEventData], 
    scala.Unit
  ]
}
