package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// class ClientResult {
//    get_value(): any;
//    setValue(value: any): void;
//    constructor();
// }
trait ClientResult[T] extends js.Object {
  def get_value(): T
  def setValue(value: T): Unit
}

object ClientResult {
  @scala.inline
  def apply[T](get_value: () => T, setValue: T => Unit): ClientResult[T] = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[ClientResult[T]]
  }
}

