package typings.reactMdStates

import typings.reactMdStates.typesMod.MergableRippleHandlers
import typings.reactMdStates.typesMod.RippleEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRippleHandlersMod {
  
  @JSImport("@react-md/states/types/ripples/useRippleHandlers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRippleHandlers[E /* <: HTMLElement */](hasCreateReleaseCancelHandlersPropDisabledDisableRippleDisableProgrammaticRipple: Options[E]): MergableRippleHandlers[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRippleHandlers")(hasCreateReleaseCancelHandlersPropDisabledDisableRippleDisableProgrammaticRipple.asInstanceOf[js.Any]).asInstanceOf[MergableRippleHandlers[E]]
  
  trait Options[E /* <: HTMLElement */] extends StObject {
    
    def cancel(ease: Boolean): Unit
    
    def create(event: RippleEvent[E]): Unit
    
    var disableProgrammaticRipple: js.UndefOr[Boolean] = js.undefined
    
    var disableRipple: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var handlers: js.UndefOr[MergableRippleHandlers[E]] = js.undefined
    
    def release(event: RippleEvent[E]): Unit
  }
  object Options {
    
    inline def apply[E /* <: HTMLElement */](cancel: Boolean => Unit, create: RippleEvent[E] => Unit, release: RippleEvent[E] => Unit): Options[E] = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), release = js.Any.fromFunction1(release))
      __obj.asInstanceOf[Options[E]]
    }
    
    extension [Self <: Options[?], E /* <: HTMLElement */](x: Self & Options[E]) {
      
      inline def setCancel(value: Boolean => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setCreate(value: RippleEvent[E] => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setDisableProgrammaticRipple(value: Boolean): Self = StObject.set(x, "disableProgrammaticRipple", value.asInstanceOf[js.Any])
      
      inline def setDisableProgrammaticRippleUndefined: Self = StObject.set(x, "disableProgrammaticRipple", js.undefined)
      
      inline def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
      
      inline def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHandlers(value: MergableRippleHandlers[E]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setRelease(value: RippleEvent[E] => Unit): Self = StObject.set(x, "release", js.Any.fromFunction1(value))
    }
  }
}
