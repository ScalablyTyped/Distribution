package typings.reachRouter.mod

import typings.history.mod.LocationState
import typings.reachRouter.anon.PushState
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistorySource extends js.Object {
  var history: PushState = js.native
  val location: WindowLocation[LocationState] = js.native
  def addEventListener(name: String, listener: js.Function1[/* event */ Event, Unit]): Unit = js.native
  def removeEventListener(name: String, listener: js.Function1[/* event */ Event, Unit]): Unit = js.native
}

object HistorySource {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* event */ Event, Unit]) => Unit,
    history: PushState,
    location: WindowLocation[LocationState],
    removeEventListener: (String, js.Function1[/* event */ Event, Unit]) => Unit
  ): HistorySource = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[HistorySource]
  }
  @scala.inline
  implicit class HistorySourceOps[Self <: HistorySource] (val x: Self) extends AnyVal {
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
    def setAddEventListener(value: (String, js.Function1[/* event */ Event, Unit]) => Unit): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    @scala.inline
    def setHistory(value: PushState): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: WindowLocation[LocationState]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveEventListener(value: (String, js.Function1[/* event */ Event, Unit]) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction2(value))
  }
  
}

