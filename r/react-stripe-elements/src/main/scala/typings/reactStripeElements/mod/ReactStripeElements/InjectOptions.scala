package typings.reactStripeElements.mod.ReactStripeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectOptions extends js.Object {
  var withRef: js.UndefOr[Boolean] = js.native
}

object InjectOptions {
  @scala.inline
  def apply(): InjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectOptions]
  }
  @scala.inline
  implicit class InjectOptionsOps[Self <: InjectOptions] (val x: Self) extends AnyVal {
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
    def setWithRef(value: Boolean): Self = this.set("withRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithRef: Self = this.set("withRef", js.undefined)
  }
  
}

