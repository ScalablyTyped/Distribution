package typings
package reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait locationChangeAction[P /* <: historyLib.historyMod.Pathname */, S /* <: historyLib.historyMod.Search */, H /* <: historyLib.historyMod.Hash */]
  extends reduxLib.reduxMod.Action[
      reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingLibStrings.`ROUTER/LOCATION_CHANGE`
    ] {
  var payload: reduxDashFirstDashRoutingLib.Anon_Hash[H, P, S]
}

