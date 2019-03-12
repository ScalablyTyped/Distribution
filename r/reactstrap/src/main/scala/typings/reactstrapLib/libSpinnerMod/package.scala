package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSpinnerMod {
  type Spinner[T] = reactLib.reactMod.Component[SpinnerProps[T], js.Object, js.Any]
  type SpinnerProps[T] = reactLib.reactMod.ReactNs.HTMLProps[stdLib.HTMLElement] with reactstrapLib.Anon_ClassNameColorCssModuleSize with T
}
