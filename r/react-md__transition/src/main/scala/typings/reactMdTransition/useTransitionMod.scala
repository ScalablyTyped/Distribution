package typings.reactMdTransition

import typings.react.mod.Dispatch
import typings.react.mod.RefCallback
import typings.reactMdTransition.constantsMod.TransitionAction
import typings.reactMdTransition.constantsMod.TransitionStage
import typings.reactMdTransition.typesMod.TransitionOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTransitionMod {
  
  @JSImport("@react-md/transition/types/useTransition", "useTransition")
  @js.native
  def useTransition[E /* <: HTMLElement */](
    hasAppearRepaintTemporaryTransitionInTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedRef: TransitionOptions[E]
  ): TransitionReturnValue[E] = js.native
  
  @js.native
  trait TransitionReturnValue[E /* <: HTMLElement */] extends TransitionState {
    
    /**
      * A dispatch function that cna update the transition state manually. This
      * should really not be used too much unless your transition is for appear
      * only transitions. For those cases, you can watch for a value change and
      * just trigger the ENTER transition again:
      *
      * ```ts
      * const prevThing = useRef(thing);
      * if (thing !== prevThing.current) {
      *   prevThing.current = thing;
      *   dispatch(ENTER);
      * }
      * ```
      *
      * Note: This **should be dispatched during the render** to get the correct
      * timing.
      */
    var dispatch: Dispatch[TransitionAction] = js.native
    
    /**
      * A ref that must be passed to a DOM node for the transition to work. This
      * _technically_ should not need to be passed to a DOM node for non-css
      * transitions or transitions that do not require access to a DOM node, but it
      * it seems like too much work to make it conditional for those types for
      * transitions.
      */
    var ref: RefCallback[E] = js.native
  }
  object TransitionReturnValue {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](
      appearing: Boolean,
      dispatch: TransitionAction => Unit,
      ref: /* instance */ E | Null => Unit,
      rendered: Boolean,
      stage: TransitionStage
    ): TransitionReturnValue[E] = {
      val __obj = js.Dynamic.literal(appearing = appearing.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), ref = js.Any.fromFunction1(ref), rendered = rendered.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionReturnValue[E]]
    }
    
    @scala.inline
    implicit class TransitionReturnValueMutableBuilder[Self <: TransitionReturnValue[_], E /* <: HTMLElement */] (val x: Self with TransitionReturnValue[E]) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: TransitionAction => Unit): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRef(value: /* instance */ E | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TransitionState extends StObject {
    
    /**
      * Boolean if the transition is in the initial mounting/appearing stage while
      * entering. This will be `false` if the `appear` option is `false` and
      * automatically set to `false` after the first transition if `appear` was
      * `true`.
      */
    var appearing: Boolean = js.native
    
    /**
      * Boolean if the component should be rendered in the DOM. This will always be
      * `true` if the `temporary` option is omitted or `false`. Otherwise, it will
      * be `true` during the transitions and entered.
      */
    var rendered: Boolean = js.native
    
    /**
      * The current stage for the transition. This probably won't be used too much
      * unless you want to apply custom classnames based on the stage.
      */
    var stage: TransitionStage = js.native
  }
  object TransitionState {
    
    @scala.inline
    def apply(appearing: Boolean, rendered: Boolean, stage: TransitionStage): TransitionState = {
      val __obj = js.Dynamic.literal(appearing = appearing.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionState]
    }
    
    @scala.inline
    implicit class TransitionStateMutableBuilder[Self <: TransitionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppearing(value: Boolean): Self = StObject.set(x, "appearing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendered(value: Boolean): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStage(value: TransitionStage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    }
  }
}
