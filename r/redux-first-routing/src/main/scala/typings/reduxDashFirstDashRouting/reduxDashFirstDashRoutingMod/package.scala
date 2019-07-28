package typings.reduxDashFirstDashRouting

import typings.redux.reduxMod.Action
import typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.`ROUTER/GO_BACK`
import typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.`ROUTER/GO_FORWARD`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashFirstDashRoutingMod {
  type goBackAction = Action[`ROUTER/GO_BACK`]
  type goForwardAction = Action[`ROUTER/GO_FORWARD`]
}
