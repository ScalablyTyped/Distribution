package typings
package reactDashToolboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRippleMod {
  type RippledComponentFactory = js.Function1[
    /* component */ (reactLib.reactMod.ComponentClass[js.Any, reactLib.reactMod.ComponentState]) | reactLib.reactMod.SFC[js.Any], 
    (reactLib.reactMod.ComponentClass[js.Any, reactLib.reactMod.ComponentState]) | reactLib.reactMod.SFC[js.Any]
  ]
}
