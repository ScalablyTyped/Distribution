package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libJumbotronMod {
  type Jumbotron[T] = reactLib.reactMod.Component[JumbotronProps[T], js.Object, js.Any]
  type JumbotronProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_ClassNameFluid with T
}
