package typings.reactNativeMauron85BackgroundGeolocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadlessTaskEvent extends js.Object {
  /** Name of the event [ "location", "stationary", "activity" ] */
  var name: HeadlessTaskEventName = js.native
  /** Event parameters. */
  var params: js.Any = js.native
}

object HeadlessTaskEvent {
  @scala.inline
  def apply(name: HeadlessTaskEventName, params: js.Any): HeadlessTaskEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadlessTaskEvent]
  }
  @scala.inline
  implicit class HeadlessTaskEventOps[Self <: HeadlessTaskEvent] (val x: Self) extends AnyVal {
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
    def setName(value: HeadlessTaskEventName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
  }
  
}

