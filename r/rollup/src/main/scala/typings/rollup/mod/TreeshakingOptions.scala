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
  
  @scala.inline
  def apply(): TreeshakingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeshakingOptions]
  }
  
  @scala.inline
  implicit class TreeshakingOptionsMutableBuilder[Self <: TreeshakingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(value: Boolean): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setModuleSideEffects(value: ModuleSideEffectsOption): Self = StObject.set(x, "moduleSideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleSideEffectsFunction2(value: (/* id */ String, /* external */ Boolean) => Boolean): Self = StObject.set(x, "moduleSideEffects", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModuleSideEffectsUndefined: Self = StObject.set(x, "moduleSideEffects", js.undefined)
    
    @scala.inline
    def setModuleSideEffectsVarargs(value: String*): Self = StObject.set(x, "moduleSideEffects", js.Array(value :_*))
    
    @scala.inline
    def setPropertyReadSideEffects(value: Boolean): Self = StObject.set(x, "propertyReadSideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyReadSideEffectsUndefined: Self = StObject.set(x, "propertyReadSideEffects", js.undefined)
    
    @scala.inline
    def setPureExternalModules(value: PureModulesOption): Self = StObject.set(x, "pureExternalModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPureExternalModulesFunction1(value: /* id */ String => js.UndefOr[Boolean | Null]): Self = StObject.set(x, "pureExternalModules", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPureExternalModulesUndefined: Self = StObject.set(x, "pureExternalModules", js.undefined)
    
    @scala.inline
    def setPureExternalModulesVarargs(value: String*): Self = StObject.set(x, "pureExternalModules", js.Array(value :_*))
    
    @scala.inline
    def setTryCatchDeoptimization(value: Boolean): Self = StObject.set(x, "tryCatchDeoptimization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryCatchDeoptimizationUndefined: Self = StObject.set(x, "tryCatchDeoptimization", js.undefined)
    
    @scala.inline
    def setUnknownGlobalSideEffects(value: Boolean): Self = StObject.set(x, "unknownGlobalSideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownGlobalSideEffectsUndefined: Self = StObject.set(x, "unknownGlobalSideEffects", js.undefined)
  }
}
