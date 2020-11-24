package typings.reactMdTransition.useCrossFadeMod

import typings.react.mod.Ref
import typings.reactMdTransition.typesMod.EnterHandler
import typings.reactMdTransition.typesMod.ExitHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<@react-md/transition.@react-md/transition/types/types.CSSTransitionOptions<E>, 'timeout' | 'classNames' | 'transitionIn'> */
@js.native
trait CrossFadeOptions[E /* <: HTMLElement */] extends js.Object {
  
  var appear: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var enter: js.UndefOr[Boolean] = js.native
  
  var exit: js.UndefOr[Boolean] = js.native
  
  var onEnter: js.UndefOr[EnterHandler[E]] = js.native
  
  var onEntered: js.UndefOr[EnterHandler[E]] = js.native
  
  var onEntering: js.UndefOr[EnterHandler[E]] = js.native
  
  var onExit: js.UndefOr[ExitHandler[E]] = js.native
  
  var onExited: js.UndefOr[ExitHandler[E]] = js.native
  
  var onExiting: js.UndefOr[ExitHandler[E]] = js.native
  
  var ref: js.UndefOr[Ref[E]] = js.native
  
  var temporary: js.UndefOr[Boolean] = js.native
  
  var transitionIn: js.UndefOr[Boolean] = js.native
}
object CrossFadeOptions {
  
  @scala.inline
  def apply[E /* <: HTMLElement */](): CrossFadeOptions[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossFadeOptions[E]]
  }
  
  @scala.inline
  implicit class CrossFadeOptionsOps[Self <: CrossFadeOptions[_], E /* <: HTMLElement */] (val x: Self with CrossFadeOptions[E]) extends AnyVal {
    
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
    def setAppear(value: Boolean): Self = this.set("appear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppear: Self = this.set("appear", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setEnter(value: Boolean): Self = this.set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setExit(value: Boolean): Self = this.set("exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
    
    @scala.inline
    def setOnEnter(value: (E, /* isAppearing */ Boolean) => Unit): Self = this.set("onEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    
    @scala.inline
    def setOnEntered(value: (E, /* isAppearing */ Boolean) => Unit): Self = this.set("onEntered", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnEntered: Self = this.set("onEntered", js.undefined)
    
    @scala.inline
    def setOnEntering(value: (E, /* isAppearing */ Boolean) => Unit): Self = this.set("onEntering", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnEntering: Self = this.set("onEntering", js.undefined)
    
    @scala.inline
    def setOnExit(value: E => Unit): Self = this.set("onExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    
    @scala.inline
    def setOnExited(value: E => Unit): Self = this.set("onExited", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExited: Self = this.set("onExited", js.undefined)
    
    @scala.inline
    def setOnExiting(value: E => Unit): Self = this.set("onExiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExiting: Self = this.set("onExiting", js.undefined)
    
    @scala.inline
    def setRefFunction1(value: /* instance */ E | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[E]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    
    @scala.inline
    def setTemporary(value: Boolean): Self = this.set("temporary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemporary: Self = this.set("temporary", js.undefined)
    
    @scala.inline
    def setTransitionIn(value: Boolean): Self = this.set("transitionIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionIn: Self = this.set("transitionIn", js.undefined)
  }
}
