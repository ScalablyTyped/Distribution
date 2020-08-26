package typings.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'throttle'> */
@js.native
trait PickImplthrottle extends js.Object {
  var throttle: Double = js.native
}

object PickImplthrottle {
  @scala.inline
  def apply(throttle: Double): PickImplthrottle = {
    val __obj = js.Dynamic.literal(throttle = throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplthrottle]
  }
  @scala.inline
  implicit class PickImplthrottleOps[Self <: PickImplthrottle] (val x: Self) extends AnyVal {
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
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
  }
  
}

