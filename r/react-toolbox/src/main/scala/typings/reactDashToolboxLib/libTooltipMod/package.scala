package typings
package reactDashToolboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTooltipMod {
  type tooltipHOC[P] = js.Function1[
    /* componentClass */ reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState], 
    TooltippedComponentClass[P]
  ]
}
