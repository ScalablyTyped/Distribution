package typings.reactToolbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tooltipMod {
  type tooltipHOC[P] = js.Function1[
    /* componentClass */ typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState], 
    typings.reactToolbox.tooltipMod.TooltippedComponentClass[P]
  ]
}
