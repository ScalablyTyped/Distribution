package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyframeEffectOptions extends EffectTiming {
  
  var composite: js.UndefOr[CompositeOperation] = js.native
  
  var iterationComposite: js.UndefOr[IterationCompositeOperation] = js.native
}
object KeyframeEffectOptions {
  
  @scala.inline
  def apply(): KeyframeEffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyframeEffectOptions]
  }
  
  @scala.inline
  implicit class KeyframeEffectOptionsMutableBuilder[Self <: KeyframeEffectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComposite(value: CompositeOperation): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
    
    @scala.inline
    def setIterationComposite(value: IterationCompositeOperation): Self = StObject.set(x, "iterationComposite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationCompositeUndefined: Self = StObject.set(x, "iterationComposite", js.undefined)
  }
}
