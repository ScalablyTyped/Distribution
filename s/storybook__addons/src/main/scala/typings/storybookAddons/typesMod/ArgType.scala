package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InputType * / any */ trait ArgType[TArg] extends StObject {
  
  var defaultValue: js.UndefOr[TArg] = js.undefined
}
object ArgType {
  
  inline def apply[TArg](): ArgType[TArg] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgType[TArg]]
  }
  
  extension [Self <: ArgType[?], TArg](x: Self & ArgType[TArg]) {
    
    inline def setDefaultValue(value: TArg): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
  }
}
