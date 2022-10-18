package typings.reactMdStates

import typings.reactMdStates.typesRipplesTypesMod.MergableRippleHandlers
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUsePressedStatesMod {
  
  @JSImport("@react-md/states/types/usePressedStates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def usePressedStates[E /* <: HTMLElement */](): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePressedStates")().asInstanceOf[ReturnValue[E]]
  inline def usePressedStates[E /* <: HTMLElement */](hasHandlersDisableSpacebarClick: PressedStatesOptions[E]): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePressedStates")(hasHandlersDisableSpacebarClick.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[E]]
  
  trait PressedStatesOptions[E /* <: HTMLElement */] extends StObject {
    
    var disableSpacebarClick: js.UndefOr[Boolean] = js.undefined
    
    var handlers: js.UndefOr[MergableRippleHandlers[E]] = js.undefined
  }
  object PressedStatesOptions {
    
    inline def apply[E /* <: HTMLElement */](): PressedStatesOptions[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PressedStatesOptions[E]]
    }
    
    extension [Self <: PressedStatesOptions[?], E /* <: HTMLElement */](x: Self & PressedStatesOptions[E]) {
      
      inline def setDisableSpacebarClick(value: Boolean): Self = StObject.set(x, "disableSpacebarClick", value.asInstanceOf[js.Any])
      
      inline def setDisableSpacebarClickUndefined: Self = StObject.set(x, "disableSpacebarClick", js.undefined)
      
      inline def setHandlers(value: MergableRippleHandlers[E]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    }
  }
  
  trait ReturnValue[E /* <: HTMLElement */] extends StObject {
    
    var handlers: MergableRippleHandlers[E]
    
    var pressed: Boolean
  }
  object ReturnValue {
    
    inline def apply[E /* <: HTMLElement */](handlers: MergableRippleHandlers[E], pressed: Boolean): ReturnValue[E] = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnValue[E]]
    }
    
    extension [Self <: ReturnValue[?], E /* <: HTMLElement */](x: Self & ReturnValue[E]) {
      
      inline def setHandlers(value: MergableRippleHandlers[E]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setPressed(value: Boolean): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    }
  }
}
