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
    add: T => WeakSet[T],
    delete: T => scala.Boolean,
    has: T => scala.Boolean,
    toStringTag: java.lang.String
  ): WeakSet[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), delete = js.Any.fromFunction1(delete), has = js.Any.fromFunction1(has), toStringTag = toStringTag)
  
    __obj.asInstanceOf[WeakSet[T]]
  }
}

