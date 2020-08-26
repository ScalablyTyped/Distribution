package typings.qlik.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoInteraction extends js.Object {
  var noInteraction: js.UndefOr[Boolean] = js.native
  var noSelections: js.UndefOr[Boolean] = js.native
}

object NoInteraction {
  @scala.inline
  def apply(): NoInteraction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoInteraction]
  }
  @scala.inline
  implicit class NoInteractionOps[Self <: NoInteraction] (val x: Self) extends AnyVal {
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
    def setNoInteraction(value: Boolean): Self = this.set("noInteraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoInteraction: Self = this.set("noInteraction", js.undefined)
    @scala.inline
    def setNoSelections(value: Boolean): Self = this.set("noSelections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSelections: Self = this.set("noSelections", js.undefined)
  }
  
}

