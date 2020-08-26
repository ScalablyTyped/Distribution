package typings.reactGa.mod

import typings.reactGa.reactGaStrings.beacon
import typings.reactGa.reactGaStrings.image
import typings.reactGa.reactGaStrings.xhr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventArgs extends js.Object {
  /** The type of interaction (e.g. 'play') */
  var action: String = js.native
  /** Typically the object that was interacted with (e.g. 'Video') */
  var category: String = js.native
  /** Useful for categorizing events (e.g. 'Fall Campaign') */
  var label: js.UndefOr[String] = js.native
  /** Specifies that a hit be considered non-interactive. */
  var nonInteraction: js.UndefOr[Boolean] = js.native
  /**
    * This specifies the transport mechanism with which hits will be sent.
    * The options are 'beacon', 'xhr', or 'image'. By default, analytics.js
    * will try to figure out the best method based on the hit size and browser
    * capabilities. If you specify 'beacon' and the user's browser does not support
    * the `navigator.sendBeacon` method, it will fall back to 'image' or 'xhr'
    * depending on hit size.
    */
  var transport: js.UndefOr[beacon | xhr | image] = js.native
  /** A numeric value associated with the event (e.g. 42) */
  var value: js.UndefOr[Double] = js.native
}

object EventArgs {
  @scala.inline
  def apply(action: String, category: String): EventArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventArgs]
  }
  @scala.inline
  implicit class EventArgsOps[Self <: EventArgs] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setNonInteraction(value: Boolean): Self = this.set("nonInteraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonInteraction: Self = this.set("nonInteraction", js.undefined)
    @scala.inline
    def setTransport(value: beacon | xhr | image): Self = this.set("transport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

