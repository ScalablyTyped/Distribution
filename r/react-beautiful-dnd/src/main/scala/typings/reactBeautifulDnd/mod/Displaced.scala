package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Displaced extends js.Object {
  var backwards: DisplacementGroups = js.native
  var forwards: DisplacementGroups = js.native
}

object Displaced {
  @scala.inline
  def apply(backwards: DisplacementGroups, forwards: DisplacementGroups): Displaced = {
    val __obj = js.Dynamic.literal(backwards = backwards.asInstanceOf[js.Any], forwards = forwards.asInstanceOf[js.Any])
    __obj.asInstanceOf[Displaced]
  }
  @scala.inline
  implicit class DisplacedOps[Self <: Displaced] (val x: Self) extends AnyVal {
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
    def setBackwards(value: DisplacementGroups): Self = this.set("backwards", value.asInstanceOf[js.Any])
    @scala.inline
    def setForwards(value: DisplacementGroups): Self = this.set("forwards", value.asInstanceOf[js.Any])
  }
  
}

