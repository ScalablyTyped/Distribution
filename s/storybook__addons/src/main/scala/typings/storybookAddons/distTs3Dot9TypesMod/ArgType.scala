package typings.storybookAddons.distTs3Dot9TypesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArgType[?], TArg] (val x: Self & ArgType[TArg]) extends AnyVal {
    
    inline def setDefaultValue(value: TArg): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
  }
}
