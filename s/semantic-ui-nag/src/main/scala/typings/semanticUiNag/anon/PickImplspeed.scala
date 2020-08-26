package typings.semanticUiNag.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'speed'> */
@js.native
trait PickImplspeed extends js.Object {
  var speed: Double = js.native
}

object PickImplspeed {
  @scala.inline
  def apply(speed: Double): PickImplspeed = {
    val __obj = js.Dynamic.literal(speed = speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplspeed]
  }
  @scala.inline
  implicit class PickImplspeedOps[Self <: PickImplspeed] (val x: Self) extends AnyVal {
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
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
  }
  
}

