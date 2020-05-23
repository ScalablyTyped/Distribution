package typings.streamjs.Stream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Optional[T] extends js.Object {
  def filter(predicate: js.Function1[/* elem */ T, Boolean]): Optional[T]
  def flatMap[U](mapper: js.Function1[/* elem */ T, Optional[U]]): Optional[U]
  def get(): T
  def ifPresent(consumer: js.Function1[/* elem */ T, Unit]): Unit
  def isPresent(): Boolean
  def map[U](mapper: js.Function1[/* elem */ T, U]): Optional[U]
  def orElse(other: T): T
  def orElseGet(supplier: Supplier[T]): T
  def orElseThrow(error: js.Any): T
}

object Optional {
  @scala.inline
  def apply[T](
    filter: js.Function1[/* elem */ T, Boolean] => Optional[T],
    flatMap: js.Function1[/* elem */ T, Optional[js.Any]] => Optional[js.Any],
    get: () => T,
    ifPresent: js.Function1[/* elem */ T, Unit] => Unit,
    isPresent: () => Boolean,
    map: js.Function1[/* elem */ T, js.Any] => Optional[js.Any],
    orElse: T => T,
    orElseGet: Supplier[T] => T,
    orElseThrow: js.Any => T
  ): Optional[T] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), flatMap = js.Any.fromFunction1(flatMap), get = js.Any.fromFunction0(get), ifPresent = js.Any.fromFunction1(ifPresent), isPresent = js.Any.fromFunction0(isPresent), map = js.Any.fromFunction1(map), orElse = js.Any.fromFunction1(orElse), orElseGet = js.Any.fromFunction1(orElseGet), orElseThrow = js.Any.fromFunction1(orElseThrow))
    __obj.asInstanceOf[Optional[T]]
  }
}

