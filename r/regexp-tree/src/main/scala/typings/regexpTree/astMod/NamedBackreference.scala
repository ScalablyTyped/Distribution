package typings.regexpTree.astMod

import typings.regexpTree.regexpTreeStrings.name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedBackreference
  extends StObject
     with Base[typings.regexpTree.regexpTreeStrings.Backreference]
     with Backreference {
  
  var kind: name
  
  var number: Double
  
  var reference: String
  
  var referenceRaw: String
}
object NamedBackreference {
  
  inline def apply(number: Double, reference: String, referenceRaw: String): NamedBackreference = {
    val __obj = js.Dynamic.literal(kind = "name", number = number.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], referenceRaw = referenceRaw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Backreference")
    __obj.asInstanceOf[NamedBackreference]
  }
  
  extension [Self <: NamedBackreference](x: Self) {
    
    inline def setKind(value: name): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceRaw(value: String): Self = StObject.set(x, "referenceRaw", value.asInstanceOf[js.Any])
  }
}
