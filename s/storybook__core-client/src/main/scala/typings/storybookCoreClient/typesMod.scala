package typings.storybookCoreClient

import typings.storybookStore.ts39TypesMod.RenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Loadable = RequireContext | js.Array[RequireContext] | LoaderFunction
  
  type LoaderFunction = js.Function0[Unit | js.Array[Any]]
  
  trait PreviewError extends StObject {
    
    var message: js.UndefOr[String] = js.undefined
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object PreviewError {
    
    inline def apply(): PreviewError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreviewError]
    }
    
    extension [Self <: PreviewError](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  type RenderStoryFunction = js.Function1[
    /* context */ RenderContext[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
    ], 
    Unit
  ]
  
  @js.native
  trait RequireContext extends StObject {
    
    def apply(id: String): Any = js.native
    
    def keys(): js.Array[String] = js.native
    
    def resolve(id: String): String = js.native
  }
}
