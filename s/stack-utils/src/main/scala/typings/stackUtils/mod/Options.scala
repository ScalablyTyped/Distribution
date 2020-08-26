package typings.stackUtils.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cwd: js.UndefOr[String] = js.native
  var internals: js.UndefOr[js.Array[RegExp]] = js.native
  var wrapCallSite: js.UndefOr[js.Function1[/* callSite */ CallSite, CallSite]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setInternalsVarargs(value: RegExp*): Self = this.set("internals", js.Array(value :_*))
    @scala.inline
    def setInternals(value: js.Array[RegExp]): Self = this.set("internals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternals: Self = this.set("internals", js.undefined)
    @scala.inline
    def setWrapCallSite(value: /* callSite */ CallSite => CallSite): Self = this.set("wrapCallSite", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWrapCallSite: Self = this.set("wrapCallSite", js.undefined)
  }
  
}

