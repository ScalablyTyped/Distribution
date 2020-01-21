package typings.reactToolbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTooltipMod {
  type tooltipHOC[P] = js.Function1[
    /* componentClass */ typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState], 
    typings.reactToolbox.libTooltipMod.TooltippedComponentClass[P]
  ]
}
