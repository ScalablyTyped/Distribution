package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyframeEffectOptions
  extends StObject
     with EffectTiming {
  
  var composite: js.UndefOr[CompositeOperation] = js.undefined
  
  var iterationComposite: js.UndefOr[IterationCompositeOperation] = js.undefined
}
object KeyframeEffectOptions {
  
  inline def apply(): KeyframeEffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyframeEffectOptions]
  }
  
  extension [Self <: KeyframeEffectOptions](x: Self) {
    
    inline def setComposite(value: CompositeOperation): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
    
    inline def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
    
    inline def setIterationComposite(value: IterationCompositeOperation): Self = StObject.set(x, "iterationComposite", value.asInstanceOf[js.Any])
    
    inline def setIterationCompositeUndefined: Self = StObject.set(x, "iterationComposite", js.undefined)
  }
}
