package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.anon.Lat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoSearchProvided[THit] extends StObject {
  
  /** a function to generate a URL for the corresponding search state */
  def createURL(args: Any*): Any
  
  /** the refinement currently applied */
  var currentRefinement: NESW
  
  /** the records that matched the search */
  var hits: js.Array[THit]
  
  /** true if the current refinement is set with the map bounds */
  var isRefinedWithMap: Boolean
  
  /** the position of the search */
  var position: Lat
  
  /** a function to toggle the refinement */
  def refine(refinement: NESW): Unit
}
object GeoSearchProvided {
  
  inline def apply[THit](
    createURL: /* repeated */ Any => Any,
    currentRefinement: NESW,
    hits: js.Array[THit],
    isRefinedWithMap: Boolean,
    position: Lat,
    refine: NESW => Unit
  ): GeoSearchProvided[THit] = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), currentRefinement = currentRefinement.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], isRefinedWithMap = isRefinedWithMap.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], refine = js.Any.fromFunction1(refine))
    __obj.asInstanceOf[GeoSearchProvided[THit]]
  }
  
  extension [Self <: GeoSearchProvided[?], THit](x: Self & GeoSearchProvided[THit]) {
    
    inline def setCreateURL(value: /* repeated */ Any => Any): Self = StObject.set(x, "createURL", js.Any.fromFunction1(value))
    
    inline def setCurrentRefinement(value: NESW): Self = StObject.set(x, "currentRefinement", value.asInstanceOf[js.Any])
    
    inline def setHits(value: js.Array[THit]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setHitsVarargs(value: THit*): Self = StObject.set(x, "hits", js.Array(value*))
    
    inline def setIsRefinedWithMap(value: Boolean): Self = StObject.set(x, "isRefinedWithMap", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Lat): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRefine(value: NESW => Unit): Self = StObject.set(x, "refine", js.Any.fromFunction1(value))
  }
}
