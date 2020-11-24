package typings.reactMdTransition.typesMod

import typings.react.mod.CSSProperties
import typings.react.mod.RefCallback
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapseTransitionProvidedProps[E /* <: HTMLElement */] extends js.Object {
  
  /**
    * The class name to apply that will allow for the element to transition
    * between collapsed states.
    */
  var className: String = js.native
  
  /**
    * The `hidden` DOM attribute that will be enabled if the component is fully
    * collapsed with no height and padding but still rendered within the DOM.
    */
  var hidden: Boolean = js.native
  
  /**
    * A ref that **must** be passed to the element that is triggering a CSS
    * transition change. An error will be thrown if the transition starts, but
    * the ref is still `null` or the `ref` was passed to a component instance
    * instead of a DOM node.
    */
  var ref: RefCallback[E] = js.native
  
  /**
    * A conditional style that will provide the required `max-height`,
    * `padding-top`, `padding-bottom`, and `transition-duration` styles required
    * for the collapse transition.
    */
  var style: js.UndefOr[CSSProperties] = js.native
}
object CollapseTransitionProvidedProps {
  
  @scala.inline
  def apply[E /* <: HTMLElement */](className: String, hidden: Boolean, ref: /* instance */ E | Null => Unit): CollapseTransitionProvidedProps[E] = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref))
    __obj.asInstanceOf[CollapseTransitionProvidedProps[E]]
  }
  
  @scala.inline
  implicit class CollapseTransitionProvidedPropsOps[Self <: CollapseTransitionProvidedProps[_], E /* <: HTMLElement */] (val x: Self with CollapseTransitionProvidedProps[E]) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: /* instance */ E | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
