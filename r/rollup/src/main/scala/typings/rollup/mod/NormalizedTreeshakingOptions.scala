package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizedTreeshakingOptions extends StObject {
  
  var annotations: Boolean
  
  def moduleSideEffects(id: String, external: Boolean): Boolean
  @JSName("moduleSideEffects")
  var moduleSideEffects_Original: HasModuleSideEffects
  
  var propertyReadSideEffects: Boolean
  
  var tryCatchDeoptimization: Boolean
  
  var unknownGlobalSideEffects: Boolean
}
object NormalizedTreeshakingOptions {
  
  inline def apply(
    annotations: Boolean,
    moduleSideEffects: (/* id */ String, /* external */ Boolean) => Boolean,
    propertyReadSideEffects: Boolean,
    tryCatchDeoptimization: Boolean,
    unknownGlobalSideEffects: Boolean
  ): NormalizedTreeshakingOptions = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], moduleSideEffects = js.Any.fromFunction2(moduleSideEffects), propertyReadSideEffects = propertyReadSideEffects.asInstanceOf[js.Any], tryCatchDeoptimization = tryCatchDeoptimization.asInstanceOf[js.Any], unknownGlobalSideEffects = unknownGlobalSideEffects.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedTreeshakingOptions]
  }
  
  extension [Self <: NormalizedTreeshakingOptions](x: Self) {
    
    inline def setAnnotations(value: Boolean): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setModuleSideEffects(value: (/* id */ String, /* external */ Boolean) => Boolean): Self = StObject.set(x, "moduleSideEffects", js.Any.fromFunction2(value))
    
    inline def setPropertyReadSideEffects(value: Boolean): Self = StObject.set(x, "propertyReadSideEffects", value.asInstanceOf[js.Any])
    
    inline def setTryCatchDeoptimization(value: Boolean): Self = StObject.set(x, "tryCatchDeoptimization", value.asInstanceOf[js.Any])
    
    inline def setUnknownGlobalSideEffects(value: Boolean): Self = StObject.set(x, "unknownGlobalSideEffects", value.asInstanceOf[js.Any])
  }
}
