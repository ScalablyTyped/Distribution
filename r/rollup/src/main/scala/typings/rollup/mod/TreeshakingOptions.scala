package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeshakingOptions extends StObject {
  
  var annotations: js.UndefOr[Boolean] = js.undefined
  
  var moduleSideEffects: js.UndefOr[ModuleSideEffectsOption] = js.undefined
  
  var propertyReadSideEffects: js.UndefOr[Boolean] = js.undefined
  
  /** @deprecated Use `moduleSideEffects` instead */
  var pureExternalModules: js.UndefOr[PureModulesOption] = js.undefined
  
  var tryCatchDeoptimization: js.UndefOr[Boolean] = js.undefined
  
  var unknownGlobalSideEffects: js.UndefOr[Boolean] = js.undefined
}
object TreeshakingOptions {
  
  inline def apply(): TreeshakingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeshakingOptions]
  }
  
  extension [Self <: TreeshakingOptions](x: Self) {
    
    inline def setAnnotations(value: Boolean): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setModuleSideEffects(value: ModuleSideEffectsOption): Self = StObject.set(x, "moduleSideEffects", value.asInstanceOf[js.Any])
    
    inline def setModuleSideEffectsFunction2(value: (/* id */ String, /* external */ Boolean) => Boolean): Self = StObject.set(x, "moduleSideEffects", js.Any.fromFunction2(value))
    
    inline def setModuleSideEffectsUndefined: Self = StObject.set(x, "moduleSideEffects", js.undefined)
    
    inline def setModuleSideEffectsVarargs(value: String*): Self = StObject.set(x, "moduleSideEffects", js.Array(value :_*))
    
    inline def setPropertyReadSideEffects(value: Boolean): Self = StObject.set(x, "propertyReadSideEffects", value.asInstanceOf[js.Any])
    
    inline def setPropertyReadSideEffectsUndefined: Self = StObject.set(x, "propertyReadSideEffects", js.undefined)
    
    inline def setPureExternalModules(value: PureModulesOption): Self = StObject.set(x, "pureExternalModules", value.asInstanceOf[js.Any])
    
    inline def setPureExternalModulesFunction1(value: /* id */ String => js.UndefOr[Boolean | Null]): Self = StObject.set(x, "pureExternalModules", js.Any.fromFunction1(value))
    
    inline def setPureExternalModulesUndefined: Self = StObject.set(x, "pureExternalModules", js.undefined)
    
    inline def setPureExternalModulesVarargs(value: String*): Self = StObject.set(x, "pureExternalModules", js.Array(value :_*))
    
    inline def setTryCatchDeoptimization(value: Boolean): Self = StObject.set(x, "tryCatchDeoptimization", value.asInstanceOf[js.Any])
    
    inline def setTryCatchDeoptimizationUndefined: Self = StObject.set(x, "tryCatchDeoptimization", js.undefined)
    
    inline def setUnknownGlobalSideEffects(value: Boolean): Self = StObject.set(x, "unknownGlobalSideEffects", value.asInstanceOf[js.Any])
    
    inline def setUnknownGlobalSideEffectsUndefined: Self = StObject.set(x, "unknownGlobalSideEffects", js.undefined)
  }
}
