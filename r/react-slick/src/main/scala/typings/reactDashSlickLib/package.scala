package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSlickLib {
  type ComponentConstructor[TProps] = (reactLib.reactMod.ReactNs.ComponentClass[TProps, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[TProps]
}
