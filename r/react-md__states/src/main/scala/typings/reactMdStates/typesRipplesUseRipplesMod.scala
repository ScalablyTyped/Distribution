package typings.reactMdStates

import typings.react.mod.ReactNode
import typings.reactMdStates.typesRipplesTypesMod.MergableRippleHandlers
import typings.reactMdStates.typesRipplesTypesMod.RipplesOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRipplesUseRipplesMod {
  
  @JSImport("@react-md/states/types/ripples/useRipples", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRipples[E /* <: HTMLElement */](param0: RipplesOptions[E]): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRipples")(param0.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[E]]
  
  trait ReturnValue[E /* <: HTMLElement */] extends StObject {
    
    var handlers: MergableRippleHandlers[E]
    
    var ripples: ReactNode
  }
  object ReturnValue {
    
    inline def apply[E /* <: HTMLElement */](handlers: MergableRippleHandlers[E]): ReturnValue[E] = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnValue[E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReturnValue[?], E /* <: HTMLElement */] (val x: Self & ReturnValue[E]) extends AnyVal {
      
      inline def setHandlers(value: MergableRippleHandlers[E]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setRipples(value: ReactNode): Self = StObject.set(x, "ripples", value.asInstanceOf[js.Any])
      
      inline def setRipplesUndefined: Self = StObject.set(x, "ripples", js.undefined)
    }
  }
}
