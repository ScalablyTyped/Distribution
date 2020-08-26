package typings.reactJsonschemaForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldPath extends js.Object {
  @JSName("$name")
  var $name: String = js.native
}

object FieldPath {
  @scala.inline
  def apply($name: String): FieldPath = {
    val __obj = js.Dynamic.literal($name = $name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldPath]
  }
  @scala.inline
  implicit class FieldPathOps[Self <: FieldPath] (val x: Self) extends AnyVal {
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
    def set$name(value: String): Self = this.set("$name", value.asInstanceOf[js.Any])
  }
  
}

