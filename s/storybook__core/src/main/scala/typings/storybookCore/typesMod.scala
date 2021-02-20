package typings.storybookCore

import typings.storybookClientApi.typesMod.RenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Loadable = RequireContext | js.Array[RequireContext] | LoaderFunction
  
  type LoaderFunction = js.Function0[Unit | js.Array[js.Any]]
  
  @js.native
  trait PreviewError extends StObject {
    
    var message: js.UndefOr[String] = js.native
    
    var stack: js.UndefOr[String] = js.native
  }
  object PreviewError {
    
    @scala.inline
    def apply(): PreviewError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreviewError]
    }
    
    @scala.inline
    implicit class PreviewErrorMutableBuilder[Self <: PreviewError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  type RenderStoryFunction = js.Function1[/* context */ RenderContext, Unit]
  
  @js.native
  trait RequireContext extends StObject {
    
    def apply(id: String): js.Any = js.native
    
    def keys(): js.Array[String] = js.native
    
    def resolve(id: String): String = js.native
  }
}
