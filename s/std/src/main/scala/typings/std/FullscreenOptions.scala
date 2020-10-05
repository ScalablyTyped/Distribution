package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullscreenOptions extends js.Object {
  var navigationUI: js.UndefOr[FullscreenNavigationUI] = js.native
}

object FullscreenOptions {
  @scala.inline
  def apply(): FullscreenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullscreenOptions]
  }
  @scala.inline
  implicit class FullscreenOptionsOps[Self <: FullscreenOptions] (val x: Self) extends AnyVal {
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
    def setNavigationUI(value: FullscreenNavigationUI): Self = this.set("navigationUI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationUI: Self = this.set("navigationUI", js.undefined)
  }
  
}

