package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libListGroupItemMod {
  type ListGroupItem[T] = reactLib.reactMod.Component[ListGroupItemProps[T], js.Object, js.Any]
  type ListGroupItemProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLElement] with reactstrapLib.Anon_Action with T
}
