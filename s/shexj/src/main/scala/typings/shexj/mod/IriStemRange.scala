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
  var exclusions: js.Array[iriRangeExclusion]
  
  /**
    * substring of IRI to be matched or a {@link Wildcard} matching any IRI.
    */
  var stem: iriRangeStem
  
  /**
    * Mandatory type "IriStemRange".
    */
  var `type`: typings.shexj.shexjStrings.IriStemRange
}
object IriStemRange {
  
  inline def apply(exclusions: js.Array[iriRangeExclusion], stem: iriRangeStem): IriStemRange = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IriStemRange")
    __obj.asInstanceOf[IriStemRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IriStemRange] (val x: Self) extends AnyVal {
    
    inline def setExclusions(value: js.Array[iriRangeExclusion]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    inline def setExclusionsVarargs(value: iriRangeExclusion*): Self = StObject.set(x, "exclusions", js.Array(value*))
    
    inline def setStem(value: iriRangeStem): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.shexj.shexjStrings.IriStemRange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
