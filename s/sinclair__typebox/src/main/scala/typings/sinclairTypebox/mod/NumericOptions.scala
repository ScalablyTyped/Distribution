package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericOptions[N /* <: Double | js.BigInt */]
  extends StObject
     with SchemaOptions {
  
  var exclusiveMaximum: js.UndefOr[N] = js.undefined
  
  var exclusiveMinimum: js.UndefOr[N] = js.undefined
  
  var maximum: js.UndefOr[N] = js.undefined
  
  var minimum: js.UndefOr[N] = js.undefined
  
  var multipleOf: js.UndefOr[N] = js.undefined
}
object NumericOptions {
  
  inline def apply[N /* <: Double | js.BigInt */](): NumericOptions[N] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericOptions[N]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumericOptions[?], N /* <: Double | js.BigInt */] (val x: Self & NumericOptions[N]) extends AnyVal {
    
    inline def setExclusiveMaximum(value: N): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
    
    inline def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
    
    inline def setExclusiveMinimum(value: N): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
    
    inline def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
    
    inline def setMaximum(value: N): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: N): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    inline def setMultipleOf(value: N): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
    
    inline def setMultipleOfUndefined: Self = StObject.set(x, "multipleOf", js.undefined)
  }
}
