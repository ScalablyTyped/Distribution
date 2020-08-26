package typings.stellarBase.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsValid extends js.Object {
  def isValid(value: js.Any): Boolean = js.native
  def read(io: js.Any): js.Any = js.native
  def write(value: js.Any, io: Buffer): Unit = js.native
}

object IsValid {
  @scala.inline
  def apply(isValid: js.Any => Boolean, read: js.Any => js.Any, write: (js.Any, Buffer) => Unit): IsValid = {
    val __obj = js.Dynamic.literal(isValid = js.Any.fromFunction1(isValid), read = js.Any.fromFunction1(read), write = js.Any.fromFunction2(write))
    __obj.asInstanceOf[IsValid]
  }
  @scala.inline
  implicit class IsValidOps[Self <: IsValid] (val x: Self) extends AnyVal {
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
    def setIsValid(value: js.Any => Boolean): Self = this.set("isValid", js.Any.fromFunction1(value))
    @scala.inline
    def setRead(value: js.Any => js.Any): Self = this.set("read", js.Any.fromFunction1(value))
    @scala.inline
    def setWrite(value: (js.Any, Buffer) => Unit): Self = this.set("write", js.Any.fromFunction2(value))
  }
  
}

