package typings.recase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recase extends js.Object {
  def camelCopy(orig: js.Any): js.Any = js.native
  def snakeCopy(orig: js.Any): js.Any = js.native
}

object Recase {
  @scala.inline
  def apply(camelCopy: js.Any => js.Any, snakeCopy: js.Any => js.Any): Recase = {
    val __obj = js.Dynamic.literal(camelCopy = js.Any.fromFunction1(camelCopy), snakeCopy = js.Any.fromFunction1(snakeCopy))
    __obj.asInstanceOf[Recase]
  }
  @scala.inline
  implicit class RecaseOps[Self <: Recase] (val x: Self) extends AnyVal {
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
    def setCamelCopy(value: js.Any => js.Any): Self = this.set("camelCopy", js.Any.fromFunction1(value))
    @scala.inline
    def setSnakeCopy(value: js.Any => js.Any): Self = this.set("snakeCopy", js.Any.fromFunction1(value))
  }
  
}

