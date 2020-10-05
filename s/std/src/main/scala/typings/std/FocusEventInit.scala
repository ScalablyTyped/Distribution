package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusEventInit extends UIEventInit {
  var relatedTarget: js.UndefOr[EventTarget | Null] = js.native
}

object FocusEventInit {
  @scala.inline
  def apply(): FocusEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusEventInit]
  }
  @scala.inline
  implicit class FocusEventInitOps[Self <: FocusEventInit] (val x: Self) extends AnyVal {
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
    def setRelatedTarget(value: EventTarget): Self = this.set("relatedTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedTarget: Self = this.set("relatedTarget", js.undefined)
    @scala.inline
    def setRelatedTargetNull: Self = this.set("relatedTarget", null)
  }
  
}

