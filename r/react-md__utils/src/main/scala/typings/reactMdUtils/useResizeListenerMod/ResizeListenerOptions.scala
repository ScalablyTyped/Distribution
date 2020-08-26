package typings.reactMdUtils.useResizeListenerMod

import typings.std.AddEventListenerOptions
import typings.std.Event
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeListenerOptions extends js.Object {
  /**
    * Boolean if the resize observer should be enabled. You can swap this boolean
    * to `true` or `false` to add/remove the event listeners. The event listeners
    * will *always* be removed when the parent component is unmounted though.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the resize event handler should be called immediately once the
    * component is mounted. The default behavior will be to only call the
    * `onResize` event immediately client side and can never be invoked server
    * side since it resize on the `window` to dispatch a `UIEvent`.
    */
  var immediate: js.UndefOr[Boolean] = js.native
  /**
    * A function to call when the app is resized.
    */
  var onResize: EventListener = js.native
  /**
    * Any event listener options to use when attaching the event.
    */
  var options: js.UndefOr[Boolean | AddEventListenerOptions] = js.native
}

object ResizeListenerOptions {
  @scala.inline
  def apply(onResize: /* evt */ Event => Unit): ResizeListenerOptions = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
    __obj.asInstanceOf[ResizeListenerOptions]
  }
  @scala.inline
  implicit class ResizeListenerOptionsOps[Self <: ResizeListenerOptions] (val x: Self) extends AnyVal {
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
    def setOnResize(value: /* evt */ Event => Unit): Self = this.set("onResize", js.Any.fromFunction1(value))
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setImmediate(value: Boolean): Self = this.set("immediate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmediate: Self = this.set("immediate", js.undefined)
    @scala.inline
    def setOptions(value: Boolean | AddEventListenerOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

