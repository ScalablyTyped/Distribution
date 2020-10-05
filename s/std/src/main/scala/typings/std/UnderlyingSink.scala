package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnderlyingSink[W] extends js.Object {
  var abort: js.UndefOr[WritableStreamErrorCallback] = js.native
  var close: js.UndefOr[WritableStreamDefaultControllerCloseCallback] = js.native
  var start: js.UndefOr[WritableStreamDefaultControllerStartCallback] = js.native
  var `type`: js.UndefOr[scala.Nothing] = js.native
  var write: js.UndefOr[WritableStreamDefaultControllerWriteCallback[W]] = js.native
}

object UnderlyingSink {
  @scala.inline
  def apply[W](): UnderlyingSink[W] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnderlyingSink[W]]
  }
  @scala.inline
  implicit class UnderlyingSinkOps[Self <: UnderlyingSink[_], W] (val x: Self with UnderlyingSink[W]) extends AnyVal {
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
    def setAbort(value: /* reason */ js.Any => Unit | js.Thenable[Unit]): Self = this.set("abort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAbort: Self = this.set("abort", js.undefined)
    @scala.inline
    def setClose(value: () => Unit | js.Thenable[Unit]): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setStart(value: /* controller */ WritableStreamDefaultController => Unit | js.Thenable[Unit]): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setWrite(value: (W, /* controller */ WritableStreamDefaultController) => Unit | js.Thenable[Unit]): Self = this.set("write", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
  }
  
}

