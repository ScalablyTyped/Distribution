package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libProgressMod {
  type Progress[T] = reactLib.reactMod.Component[ProgressProps[T], js.Object, js.Any]
  type ProgressProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_BarClassName with T
}
