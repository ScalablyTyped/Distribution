package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResults[TDoc] extends StObject {
  
  var aroundLatLng: js.UndefOr[String] = js.undefined
  
  var automaticRadius: js.UndefOr[String] = js.undefined
  
  var disjunctiveFacets: js.Array[js.Any]
  
  var exhaustiveNbHits: Boolean
  
  var facets: js.Array[js.Any]
  
  var hierarchicalFacets: js.Array[js.Any]
  
  var hits: js.Array[Hit[TDoc]]
  
  var hitsPerPage: Double
  
  var index: String
  
  var nbHits: Double
  
  var nbPages: Double
  
  var page: Double
  
  var processingTimeMS: Double
  
  var query: String
}
object SearchResults {
  
  @scala.inline
  def apply[TDoc](
    disjunctiveFacets: js.Array[js.Any],
    exhaustiveNbHits: Boolean,
    facets: js.Array[js.Any],
    hierarchicalFacets: js.Array[js.Any],
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
  implicit class SearchResultsMutableBuilder[Self <: SearchResults[?], TDoc] (val x: Self & SearchResults[TDoc]) extends AnyVal {
    
    @scala.inline
    def setAroundLatLng(value: String): Self = StObject.set(x, "aroundLatLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAroundLatLngUndefined: Self = StObject.set(x, "aroundLatLng", js.undefined)
    
    @scala.inline
    def setAutomaticRadius(value: String): Self = StObject.set(x, "automaticRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticRadiusUndefined: Self = StObject.set(x, "automaticRadius", js.undefined)
    
    @scala.inline
    def setDisjunctiveFacets(value: js.Array[js.Any]): Self = StObject.set(x, "disjunctiveFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisjunctiveFacetsVarargs(value: js.Any*): Self = StObject.set(x, "disjunctiveFacets", js.Array(value :_*))
    
    @scala.inline
    def setExhaustiveNbHits(value: Boolean): Self = StObject.set(x, "exhaustiveNbHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacets(value: js.Array[js.Any]): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetsVarargs(value: js.Any*): Self = StObject.set(x, "facets", js.Array(value :_*))
    
    @scala.inline
    def setHierarchicalFacets(value: js.Array[js.Any]): Self = StObject.set(x, "hierarchicalFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchicalFacetsVarargs(value: js.Any*): Self = StObject.set(x, "hierarchicalFacets", js.Array(value :_*))
    
    @scala.inline
    def setHits(value: js.Array[Hit[TDoc]]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsPerPage(value: Double): Self = StObject.set(x, "hitsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsVarargs(value: Hit[TDoc]*): Self = StObject.set(x, "hits", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbHits(value: Double): Self = StObject.set(x, "nbHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbPages(value: Double): Self = StObject.set(x, "nbPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingTimeMS(value: Double): Self = StObject.set(x, "processingTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
