package typings.sass.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DenominatorUnits extends StObject {
  
  var denominatorUnits: js.UndefOr[js.Array[String] | typings.immutable.mod.List[String]] = js.undefined
  
  var numeratorUnits: js.UndefOr[js.Array[String] | typings.immutable.mod.List[String]] = js.undefined
}
object DenominatorUnits {
  
  inline def apply(): DenominatorUnits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DenominatorUnits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DenominatorUnits] (val x: Self) extends AnyVal {
    
    inline def setDenominatorUnits(value: js.Array[String] | typings.immutable.mod.List[String]): Self = StObject.set(x, "denominatorUnits", value.asInstanceOf[js.Any])
    
    inline def setDenominatorUnitsUndefined: Self = StObject.set(x, "denominatorUnits", js.undefined)
    
    inline def setDenominatorUnitsVarargs(value: String*): Self = StObject.set(x, "denominatorUnits", js.Array(value*))
    
    inline def setNumeratorUnits(value: js.Array[String] | typings.immutable.mod.List[String]): Self = StObject.set(x, "numeratorUnits", value.asInstanceOf[js.Any])
    
    inline def setNumeratorUnitsUndefined: Self = StObject.set(x, "numeratorUnits", js.undefined)
    
    inline def setNumeratorUnitsVarargs(value: String*): Self = StObject.set(x, "numeratorUnits", js.Array(value*))
  }
}
