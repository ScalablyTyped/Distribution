package typings.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveOpacity extends js.Object {
  var activeOpacity: Double = js.native
  var borderless: Boolean = js.native
}

object ActiveOpacity {
  @scala.inline
  def apply(activeOpacity: Double, borderless: Boolean): ActiveOpacity = {
    val __obj = js.Dynamic.literal(activeOpacity = activeOpacity.asInstanceOf[js.Any], borderless = borderless.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveOpacity]
  }
  @scala.inline
  implicit class ActiveOpacityOps[Self <: ActiveOpacity] (val x: Self) extends AnyVal {
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
    def setActiveOpacity(value: Double): Self = this.set("activeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderless(value: Boolean): Self = this.set("borderless", value.asInstanceOf[js.Any])
  }
  
}

