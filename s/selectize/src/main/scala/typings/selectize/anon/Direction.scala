package typings.selectize.anon

import typings.selectize.selectizeStrings.asc
import typings.selectize.selectizeStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Direction extends js.Object {
  var direction: js.UndefOr[asc | desc] = js.native
  var field: String = js.native
}

object Direction {
  @scala.inline
  def apply(field: String): Direction = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  @scala.inline
  implicit class DirectionOps[Self <: Direction] (val x: Self) extends AnyVal {
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: asc | desc): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
  }
  
}

