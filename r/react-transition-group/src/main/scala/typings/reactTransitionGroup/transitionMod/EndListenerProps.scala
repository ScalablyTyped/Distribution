package typings.reactTransitionGroup.transitionMod

import typings.reactTransitionGroup.anon.Appear
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndListenerProps[Ref /* <: js.UndefOr[HTMLElement] */]
  extends BaseTransitionProps[Ref]
     with TransitionProps[Ref] {
  
  /**
    * Add a custom transition end trigger. Called with the transitioning DOM
    * node and a done callback. Allows for more fine grained transition end
    * logic. Note: Timeouts are still used as a fallback if provided.
    */
  var addEndListener: EndHandler[Ref] = js.native
  
  /**
    * The duration of the transition, in milliseconds. Required unless addEndListener is provided.
    *
    * You may specify a single timeout for all transitions:
    * ```js
    *   timeout={500}
    * ```
    * or individually:
    * ```js
    * timeout={{
    *  appear: 500,
    *  enter: 300,
    *  exit: 500,
    * }}
    * ```
    * - appear defaults to the value of `enter`
    * - enter defaults to `0`
    * - exit defaults to `0`
    */
  var timeout: js.UndefOr[Double | Appear] = js.native
}
object EndListenerProps {
  
  @scala.inline
  def apply[Ref /* <: js.UndefOr[HTMLElement] */](addEndListener: EndHandler[Ref]): EndListenerProps[Ref] = {
    val __obj = js.Dynamic.literal(addEndListener = addEndListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndListenerProps[Ref]]
  }
  
  @scala.inline
  implicit class EndListenerPropsOps[Self <: EndListenerProps[_], Ref /* <: js.UndefOr[HTMLElement] */] (val x: Self with EndListenerProps[Ref]) extends AnyVal {
    
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
    def setAddEndListener(value: EndHandler[Ref]): Self = this.set("addEndListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double | Appear): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
