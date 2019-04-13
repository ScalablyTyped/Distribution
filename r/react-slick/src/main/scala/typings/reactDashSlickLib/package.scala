package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSlickLib {
  type ComponentConstructor[TProps] = (reactLib.reactMod.ComponentClass[TProps, reactLib.reactMod.ComponentState]) | reactLib.reactMod.StatelessComponent[TProps]
}
