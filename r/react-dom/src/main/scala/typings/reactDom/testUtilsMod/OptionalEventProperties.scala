package typings.reactDom.testUtilsMod

import typings.std.Date
import typings.std.Event
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionalEventProperties extends js.Object {
  var bubbles: js.UndefOr[Boolean] = js.native
  var cancelable: js.UndefOr[Boolean] = js.native
  var currentTarget: js.UndefOr[EventTarget] = js.native
  var defaultPrevented: js.UndefOr[Boolean] = js.native
  var eventPhase: js.UndefOr[Double] = js.native
  var isTrusted: js.UndefOr[Boolean] = js.native
  var nativeEvent: js.UndefOr[Event] = js.native
  var preventDefault: js.UndefOr[js.Function0[Unit]] = js.native
  var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.native
  var target: js.UndefOr[EventTarget] = js.native
  var timeStamp: js.UndefOr[Date] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object OptionalEventProperties {
  @scala.inline
  def apply(): OptionalEventProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalEventProperties]
  }
  @scala.inline
  implicit class OptionalEventPropertiesOps[Self <: OptionalEventProperties] (val x: Self) extends AnyVal {
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
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubbles: Self = this.set("bubbles", js.undefined)
    @scala.inline
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelable: Self = this.set("cancelable", js.undefined)
    @scala.inline
    def setCurrentTarget(value: EventTarget): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentTarget: Self = this.set("currentTarget", js.undefined)
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = this.set("defaultPrevented", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPrevented: Self = this.set("defaultPrevented", js.undefined)
    @scala.inline
    def setEventPhase(value: Double): Self = this.set("eventPhase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventPhase: Self = this.set("eventPhase", js.undefined)
    @scala.inline
    def setIsTrusted(value: Boolean): Self = this.set("isTrusted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTrusted: Self = this.set("isTrusted", js.undefined)
    @scala.inline
    def setNativeEvent(value: Event): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeEvent: Self = this.set("nativeEvent", js.undefined)
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    @scala.inline
    def deletePreventDefault: Self = this.set("preventDefault", js.undefined)
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
    @scala.inline
    def deleteStopPropagation: Self = this.set("stopPropagation", js.undefined)
    @scala.inline
    def setTarget(value: EventTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTimeStamp(value: Date): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeStamp: Self = this.set("timeStamp", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

