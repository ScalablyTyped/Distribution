package typings.regexpTree.astMod

import typings.regexpTree.regexpTreeStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericBackreference
  extends StObject
     with Base[typings.regexpTree.regexpTreeStrings.Backreference]
     with Backreference {
  
  var kind: number
  
  var number: Double
  
  var reference: Double
}
object NumericBackreference {
  
  inline def apply(number: Double, reference: Double): NumericBackreference = {
    val __obj = js.Dynamic.literal(kind = "number", number = number.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Backreference")
    __obj.asInstanceOf[NumericBackreference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumericBackreference] (val x: Self) extends AnyVal {
    
    inline def setKind(value: number): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setReference(value: Double): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
