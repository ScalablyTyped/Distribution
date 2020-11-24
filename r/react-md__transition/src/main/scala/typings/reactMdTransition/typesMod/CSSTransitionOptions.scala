package typings.reactMdTransition.typesMod

import typings.react.mod.Ref
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<@react-md/transition.@react-md/transition/types/types.TransitionOptions<E>, 'repaint'> */
@js.native
trait CSSTransitionOptions[E /* <: HTMLElement */] extends js.Object {
  
  var appear: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional className that should ge merged with the CSS transition class
    * name based on the current transition stage.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * The transition class names to apply. Unlike in `react-transition-group`, if
    * this is a `string` instead of an object, the different states will be
    * `--{state}` instead of `-{state}`.
    *
    * Example:
    *
    * ```ts
    * const options = {
    *   classNames: "scale"
    * }
    *
    * // creates
    * const classNames = {
    *   enter: "scale--enter",
    *   enterActive: "scale--enter-active",
    *   exit: "scale--exit",
    *   exitActive: "scale--exit-active",
    * }
    * ```
    *
    * ```ts
    * const options = {
    *   classNames: "scale"
    *   appear: true,
    * }
    *
    * // creates
    * const classNames = {
    *   appear: "scale--enter",
    *   appearActive: "scale--enter-active",
    *   enter: "scale--enter",
    *   enterActive: "scale--enter-active",
    *   exit: "scale--exit",
    *   exitActive: "scale--exit-active",
    * }
    * ```
    */
  var classNames: CSSTransitionClassNames | String = js.native
  
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
  
  var timeout: TransitionTimeout = js.native
  
  var transitionIn: Boolean = js.native
}
object CSSTransitionOptions {
  
  @scala.inline
  def apply[E /* <: HTMLElement */](classNames: CSSTransitionClassNames | String, timeout: TransitionTimeout, transitionIn: Boolean): CSSTransitionOptions[E] = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], transitionIn = transitionIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSTransitionOptions[E]]
  }
  
  @scala.inline
  implicit class CSSTransitionOptionsOps[Self <: CSSTransitionOptions[_], E /* <: HTMLElement */] (val x: Self with CSSTransitionOptions[E]) extends AnyVal {
    
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
    def setClassNames(value: CSSTransitionClassNames | String): Self = this.set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: TransitionTimeout): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionIn(value: Boolean): Self = this.set("transitionIn", value.asInstanceOf[js.Any])
    
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
  }
}
