package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageStem
  extends StObject
     with _valueSetValue {
  
  /**
    * substring of Language Tag to be matched.
    */
  var stem: LANGTAG
  
  /**
    * Mandatory type "LanguageStem".
    */
  var `type`: typings.shexj.shexjStrings.LanguageStem
}
object LanguageStem {
  
  inline def apply(stem: LANGTAG): LanguageStem = {
    val __obj = js.Dynamic.literal(stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LanguageStem")
    __obj.asInstanceOf[LanguageStem]
  }
  
  extension [Self <: LanguageStem](x: Self) {
    
    inline def setStem(value: LANGTAG): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.shexj.shexjStrings.LanguageStem): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
