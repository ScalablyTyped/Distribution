package typings.reactDashToolbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTooltipMod {
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState

  type tooltipHOC[P] = js.Function1[
    /* componentClass */ ComponentClass[P, ComponentState], 
    TooltippedComponentClass[P]
  ]
}
