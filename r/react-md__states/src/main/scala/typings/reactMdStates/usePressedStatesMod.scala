package typings.reactMdStates

import typings.reactMdStates.typesMod.MergableRippleHandlers
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usePressedStatesMod {
  
  @JSImport("@react-md/states/types/usePressedStates", "usePressedStates")
  @js.native
  def usePressedStates[E /* <: HTMLElement */](): ReturnValue[E] = js.native
  @JSImport("@react-md/states/types/usePressedStates", "usePressedStates")
  @js.native
  def usePressedStates[E /* <: HTMLElement */](hasHandlersDisableSpacebarClick: PressedStatesOptions[E]): ReturnValue[E] = js.native
  
  @js.native
  trait PressedStatesOptions[E /* <: HTMLElement */] extends StObject {
    
    var disableSpacebarClick: js.UndefOr[Boolean] = js.native
    
    var handlers: js.UndefOr[MergableRippleHandlers[E]] = js.native
  }
  object PressedStatesOptions {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](): PressedStatesOptions[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PressedStatesOptions[E]]
    }
    
    @scala.inline
    implicit class PressedStatesOptionsMutableBuilder[Self <: PressedStatesOptions[_], E /* <: HTMLElement */] (val x: Self with PressedStatesOptions[E]) extends AnyVal {
      
      @scala.inline
      def setDisableSpacebarClick(value: Boolean): Self = StObject.set(x, "disableSpacebarClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSpacebarClickUndefined: Self = StObject.set(x, "disableSpacebarClick", js.undefined)
      
      @scala.inline
      def setHandlers(value: MergableRippleHandlers[E]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    }
  }
  
  @js.native
  trait ReturnValue[E /* <: HTMLElement */] extends StObject {
    
    var handlers: MergableRippleHandlers[E] = js.native
    
    var pressed: Boolean = js.native
  }
  object ReturnValue {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](handlers: MergableRippleHandlers[E], pressed: Boolean): ReturnValue[E] = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnValue[E]]
    }
    
    @scala.inline
    implicit class ReturnValueMutableBuilder[Self <: ReturnValue[_], E /* <: HTMLElement */] (val x: Self with ReturnValue[E]) extends AnyVal {
      
      @scala.inline
      def setHandlers(value: MergableRippleHandlers[E]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressed(value: Boolean): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    }
  }
}
