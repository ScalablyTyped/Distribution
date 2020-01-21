package typings.reactDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object testUtilsMod {
  type EventSimulator = js.Function2[
    /* element */ typings.std.Element | (typings.react.mod.Component[js.Any, js.Object, js.Any]), 
    /* eventData */ js.UndefOr[typings.reactDom.testUtilsMod.SyntheticEventData], 
    scala.Unit
  ]
}
