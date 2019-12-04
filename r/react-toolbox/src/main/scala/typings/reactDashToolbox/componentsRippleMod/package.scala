package typings.reactDashToolbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object componentsRippleMod {
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.SFC

  type RippledComponentFactory = js.Function1[
    /* component */ (ComponentClass[js.Any, ComponentState]) | SFC[js.Any], 
    (ComponentClass[js.Any, ComponentState]) | SFC[js.Any]
  ]
}
