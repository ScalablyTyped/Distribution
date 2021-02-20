package typings.reactMdStates

import typings.reactMdStates.typesMod.MergableRippleHandlers
import typings.reactMdStates.typesMod.RippleEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRippleHandlersMod {
  
  @JSImport("@react-md/states/types/ripples/useRippleHandlers", "useRippleHandlers")
  @js.native
  def useRippleHandlers[E /* <: HTMLElement */](hasCreateReleaseCancelHandlersDisabledDisableRippleDisableProgrammaticRipple: Options[E]): MergableRippleHandlers[E] = js.native
  
  @js.native
  trait Options[E /* <: HTMLElement */] extends StObject {
    
    def cancel(ease: Boolean): Unit = js.native
    
    def create(event: RippleEvent[E]): Unit = js.native
    
    var disableProgrammaticRipple: js.UndefOr[Boolean] = js.native
    
    var disableRipple: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var handlers: js.UndefOr[MergableRippleHandlers[E]] = js.native
    
    def release(event: RippleEvent[E]): Unit = js.native
  }
  object Options {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](cancel: Boolean => Unit, create: RippleEvent[E] => Unit, release: RippleEvent[E] => Unit): Options[E] = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), release = js.Any.fromFunction1(release))
      __obj.asInstanceOf[Options[E]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], E /* <: HTMLElement */] (val x: Self with Options[E]) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreate(value: RippleEvent[E] => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisableProgrammaticRipple(value: Boolean): Self = StObject.set(x, "disableProgrammaticRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableProgrammaticRippleUndefined: Self = StObject.set(x, "disableProgrammaticRipple", js.undefined)
      
      @scala.inline
      def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHandlers(value: MergableRippleHandlers[E]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      @scala.inline
      def setRelease(value: RippleEvent[E] => Unit): Self = StObject.set(x, "release", js.Any.fromFunction1(value))
    }
  }
}
