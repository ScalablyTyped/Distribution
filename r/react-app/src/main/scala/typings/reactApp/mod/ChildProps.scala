package typings.reactApp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildProps extends js.Object {
  var path: String = js.native
  def action(params: js.Any): js.Any = js.native
}

object ChildProps {
  @scala.inline
  def apply(action: js.Any => js.Any, path: String): ChildProps = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildProps]
  }
  @scala.inline
  implicit class ChildPropsOps[Self <: ChildProps] (val x: Self) extends AnyVal {
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
    def setAction(value: js.Any => js.Any): Self = this.set("action", js.Any.fromFunction1(value))
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

