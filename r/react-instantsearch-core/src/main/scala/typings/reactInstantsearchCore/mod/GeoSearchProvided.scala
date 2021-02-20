package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.anon.Lat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoSearchProvided[THit] extends StObject {
  
  /** a function to generate a URL for the corresponding search state */
  def createURL(args: js.Any*): js.Any = js.native
  
  /** the refinement currently applied */
  var currentRefinement: NESW = js.native
  
  /** the records that matched the search */
  var hits: js.Array[THit] = js.native
  
  /** true if the current refinement is set with the map bounds */
  var isRefinedWithMap: Boolean = js.native
  
  /** the position of the search */
  var position: Lat = js.native
  
  /** a function to toggle the refinement */
  def refine(refinement: NESW): Unit = js.native
}
object GeoSearchProvided {
  
  @scala.inline
  def apply[THit](
    createURL: /* repeated */ js.Any => js.Any,
    currentRefinement: NESW,
    hits: js.Array[THit],
    isRefinedWithMap: Boolean,
    position: Lat,
    refine: NESW => Unit
  ): GeoSearchProvided[THit] = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), currentRefinement = currentRefinement.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], isRefinedWithMap = isRefinedWithMap.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], refine = js.Any.fromFunction1(refine))
    __obj.asInstanceOf[GeoSearchProvided[THit]]
  }
  
  @scala.inline
  implicit class GeoSearchProvidedMutableBuilder[Self <: GeoSearchProvided[_], THit] (val x: Self with GeoSearchProvided[THit]) extends AnyVal {
    
    @scala.inline
    def setCreateURL(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "createURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentRefinement(value: NESW): Self = StObject.set(x, "currentRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHits(value: js.Array[THit]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsVarargs(value: THit*): Self = StObject.set(x, "hits", js.Array(value :_*))
    
    @scala.inline
    def setIsRefinedWithMap(value: Boolean): Self = StObject.set(x, "isRefinedWithMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Lat): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefine(value: NESW => Unit): Self = StObject.set(x, "refine", js.Any.fromFunction1(value))
  }
}
