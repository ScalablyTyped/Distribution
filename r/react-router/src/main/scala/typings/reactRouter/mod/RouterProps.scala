package typings.reactRouter.mod

import typings.history.mod.History
import typings.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterProps extends js.Object {
  var history: History[LocationState] = js.native
}

object RouterProps {
  @scala.inline
  def apply(history: History[LocationState]): RouterProps = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterProps]
  }
  @scala.inline
  implicit class RouterPropsOps[Self <: RouterProps] (val x: Self) extends AnyVal {
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
    def setHistory(value: History[LocationState]): Self = this.set("history", value.asInstanceOf[js.Any])
  }
  
}

