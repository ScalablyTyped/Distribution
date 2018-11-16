package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// React.Children
// ----------------------------------------------------------------------
@js.native
trait ReactChildren extends js.Object {
  def count(children: ReactNode): scala.Double = js.native
  def forEach(
    children: ReactNode,
    fn: js.Function2[/* child */ ReactChild, /* index */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def map[T](children: ReactNode, fn: js.Function2[/* child */ ReactChild, /* index */ scala.Double, T]): js.Array[T] = js.native
  def map[T, C /* <: ReactElement[_] */](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ scala.Double, T]): js.Array[T] = js.native
  def only(children: ReactNode): ReactElement[_] = js.native
  def toArray(children: ReactNode): js.Array[ReactChild] = js.native
}

