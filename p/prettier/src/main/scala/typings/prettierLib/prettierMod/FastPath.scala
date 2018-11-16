package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastPath[T] extends js.Object {
  var stack: js.Array[_] = js.native
  def call[U](callback: js.Function1[/* path */ this.type, U], names: stdLib.PropertyKey*): U = js.native
  def each(callback: js.Function1[/* path */ this.type, scala.Unit], names: stdLib.PropertyKey*): scala.Unit = js.native
  def getName(): scala.Null | stdLib.PropertyKey = js.native
  def getNode(): scala.Null | T = js.native
  def getNode(count: scala.Double): scala.Null | T = js.native
  def getParentNode(): scala.Null | T = js.native
  def getParentNode(count: scala.Double): scala.Null | T = js.native
  def getValue(): T = js.native
  def map[U](
    callback: js.Function2[/* path */ this.type, /* index */ scala.Double, U],
    names: stdLib.PropertyKey*
  ): js.Array[U] = js.native
}

