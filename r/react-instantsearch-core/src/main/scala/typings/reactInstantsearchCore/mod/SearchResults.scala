package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResults[TDoc] extends StObject {
  
  var appliedRelevancyStrictness: js.UndefOr[Double] = js.undefined
  
  var aroundLatLng: js.UndefOr[String] = js.undefined
  
  var automaticRadius: js.UndefOr[String] = js.undefined
  
  var disjunctiveFacets: js.Array[Any]
  
  var exhaustiveNbHits: Boolean
  
  var facets: js.Array[Any]
  
  var hierarchicalFacets: js.Array[Any]
  
  var hits: js.Array[Hit[TDoc]]
  
  var hitsPerPage: Double
  
  var index: String
  
  var nbHits: Double
  
  var nbPages: Double
  
  var nbSortedHits: js.UndefOr[Double] = js.undefined
  
  var page: Double
  
  var processingTimeMS: Double
  
  var query: String
  
  var queryID: js.UndefOr[String] = js.undefined
}
object SearchResults {
  
  inline def apply[TDoc](
    disjunctiveFacets: js.Array[Any],
    exhaustiveNbHits: Boolean,
    facets: js.Array[Any],
    hierarchicalFacets: js.Array[Any],
    hits: js.Array[Hit[TDoc]],
    hitsPerPage: Double,
    index: String,
    nbHits: Double,
    nbPages: Double,
    page: Double,
    processingTimeMS: Double,
    query: String
  ): SearchResults[TDoc] = {
    val __obj = js.Dynamic.literal(disjunctiveFacets = disjunctiveFacets.asInstanceOf[js.Any], exhaustiveNbHits = exhaustiveNbHits.asInstanceOf[js.Any], facets = facets.asInstanceOf[js.Any], hierarchicalFacets = hierarchicalFacets.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsPerPage = hitsPerPage.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], nbPages = nbPages.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResults[TDoc]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchResults[?], TDoc] (val x: Self & SearchResults[TDoc]) extends AnyVal {
    
    inline def setAppliedRelevancyStrictness(value: Double): Self = StObject.set(x, "appliedRelevancyStrictness", value.asInstanceOf[js.Any])
    
    inline def setAppliedRelevancyStrictnessUndefined: Self = StObject.set(x, "appliedRelevancyStrictness", js.undefined)
    
    inline def setAroundLatLng(value: String): Self = StObject.set(x, "aroundLatLng", value.asInstanceOf[js.Any])
    
    inline def setAroundLatLngUndefined: Self = StObject.set(x, "aroundLatLng", js.undefined)
    
    inline def setAutomaticRadius(value: String): Self = StObject.set(x, "automaticRadius", value.asInstanceOf[js.Any])
    
    inline def setAutomaticRadiusUndefined: Self = StObject.set(x, "automaticRadius", js.undefined)
    
    inline def setDisjunctiveFacets(value: js.Array[Any]): Self = StObject.set(x, "disjunctiveFacets", value.asInstanceOf[js.Any])
    
    inline def setDisjunctiveFacetsVarargs(value: Any*): Self = StObject.set(x, "disjunctiveFacets", js.Array(value*))
    
    inline def setExhaustiveNbHits(value: Boolean): Self = StObject.set(x, "exhaustiveNbHits", value.asInstanceOf[js.Any])
    
    inline def setFacets(value: js.Array[Any]): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    inline def setFacetsVarargs(value: Any*): Self = StObject.set(x, "facets", js.Array(value*))
    
    inline def setHierarchicalFacets(value: js.Array[Any]): Self = StObject.set(x, "hierarchicalFacets", value.asInstanceOf[js.Any])
    
    inline def setHierarchicalFacetsVarargs(value: Any*): Self = StObject.set(x, "hierarchicalFacets", js.Array(value*))
    
    inline def setHits(value: js.Array[Hit[TDoc]]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setHitsPerPage(value: Double): Self = StObject.set(x, "hitsPerPage", value.asInstanceOf[js.Any])
    
    inline def setHitsVarargs(value: Hit[TDoc]*): Self = StObject.set(x, "hits", js.Array(value*))
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setNbHits(value: Double): Self = StObject.set(x, "nbHits", value.asInstanceOf[js.Any])
    
    inline def setNbPages(value: Double): Self = StObject.set(x, "nbPages", value.asInstanceOf[js.Any])
    
    inline def setNbSortedHits(value: Double): Self = StObject.set(x, "nbSortedHits", value.asInstanceOf[js.Any])
    
    inline def setNbSortedHitsUndefined: Self = StObject.set(x, "nbSortedHits", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setProcessingTimeMS(value: Double): Self = StObject.set(x, "processingTimeMS", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryID(value: String): Self = StObject.set(x, "queryID", value.asInstanceOf[js.Any])
    
    inline def setQueryIDUndefined: Self = StObject.set(x, "queryID", js.undefined)
  }
}
