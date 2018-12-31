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

