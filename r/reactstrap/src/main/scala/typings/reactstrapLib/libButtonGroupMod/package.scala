package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libButtonGroupMod {
  type ButtonGroup[T] = reactLib.reactMod.Component[ButtonGroupProps[T], js.Object, js.Any]
  type ButtonGroupProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_Arialabel with T
}
