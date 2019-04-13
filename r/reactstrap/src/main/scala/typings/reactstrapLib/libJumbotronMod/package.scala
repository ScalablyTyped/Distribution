package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libJumbotronMod {
  type Jumbotron[T] = reactLib.reactMod.Component[JumbotronProps[T], js.Object, js.Any]
  type JumbotronProps[T] = reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] with reactstrapLib.Anon_ClassNameCssModuleFluid with T
}
