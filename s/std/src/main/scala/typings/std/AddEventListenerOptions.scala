package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddEventListenerOptions extends EventListenerOptions {
  var once: js.UndefOr[scala.Boolean] = js.native
  var passive: js.UndefOr[scala.Boolean] = js.native
}

object AddEventListenerOptions {
  @scala.inline
  def apply(): AddEventListenerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddEventListenerOptions]
  }
  @scala.inline
  implicit class AddEventListenerOptionsOps[Self <: AddEventListenerOptions] (val x: Self) extends AnyVal {
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
    def setOnce(value: scala.Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    @scala.inline
    def setPassive(value: scala.Boolean): Self = this.set("passive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassive: Self = this.set("passive", js.undefined)
  }
  
}

