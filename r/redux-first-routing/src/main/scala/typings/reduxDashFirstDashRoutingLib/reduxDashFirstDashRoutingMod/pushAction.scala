package typings
package reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pushAction[T /* <: historyLib.historyMod.Path | historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState] */]
  extends reduxLib.reduxMod.Action[reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingLibStrings.`ROUTER/PUSH`] {
  var payload: T
}

