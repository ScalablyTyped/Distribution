package typings.reactMdTransition.useFixedPositioningMod

import typings.reactMdUtils.typesMod.PositionAnchor
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixedPositioningOptions
  extends OptionalFixedPositionOptions
     with TransitionHooks {
  
  /**
    * The element that the transitioning node should be fixed to.
    */
  var fixedTo: FixedTo = js.native
  
  /**
    * An optional function to call to dynamically get the options when the node
    * has been added to the DOM. This is helpful if you need to check sizes or other
    * things once the DOM node has been added for initial positioning or other things
    * like that. The returned options will override the existing options
    */
  var getOptions: js.UndefOr[GetFixedPositionOptions] = js.native
  
  /**
    * An optional function to call when the provide `xPosition` and `yPosition` are not
    * the same as the "calculated" position after trying to make the element fixed
    * within the viewport.
    */
  var onPositionChange: js.UndefOr[PositionChange] = js.native
  
  /**
    * An optional function to call when the element is in the DOM and a window resize
    * event has occurred. The main use-case for this is hiding the fixed element when
    * the page is resized.
    */
  var onResize: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  /**
    * An optional function to call when the element is in the DOM and a window scroll
    * event has occurred. The main use-case for this is hiding the fixed element when
    * the element or the entire page has a scroll event.
    */
  var onScroll: js.UndefOr[OnFixedPositionScroll] = js.native
}
object FixedPositioningOptions {
  
  @scala.inline
  def apply(): FixedPositioningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedPositioningOptions]
  }
  
  @scala.inline
  implicit class FixedPositioningOptionsOps[Self <: FixedPositioningOptions] (val x: Self) extends AnyVal {
    
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
    def setFixedToFunction0(value: () => HTMLElement | Null): Self = this.set("fixedTo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFixedTo(value: FixedTo): Self = this.set("fixedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedToNull: Self = this.set("fixedTo", null)
    
    @scala.inline
    def setGetOptions(value: /* node */ HTMLElement => OptionalFixedPositionOptions): Self = this.set("getOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetOptions: Self = this.set("getOptions", js.undefined)
    
    @scala.inline
    def setOnPositionChange(value: (/* wanted */ PositionAnchor, /* actual */ PositionAnchor) => Unit): Self = this.set("onPositionChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPositionChange: Self = this.set("onPositionChange", js.undefined)
    
    @scala.inline
    def setOnResize(value: /* event */ Event => Unit): Self = this.set("onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    
    @scala.inline
    def setOnScroll(value: (/* event */ Event, /* data */ ScrollData) => Unit): Self = this.set("onScroll", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
  }
}
