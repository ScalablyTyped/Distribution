package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[index: string] : react-instantsearch-core.react-instantsearch-core.SearchResults<TDoc>} & react-instantsearch-core.react-instantsearch-core.SearchResults<TDoc> */
@js.native
trait AllSearchResults[TDoc] extends /* index */ StringDictionary[SearchResults[TDoc]] {
  
  var aroundLatLng: js.UndefOr[String] = js.native
  
  var automaticRadius: js.UndefOr[String] = js.native
  
  var disjunctiveFacets: js.Array[_] = js.native
  
  var exhaustiveNbHits: Boolean = js.native
  
  var facets: js.Array[_] = js.native
  
  var hierarchicalFacets: js.Array[_] = js.native
  
  var hits: js.Array[Hit[TDoc]] = js.native
  
  var hitsPerPage: Double = js.native
  
  var index: String = js.native
  
  var nbHits: Double = js.native
  
  var nbPages: Double = js.native
  
  var page: Double = js.native
  
  var processingTimeMS: Double = js.native
  
  var query: String = js.native
}
object AllSearchResults {
  
  @scala.inline
  def apply[TDoc](
    disjunctiveFacets: js.Array[_],
    exhaustiveNbHits: Boolean,
    facets: js.Array[_],
    hierarchicalFacets: js.Array[_],
    hits: js.Array[Hit[TDoc]],
    hitsPerPage: Double,
    index: String,
    nbHits: Double,
    nbPages: Double,
    page: Double,
    processingTimeMS: Double,
    query: String
  ): AllSearchResults[TDoc] = {
    val __obj = js.Dynamic.literal(disjunctiveFacets = disjunctiveFacets.asInstanceOf[js.Any], exhaustiveNbHits = exhaustiveNbHits.asInstanceOf[js.Any], facets = facets.asInstanceOf[js.Any], hierarchicalFacets = hierarchicalFacets.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsPerPage = hitsPerPage.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], nbPages = nbPages.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllSearchResults[TDoc]]
  }
  
  @scala.inline
  implicit class AllSearchResultsMutableBuilder[Self <: AllSearchResults[_], TDoc] (val x: Self with AllSearchResults[TDoc]) extends AnyVal {
    
    @scala.inline
    def setAroundLatLng(value: String): Self = StObject.set(x, "aroundLatLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAroundLatLngUndefined: Self = StObject.set(x, "aroundLatLng", js.undefined)
    
    @scala.inline
    def setAutomaticRadius(value: String): Self = StObject.set(x, "automaticRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticRadiusUndefined: Self = StObject.set(x, "automaticRadius", js.undefined)
    
    @scala.inline
    def setDisjunctiveFacets(value: js.Array[_]): Self = StObject.set(x, "disjunctiveFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisjunctiveFacetsVarargs(value: js.Any*): Self = StObject.set(x, "disjunctiveFacets", js.Array(value :_*))
    
    @scala.inline
    def setExhaustiveNbHits(value: Boolean): Self = StObject.set(x, "exhaustiveNbHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacets(value: js.Array[_]): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetsVarargs(value: js.Any*): Self = StObject.set(x, "facets", js.Array(value :_*))
    
    @scala.inline
    def setHierarchicalFacets(value: js.Array[_]): Self = StObject.set(x, "hierarchicalFacets", value.asInstanceOf[js.Any])
    
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
