package typings.storybookStore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalTypes extends StObject {
  
  var globalTypes: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalTypes */ Any
  ] = js.undefined
  
  var globals: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any
  ] = js.undefined
}
object GlobalTypes {
  
  inline def apply(): GlobalTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalTypes]
  }
  
  extension [Self <: GlobalTypes](x: Self) {
    
    inline def setGlobalTypes(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalTypes */ Any
    ): Self = StObject.set(x, "globalTypes", value.asInstanceOf[js.Any])
    
    inline def setGlobalTypesUndefined: Self = StObject.set(x, "globalTypes", js.undefined)
    
    inline def setGlobals(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any
    ): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
  }
}
