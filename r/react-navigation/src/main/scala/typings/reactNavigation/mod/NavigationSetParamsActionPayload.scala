package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationSetParamsActionPayload extends js.Object {
  // The key of the route where the params should be set
  var key: String = js.native
  // The new params to merge into the existing route params
  var params: NavigationParams = js.native
}

object NavigationSetParamsActionPayload {
  @scala.inline
  def apply(key: String, params: NavigationParams): NavigationSetParamsActionPayload = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationSetParamsActionPayload]
  }
  @scala.inline
  implicit class NavigationSetParamsActionPayloadOps[Self <: NavigationSetParamsActionPayload] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: NavigationParams): Self = this.set("params", value.asInstanceOf[js.Any])
  }
  
}

