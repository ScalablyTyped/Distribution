package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeakSet[T /* <: js.Object */] extends js.Object {
  @JSName(org.scalablytyped.runtime.Symbol.toStringTag)
  val toStringTag: java.lang.String
  def add(value: T): this.type
  def delete(value: T): scala.Boolean
  def has(value: T): scala.Boolean
}

object WeakSet {
  @scala.inline
  def apply[T /* <: js.Object */](
    add: js.Function1[T, WeakSet[T]],
    delete: js.Function1[T, scala.Boolean],
    has: js.Function1[T, scala.Boolean],
    toStringTag: java.lang.String
  ): WeakSet[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("has")(has)
    __obj.updateDynamic("toStringTag")(toStringTag)
    __obj.asInstanceOf[WeakSet[T]]
  }
}

