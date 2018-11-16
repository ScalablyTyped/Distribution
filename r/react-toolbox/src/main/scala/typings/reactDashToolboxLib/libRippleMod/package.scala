package typings
package reactDashToolboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRippleMod {
  type RippledComponentFactory = js.Function1[
    /* component */ (reactLib.reactMod.ReactNs.ComponentClass[js.Any, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.SFC[js.Any], 
    (reactLib.reactMod.ReactNs.ComponentClass[js.Any, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.SFC[js.Any]
  ]
}
