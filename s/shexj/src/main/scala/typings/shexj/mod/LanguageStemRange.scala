package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageStemRange
  extends StObject
     with _valueSetValue {
  
  /**
    * Language Tags or {@link LanguageStem}s to exclude.
    */
  var exclusions: js.Array[LANGTAG | LanguageStem]
  
  /**
    * substring of Language-Tag to be matched or a {@link Wildcard} matching any Language Tag.
    */
  var stem: LANGTAG | Wildcard
  
  /**
    * Mandatory type "LanguageStemRange".
    */
  var `type`: typings.shexj.shexjStrings.LanguageStemRange
}
object LanguageStemRange {
  
  inline def apply(exclusions: js.Array[LANGTAG | LanguageStem], stem: LANGTAG | Wildcard): LanguageStemRange = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LanguageStemRange")
    __obj.asInstanceOf[LanguageStemRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LanguageStemRange] (val x: Self) extends AnyVal {
    
    inline def setExclusions(value: js.Array[LANGTAG | LanguageStem]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    inline def setExclusionsVarargs(value: (LANGTAG | LanguageStem)*): Self = StObject.set(x, "exclusions", js.Array(value*))
    
    inline def setStem(value: LANGTAG | Wildcard): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.shexj.shexjStrings.LanguageStemRange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
