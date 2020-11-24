package typings.reactOverlays.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  in :boolean,   appear :boolean | undefined,   unmountOnExit :boolean | undefined} & react-overlays.react-overlays/esm/types.TransitionCallbacks */
@js.native
trait inbooleanappearbooleanund extends js.Object {
  
  var appear: js.UndefOr[Boolean] = js.native
  
  var in: Boolean = js.native
  
  var onEnter: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  
  var onEntered: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  
  var onEntering: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  
  var onExit: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  
  var onExited: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  
  var onExiting: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  
  var unmountOnExit: js.UndefOr[Boolean] = js.native
}
object inbooleanappearbooleanund {
  
  @scala.inline
  def apply(in: Boolean): inbooleanappearbooleanund = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[inbooleanappearbooleanund]
  }
  
  @scala.inline
  implicit class inbooleanappearbooleanundOps[Self <: inbooleanappearbooleanund] (val x: Self) extends AnyVal {
    
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
    def setIn(value: Boolean): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppear(value: Boolean): Self = this.set("appear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppear: Self = this.set("appear", js.undefined)
    
    @scala.inline
    def setOnEnter(value: /* node */ HTMLElement => _): Self = this.set("onEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    
    @scala.inline
    def setOnEntered(value: /* node */ HTMLElement => _): Self = this.set("onEntered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEntered: Self = this.set("onEntered", js.undefined)
    
    @scala.inline
    def setOnEntering(value: /* node */ HTMLElement => _): Self = this.set("onEntering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEntering: Self = this.set("onEntering", js.undefined)
    
    @scala.inline
    def setOnExit(value: /* node */ HTMLElement => _): Self = this.set("onExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    
    @scala.inline
    def setOnExited(value: /* node */ HTMLElement => _): Self = this.set("onExited", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExited: Self = this.set("onExited", js.undefined)
    
    @scala.inline
    def setOnExiting(value: /* node */ HTMLElement => _): Self = this.set("onExiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExiting: Self = this.set("onExiting", js.undefined)
    
    @scala.inline
    def setUnmountOnExit(value: Boolean): Self = this.set("unmountOnExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmountOnExit: Self = this.set("unmountOnExit", js.undefined)
  }
}
