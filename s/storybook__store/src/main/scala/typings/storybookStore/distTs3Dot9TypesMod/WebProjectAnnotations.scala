package typings.storybookStore.distTs3Dot9TypesMod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> * / any */ trait WebProjectAnnotations[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
  
  var renderToDOM: js.UndefOr[
    js.Function2[
      /* context */ RenderContext[TFramework], 
      /* element */ Element, 
      js.Promise[Unit] | Unit
    ]
  ] = js.undefined
}
object WebProjectAnnotations {
  
  inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](): WebProjectAnnotations[TFramework] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebProjectAnnotations[TFramework]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebProjectAnnotations[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] (val x: Self & WebProjectAnnotations[TFramework]) extends AnyVal {
    
    inline def setRenderToDOM(value: (/* context */ RenderContext[TFramework], /* element */ Element) => js.Promise[Unit] | Unit): Self = StObject.set(x, "renderToDOM", js.Any.fromFunction2(value))
    
    inline def setRenderToDOMUndefined: Self = StObject.set(x, "renderToDOM", js.undefined)
  }
}
