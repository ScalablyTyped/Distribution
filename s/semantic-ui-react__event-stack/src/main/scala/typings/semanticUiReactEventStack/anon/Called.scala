package typings.semanticUiReactEventStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Called extends js.Object {
  var called: js.UndefOr[Boolean] = js.native
}

object Called {
  @scala.inline
  def apply(): Called = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Called]
  }
  @scala.inline
  implicit class CalledOps[Self <: Called] (val x: Self) extends AnyVal {
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
    def setCalled(value: Boolean): Self = this.set("called", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalled: Self = this.set("called", js.undefined)
  }
  
}

