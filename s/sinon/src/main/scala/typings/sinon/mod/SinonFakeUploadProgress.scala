package typings.sinon.mod

import typings.sinon.anon.Abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonFakeUploadProgress extends js.Object {
  var eventListeners: Abort = js.native
  def addEventListener(event: String, listener: js.Function1[/* e */ Event, _]): Unit = js.native
  def dispatchEvent(event: Event): Unit = js.native
  def removeEventListener(event: String, listener: js.Function1[/* e */ Event, _]): Unit = js.native
}

object SinonFakeUploadProgress {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* e */ Event, _]) => Unit,
    dispatchEvent: Event => Unit,
    eventListeners: Abort,
    removeEventListener: (String, js.Function1[/* e */ Event, _]) => Unit
  ): SinonFakeUploadProgress = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), eventListeners = eventListeners.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[SinonFakeUploadProgress]
  }
  @scala.inline
  implicit class SinonFakeUploadProgressOps[Self <: SinonFakeUploadProgress] (val x: Self) extends AnyVal {
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
    def setAddEventListener(value: (String, js.Function1[/* e */ Event, _]) => Unit): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    @scala.inline
    def setDispatchEvent(value: Event => Unit): Self = this.set("dispatchEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setEventListeners(value: Abort): Self = this.set("eventListeners", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveEventListener(value: (String, js.Function1[/* e */ Event, _]) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction2(value))
  }
  
}

