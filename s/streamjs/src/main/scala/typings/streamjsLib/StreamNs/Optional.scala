package typings
package streamjsLib.StreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Stream.Optional")
@js.native
class Optional[T] () extends js.Object {
  def filter(predicate: js.Function1[/* elem */ T, scala.Boolean]): Optional[T] = js.native
  def flatMap[U](mapper: js.Function1[/* elem */ T, Optional[U]]): Optional[U] = js.native
  def get(): T = js.native
  def ifPresent(consumer: js.Function1[/* elem */ T, scala.Unit]): scala.Unit = js.native
  def isPresent(): scala.Boolean = js.native
  def map[U](mapper: js.Function1[/* elem */ T, U]): Optional[U] = js.native
  def orElse(other: T): T = js.native
  def orElseGet(supplier: Supplier[T]): T = js.native
  def orElseThrow(error: js.Any): T = js.native
}

@JSGlobal("Stream.Optional")
@js.native
object Optional extends js.Object {
  def of[T](elem: T): streamjsLib.StreamNs.Optional[T] = js.native
  def ofNullable[T](elem: T): streamjsLib.StreamNs.Optional[T] = js.native
}

