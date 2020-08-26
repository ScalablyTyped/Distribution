package typings.scrollmagic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneConstructorOptions extends js.Object {
  var duration: js.UndefOr[(js.Function0[Double | String]) | Double | String] = js.native
  var loglevel: js.UndefOr[LogLevel] = js.native
  var offset: js.UndefOr[Double] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var triggerElement: js.UndefOr[ElementOrSelector | Null] = js.native
  var triggerHook: js.UndefOr[TriggerHook] = js.native
}

object SceneConstructorOptions {
  @scala.inline
  def apply(): SceneConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneConstructorOptions]
  }
  @scala.inline
  implicit class SceneConstructorOptionsOps[Self <: SceneConstructorOptions] (val x: Self) extends AnyVal {
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
    def setDurationFunction0(value: () => Double | String): Self = this.set("duration", js.Any.fromFunction0(value))
    @scala.inline
    def setDuration(value: (js.Function0[Double | String]) | Double | String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setLoglevel(value: LogLevel): Self = this.set("loglevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoglevel: Self = this.set("loglevel", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setTriggerElement(value: ElementOrSelector): Self = this.set("triggerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerElement: Self = this.set("triggerElement", js.undefined)
    @scala.inline
    def setTriggerElementNull: Self = this.set("triggerElement", null)
    @scala.inline
    def setTriggerHook(value: TriggerHook): Self = this.set("triggerHook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerHook: Self = this.set("triggerHook", js.undefined)
  }
  
}

