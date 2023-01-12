package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyframeEffectOptions
  extends StObject
     with EffectTiming {
  
  /* standard dom */
  var composite: js.UndefOr[CompositeOperation] = js.undefined
  
  /* standard dom */
  var iterationComposite: js.UndefOr[IterationCompositeOperation] = js.undefined
  
  /* standard dom */
  var pseudoElement: js.UndefOr[java.lang.String | Null] = js.undefined
}
object KeyframeEffectOptions {
  
  inline def apply(): KeyframeEffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyframeEffectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyframeEffectOptions] (val x: Self) extends AnyVal {
    
    inline def setComposite(value: CompositeOperation): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
    
    inline def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
    
    inline def setIterationComposite(value: IterationCompositeOperation): Self = StObject.set(x, "iterationComposite", value.asInstanceOf[js.Any])
    
    inline def setIterationCompositeUndefined: Self = StObject.set(x, "iterationComposite", js.undefined)
    
    inline def setPseudoElement(value: java.lang.String): Self = StObject.set(x, "pseudoElement", value.asInstanceOf[js.Any])
    
    inline def setPseudoElementNull: Self = StObject.set(x, "pseudoElement", null)
    
    inline def setPseudoElementUndefined: Self = StObject.set(x, "pseudoElement", js.undefined)
  }
}
