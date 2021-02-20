package typings.reactMdStates

import typings.react.mod.ReactNode
import typings.reactMdStates.typesMod.MergableRippleHandlers
import typings.reactMdStates.typesMod.RipplesOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRipplesMod {
  
  @JSImport("@react-md/states/types/ripples/useRipples", "useRipples")
  @js.native
  def useRipples[E /* <: HTMLElement */](
    hasRippleTimeoutRippleClassNamesRippleContainerClassNameRippleClassNameDisableRippleDisableSpacebarClickOptions: RipplesOptions[E]
  ): ReturnValue[E] = js.native
  
  @js.native
  trait ReturnValue[E /* <: HTMLElement */] extends StObject {
    
    var handlers: MergableRippleHandlers[E] = js.native
    
    var ripples: ReactNode = js.native
  }
  object ReturnValue {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](handlers: MergableRippleHandlers[E]): ReturnValue[E] = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnValue[E]]
    }
    
    @scala.inline
    implicit class ReturnValueMutableBuilder[Self <: ReturnValue[_], E /* <: HTMLElement */] (val x: Self with ReturnValue[E]) extends AnyVal {
      
      @scala.inline
      def setHandlers(value: MergableRippleHandlers[E]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRipples(value: ReactNode): Self = StObject.set(x, "ripples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRipplesUndefined: Self = StObject.set(x, "ripples", js.undefined)
    }
  }
}
