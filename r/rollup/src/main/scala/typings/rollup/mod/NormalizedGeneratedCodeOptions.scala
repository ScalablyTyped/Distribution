package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizedGeneratedCodeOptions extends StObject {
  
  var arrowFunctions: Boolean
  
  var constBindings: Boolean
  
  var objectShorthand: Boolean
  
  var reservedNamesAsProps: Boolean
  
  var symbols: Boolean
}
object NormalizedGeneratedCodeOptions {
  
  inline def apply(
    arrowFunctions: Boolean,
    constBindings: Boolean,
    objectShorthand: Boolean,
    reservedNamesAsProps: Boolean,
    symbols: Boolean
  ): NormalizedGeneratedCodeOptions = {
    val __obj = js.Dynamic.literal(arrowFunctions = arrowFunctions.asInstanceOf[js.Any], constBindings = constBindings.asInstanceOf[js.Any], objectShorthand = objectShorthand.asInstanceOf[js.Any], reservedNamesAsProps = reservedNamesAsProps.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedGeneratedCodeOptions]
  }
  
  extension [Self <: NormalizedGeneratedCodeOptions](x: Self) {
    
    inline def setArrowFunctions(value: Boolean): Self = StObject.set(x, "arrowFunctions", value.asInstanceOf[js.Any])
    
    inline def setConstBindings(value: Boolean): Self = StObject.set(x, "constBindings", value.asInstanceOf[js.Any])
    
    inline def setObjectShorthand(value: Boolean): Self = StObject.set(x, "objectShorthand", value.asInstanceOf[js.Any])
    
    inline def setReservedNamesAsProps(value: Boolean): Self = StObject.set(x, "reservedNamesAsProps", value.asInstanceOf[js.Any])
    
    inline def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
  }
}
