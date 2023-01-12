package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<rollup.rollup.NormalizedGeneratedCodeOptions> */
trait GeneratedCodeOptions extends StObject {
  
  var arrowFunctions: js.UndefOr[Boolean] = js.undefined
  
  var constBindings: js.UndefOr[Boolean] = js.undefined
  
  var objectShorthand: js.UndefOr[Boolean] = js.undefined
  
  var preset: js.UndefOr[GeneratedCodePreset] = js.undefined
  
  var reservedNamesAsProps: js.UndefOr[Boolean] = js.undefined
  
  var symbols: js.UndefOr[Boolean] = js.undefined
}
object GeneratedCodeOptions {
  
  inline def apply(): GeneratedCodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratedCodeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeneratedCodeOptions] (val x: Self) extends AnyVal {
    
    inline def setArrowFunctions(value: Boolean): Self = StObject.set(x, "arrowFunctions", value.asInstanceOf[js.Any])
    
    inline def setArrowFunctionsUndefined: Self = StObject.set(x, "arrowFunctions", js.undefined)
    
    inline def setConstBindings(value: Boolean): Self = StObject.set(x, "constBindings", value.asInstanceOf[js.Any])
    
    inline def setConstBindingsUndefined: Self = StObject.set(x, "constBindings", js.undefined)
    
    inline def setObjectShorthand(value: Boolean): Self = StObject.set(x, "objectShorthand", value.asInstanceOf[js.Any])
    
    inline def setObjectShorthandUndefined: Self = StObject.set(x, "objectShorthand", js.undefined)
    
    inline def setPreset(value: GeneratedCodePreset): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    inline def setReservedNamesAsProps(value: Boolean): Self = StObject.set(x, "reservedNamesAsProps", value.asInstanceOf[js.Any])
    
    inline def setReservedNamesAsPropsUndefined: Self = StObject.set(x, "reservedNamesAsProps", js.undefined)
    
    inline def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
  }
}
