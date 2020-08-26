package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// class ClientResult {
//    get_value(): any;
//    setValue(value: any): void;
//    constructor();
// }
@js.native
trait ClientResult[T] extends js.Object {
  def get_value(): T = js.native
  def setValue(value: T): Unit = js.native
}

object ClientResult {
  @scala.inline
  def apply[T](get_value: () => T, setValue: T => Unit): ClientResult[T] = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[ClientResult[T]]
  }
  @scala.inline
  implicit class ClientResultOps[Self <: ClientResult[_], T] (val x: Self with ClientResult[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet_value(value: () => T): Self = this.set("get_value", js.Any.fromFunction0(value))
    @scala.inline
    def setSetValue(value: T => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
  }
  
}

