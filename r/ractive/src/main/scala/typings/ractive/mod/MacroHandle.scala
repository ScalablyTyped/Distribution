package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MacroHandle extends js.Object {
  var invalidate: js.UndefOr[js.Function0[Unit]] = js.native
  var render: js.UndefOr[js.Function0[Unit]] = js.native
  var teardown: js.UndefOr[js.Function0[Unit]] = js.native
  var update: js.UndefOr[js.Function1[/* attributes */ ValueMap, Unit]] = js.native
}

object MacroHandle {
  @scala.inline
  def apply(): MacroHandle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacroHandle]
  }
  @scala.inline
  implicit class MacroHandleOps[Self <: MacroHandle] (val x: Self) extends AnyVal {
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
    def setInvalidate(value: () => Unit): Self = this.set("invalidate", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInvalidate: Self = this.set("invalidate", js.undefined)
    @scala.inline
    def setRender(value: () => Unit): Self = this.set("render", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setTeardown(value: () => Unit): Self = this.set("teardown", js.Any.fromFunction0(value))
    @scala.inline
    def deleteTeardown: Self = this.set("teardown", js.undefined)
    @scala.inline
    def setUpdate(value: /* attributes */ ValueMap => Unit): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

