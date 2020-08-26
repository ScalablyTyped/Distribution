package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefObject[T] extends js.Object {
  val current: T | Null = js.native
}

object RefObject {
  @scala.inline
  def apply[T](): RefObject[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefObject[T]]
  }
  @scala.inline
  implicit class RefObjectOps[Self <: RefObject[_], T] (val x: Self with RefObject[T]) extends AnyVal {
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
    def setCurrent(value: T): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentNull: Self = this.set("current", null)
  }
  
}

