package typings.rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeakSet[T] extends js.Object {
  @JSName(js.Symbol.toStringTag)
  var toStringTag: String = js.native
  def add(value: T): WeakSet[T] = js.native
  def clear(): Unit = js.native
  def delete(value: T): Boolean = js.native
  def has(value: T): Boolean = js.native
}

