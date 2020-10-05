package typings.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveOpacityNumber extends js.Object {
  var activeOpacity: Double = js.native
}

object ActiveOpacityNumber {
  @scala.inline
  def apply(activeOpacity: Double): ActiveOpacityNumber = {
    val __obj = js.Dynamic.literal(activeOpacity = activeOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveOpacityNumber]
  }
  @scala.inline
  implicit class ActiveOpacityNumberOps[Self <: ActiveOpacityNumber] (val x: Self) extends AnyVal {
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
  }
  
}

