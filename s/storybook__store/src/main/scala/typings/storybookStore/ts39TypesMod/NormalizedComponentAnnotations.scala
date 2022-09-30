package typings.storybookStore.ts39TypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework> * / any */ trait NormalizedComponentAnnotations[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
  
  var argTypes: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictArgTypes */ Any
  ] = js.undefined
  
  var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentId */ Any
}
object NormalizedComponentAnnotations {
  
  inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentId */ Any
  ): NormalizedComponentAnnotations[TFramework] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedComponentAnnotations[TFramework]]
  }
  
  extension [Self <: NormalizedComponentAnnotations[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](x: Self & NormalizedComponentAnnotations[TFramework]) {
    
    inline def setArgTypes(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictArgTypes */ Any
    ): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
    
    inline def setArgTypesUndefined: Self = StObject.set(x, "argTypes", js.undefined)
    
    inline def setId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentId */ Any
    ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
