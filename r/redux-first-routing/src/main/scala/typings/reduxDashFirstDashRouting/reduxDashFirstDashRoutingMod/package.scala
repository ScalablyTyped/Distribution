package typings.reduxDashFirstDashRouting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashFirstDashRoutingMod {
  import typings.redux.reduxMod.Action
  import typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.ROUTERSlashGO_BACK
  import typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.ROUTERSlashGO_FORWARD

  type goBackAction = Action[ROUTERSlashGO_BACK]
  type goForwardAction = Action[ROUTERSlashGO_FORWARD]
}
