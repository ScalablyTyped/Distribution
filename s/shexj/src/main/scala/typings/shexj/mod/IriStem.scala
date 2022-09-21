package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IriStem
  extends StObject
     with _valueSetValue {
  
  /**
    * substring of IRI to be matched.
    */
  var stem: IRIREF
  
  /**
    * Mandatory type "IriStem".
    */
  var `type`: typings.shexj.shexjStrings.IriStem
}
object IriStem {
  
  inline def apply(stem: IRIREF): IriStem = {
    val __obj = js.Dynamic.literal(stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IriStem")
    __obj.asInstanceOf[IriStem]
  }
  
  extension [Self <: IriStem](x: Self) {
    
    inline def setStem(value: IRIREF): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.shexj.shexjStrings.IriStem): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
