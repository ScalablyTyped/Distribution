package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusOptions extends js.Object {
  var preventScroll: js.UndefOr[scala.Boolean] = js.native
}

object FocusOptions {
  @scala.inline
  def apply(): FocusOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusOptions]
  }
  @scala.inline
  implicit class FocusOptionsOps[Self <: FocusOptions] (val x: Self) extends AnyVal {
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
    def setPreventScroll(value: scala.Boolean): Self = this.set("preventScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventScroll: Self = this.set("preventScroll", js.undefined)
  }
  
}

