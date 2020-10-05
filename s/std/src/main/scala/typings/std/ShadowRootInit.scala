package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowRootInit extends js.Object {
  var delegatesFocus: js.UndefOr[scala.Boolean] = js.native
  var mode: ShadowRootMode = js.native
}

object ShadowRootInit {
  @scala.inline
  def apply(mode: ShadowRootMode): ShadowRootInit = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRootInit]
  }
  @scala.inline
  implicit class ShadowRootInitOps[Self <: ShadowRootInit] (val x: Self) extends AnyVal {
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
    def setMode(value: ShadowRootMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelegatesFocus(value: scala.Boolean): Self = this.set("delegatesFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegatesFocus: Self = this.set("delegatesFocus", js.undefined)
  }
  
}

