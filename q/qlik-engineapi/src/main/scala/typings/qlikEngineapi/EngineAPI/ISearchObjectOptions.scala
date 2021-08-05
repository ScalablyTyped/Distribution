package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchObjectOptions...
  */
trait ISearchObjectOptions extends StObject {
  
  /**
    * This array is either empty or contains qProperty.
    */
  var qAttributes: js.Array[String]
  
  /* add new member  */
  /**
    * Encoding used to compute qRanges of type SearchCharRange.
    * Possible values:
    * - Utf8 (default)
    * - Utf16
    *
    * Note: Only affects the computation of the ranges. It does not impact the encoding of the text.
    */
  var qCharEncoding: String
}
object ISearchObjectOptions {
  
  inline def apply(qAttributes: js.Array[String], qCharEncoding: String): ISearchObjectOptions = {
    val __obj = js.Dynamic.literal(qAttributes = qAttributes.asInstanceOf[js.Any], qCharEncoding = qCharEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchObjectOptions]
  }
  
  extension [Self <: ISearchObjectOptions](x: Self) {
    
    inline def setQAttributes(value: js.Array[String]): Self = StObject.set(x, "qAttributes", value.asInstanceOf[js.Any])
    
    inline def setQAttributesVarargs(value: String*): Self = StObject.set(x, "qAttributes", js.Array(value :_*))
    
    inline def setQCharEncoding(value: String): Self = StObject.set(x, "qCharEncoding", value.asInstanceOf[js.Any])
  }
}
