package typings
package reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait replaceAction[T /* <: historyLib.historyMod.Path | historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState] */]
  extends reduxLib.reduxMod.Action[
      reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingLibStrings.`ROUTER/REPLACE`
    ] {
  var payload: T
}

