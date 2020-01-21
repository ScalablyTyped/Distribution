package typings.reactToolbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRippleMod {
  type RippledComponentFactory = js.Function1[
    /* component */ (typings.react.mod.ComponentClass[js.Any, typings.react.mod.ComponentState]) | typings.react.mod.SFC[js.Any], 
    (typings.react.mod.ComponentClass[js.Any, typings.react.mod.ComponentState]) | typings.react.mod.SFC[js.Any]
  ]
}
