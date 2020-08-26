package typings.reactRouterGuard.mod

import typings.history.mod.History
import typings.history.mod.LocationState
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterGuardProps extends js.Object {
  var config: js.Array[RouterGuardConfigProps] = js.native
  var history: js.UndefOr[History[LocationState]] = js.native
  var loading: js.UndefOr[Boolean | ReactElement] = js.native
}

object RouterGuardProps {
  @scala.inline
  def apply(config: js.Array[RouterGuardConfigProps]): RouterGuardProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterGuardProps]
  }
  @scala.inline
  implicit class RouterGuardPropsOps[Self <: RouterGuardProps] (val x: Self) extends AnyVal {
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
    def setConfigVarargs(value: RouterGuardConfigProps*): Self = this.set("config", js.Array(value :_*))
    @scala.inline
    def setConfig(value: js.Array[RouterGuardConfigProps]): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setHistory(value: History[LocationState]): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setLoading(value: Boolean | ReactElement): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
  }
  
}

