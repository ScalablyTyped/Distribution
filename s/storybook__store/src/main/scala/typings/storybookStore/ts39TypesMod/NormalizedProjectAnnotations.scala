package typings.storybookStore.ts39TypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> * / any */ trait NormalizedProjectAnnotations[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
  
  var argTypes: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictArgTypes */ Any
  ] = js.undefined
  
  var globalTypes: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictGlobalTypes */ Any
  ] = js.undefined
}
object NormalizedProjectAnnotations {
  
  inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](): NormalizedProjectAnnotations[TFramework] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalizedProjectAnnotations[TFramework]]
  }
  
  extension [Self <: NormalizedProjectAnnotations[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](x: Self & NormalizedProjectAnnotations[TFramework]) {
    
    inline def setArgTypes(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictArgTypes */ Any
    ): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
    
    inline def setArgTypesUndefined: Self = StObject.set(x, "argTypes", js.undefined)
    
    inline def setGlobalTypes(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictGlobalTypes */ Any
    ): Self = StObject.set(x, "globalTypes", value.asInstanceOf[js.Any])
    
    inline def setGlobalTypesUndefined: Self = StObject.set(x, "globalTypes", js.undefined)
  }
}
