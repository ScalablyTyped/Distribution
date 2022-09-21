package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IriStemRange
  extends StObject
     with _valueSetValue {
  
  /**
    * IRIs or {@link IRIStem}s to exclude.
    */
  var exclusions: js.Array[IRIREF | IriStem]
  
  /**
    * substring of IRI to be matched or a {@link Wildcard} matching any IRI.
    */
  var stem: IRIREF | Wildcard
  
  /**
    * Mandatory type "IriStemRange".
    */
  var `type`: typings.shexj.shexjStrings.IriStemRange
}
object IriStemRange {
  
  inline def apply(exclusions: js.Array[IRIREF | IriStem], stem: IRIREF | Wildcard): IriStemRange = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IriStemRange")
    __obj.asInstanceOf[IriStemRange]
  }
  
  extension [Self <: IriStemRange](x: Self) {
    
    inline def setExclusions(value: js.Array[IRIREF | IriStem]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    inline def setExclusionsVarargs(value: (IRIREF | IriStem)*): Self = StObject.set(x, "exclusions", js.Array(value*))
    
    inline def setStem(value: IRIREF | Wildcard): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.shexj.shexjStrings.IriStemRange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
