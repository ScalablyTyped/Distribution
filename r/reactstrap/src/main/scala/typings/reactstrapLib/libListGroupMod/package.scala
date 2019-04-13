package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libListGroupMod {
  type ListGroup[T] = reactLib.reactMod.Component[ListGroupProps[T], js.Object, js.Any]
  type ListGroupProps[T] = reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] with reactstrapLib.Anon_ClassNameCssModuleFlush with T
}
