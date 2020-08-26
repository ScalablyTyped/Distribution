package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverconstrainedError extends Error {
  var constraint: java.lang.String = js.native
}

object OverconstrainedError {
  @scala.inline
  def apply(constraint: java.lang.String, message: java.lang.String, name: java.lang.String): OverconstrainedError = {
    val __obj = js.Dynamic.literal(constraint = constraint.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverconstrainedError]
  }
  @scala.inline
  implicit class OverconstrainedErrorOps[Self <: OverconstrainedError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConstraint(value: java.lang.String): Self = this.set("constraint", value.asInstanceOf[js.Any])
  }
  
}

