package typings.reactDashToolbox

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRippleMod {
  type RippledComponentFactory = js.Function1[
    /* component */ (ComponentClass[js.Any, ComponentState]) | SFC[js.Any], 
    (ComponentClass[js.Any, ComponentState]) | SFC[js.Any]
  ]
}
