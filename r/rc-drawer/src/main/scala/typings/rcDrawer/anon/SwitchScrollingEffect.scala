package typings.rcDrawer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchScrollingEffect extends js.Object {
  def switchScrollingEffect(): Unit = js.native
}

object SwitchScrollingEffect {
  @scala.inline
  def apply(switchScrollingEffect: () => Unit): SwitchScrollingEffect = {
    val __obj = js.Dynamic.literal(switchScrollingEffect = js.Any.fromFunction0(switchScrollingEffect))
    __obj.asInstanceOf[SwitchScrollingEffect]
  }
  @scala.inline
  implicit class SwitchScrollingEffectOps[Self <: SwitchScrollingEffect] (val x: Self) extends AnyVal {
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
    def setSwitchScrollingEffect(value: () => Unit): Self = this.set("switchScrollingEffect", js.Any.fromFunction0(value))
  }
  
}

