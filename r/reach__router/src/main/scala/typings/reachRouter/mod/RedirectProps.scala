package typings.reachRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedirectProps[TState] extends js.Object {
  var from: js.UndefOr[String] = js.native
  var noThrow: js.UndefOr[Boolean] = js.native
  var replace: js.UndefOr[Boolean] = js.native
  var state: js.UndefOr[TState] = js.native
  var to: String = js.native
}

object RedirectProps {
  @scala.inline
  def apply[TState](to: String): RedirectProps[TState] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectProps[TState]]
  }
  @scala.inline
  implicit class RedirectPropsOps[Self <: RedirectProps[_], TState] (val x: Self with RedirectProps[TState]) extends AnyVal {
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
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setNoThrow(value: Boolean): Self = this.set("noThrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoThrow: Self = this.set("noThrow", js.undefined)
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    @scala.inline
    def setState(value: TState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

