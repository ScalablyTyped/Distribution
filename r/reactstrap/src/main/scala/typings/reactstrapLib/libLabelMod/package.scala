package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libLabelMod {
  type Intermediate = reactLib.reactMod.ReactNs.LabelHTMLAttributes[reactLib.HTMLLabelElement] with reactstrapLib.Anon_SizeAny
  type Label[T] = reactLib.reactMod.Component[LabelProps[T], js.Object, js.Any]
  type LabelProps[T] = Intermediate with reactstrapLib.Anon_For with T
}
