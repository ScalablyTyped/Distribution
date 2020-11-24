package typings.reactMdUtils.useScrollListenerMod

import typings.std.AddEventListenerOptions
import typings.std.Event
import typings.std.EventListener
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[E /* <: HTMLElement */] extends js.Object {
  
  /**
    * The element that should gain the focus event. When this is omitted, it will
    * default to the entire `window`.
    */
  var element: js.UndefOr[E | Null] = js.native
  
  /**
    * Boolean if the scroll listener should be enabled. You can swap this boolean
    * to `true` or `false` to add/remove the event listeners. The event listeners
    * will *always* be removed when the parent component is unmounted though.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A function that is called whenever the scroll event is triggered.
    */
  var onScroll: EventListener = js.native
  
  /**
    * Any event listener options to use when attaching the event.
    */
  var options: js.UndefOr[AddEventListenerOptions | Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply[E /* <: HTMLElement */](onScroll: /* evt */ Event => Unit): Options[E] = {
    val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction1(onScroll))
    __obj.asInstanceOf[Options[E]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], E /* <: HTMLElement */] (val x: Self with Options[E]) extends AnyVal {
    
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
    def setOnScroll(value: /* evt */ Event => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElement(value: E): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setElementNull: Self = this.set("element", null)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setOptions(value: AddEventListenerOptions | Boolean): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
