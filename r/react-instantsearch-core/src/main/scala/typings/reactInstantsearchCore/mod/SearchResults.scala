package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResults[TDoc] extends js.Object {
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

object SearchResults {
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
  ): SearchResults[TDoc] = {
    val __obj = js.Dynamic.literal(disjunctiveFacets = disjunctiveFacets.asInstanceOf[js.Any], exhaustiveNbHits = exhaustiveNbHits.asInstanceOf[js.Any], facets = facets.asInstanceOf[js.Any], hierarchicalFacets = hierarchicalFacets.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsPerPage = hitsPerPage.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], nbPages = nbPages.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResults[TDoc]]
  }
  @scala.inline
  implicit class SearchResultsOps[Self <: SearchResults[_], TDoc] (val x: Self with SearchResults[TDoc]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisjunctiveFacetsVarargs(value: js.Any*): Self = this.set("disjunctiveFacets", js.Array(value :_*))
    @scala.inline
    def setDisjunctiveFacets(value: js.Array[_]): Self = this.set("disjunctiveFacets", value.asInstanceOf[js.Any])
    @scala.inline
    def setExhaustiveNbHits(value: Boolean): Self = this.set("exhaustiveNbHits", value.asInstanceOf[js.Any])
    @scala.inline
    def setFacetsVarargs(value: js.Any*): Self = this.set("facets", js.Array(value :_*))
    @scala.inline
    def setFacets(value: js.Array[_]): Self = this.set("facets", value.asInstanceOf[js.Any])
    @scala.inline
    def setHierarchicalFacetsVarargs(value: js.Any*): Self = this.set("hierarchicalFacets", js.Array(value :_*))
    @scala.inline
    def setHierarchicalFacets(value: js.Array[_]): Self = this.set("hierarchicalFacets", value.asInstanceOf[js.Any])
    @scala.inline
    def setHitsVarargs(value: Hit[TDoc]*): Self = this.set("hits", js.Array(value :_*))
    @scala.inline
    def setHits(value: js.Array[Hit[TDoc]]): Self = this.set("hits", value.asInstanceOf[js.Any])
    @scala.inline
    def setHitsPerPage(value: Double): Self = this.set("hitsPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setNbHits(value: Double): Self = this.set("nbHits", value.asInstanceOf[js.Any])
    @scala.inline
    def setNbPages(value: Double): Self = this.set("nbPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessingTimeMS(value: Double): Self = this.set("processingTimeMS", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setAroundLatLng(value: String): Self = this.set("aroundLatLng", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAroundLatLng: Self = this.set("aroundLatLng", js.undefined)
    @scala.inline
    def setAutomaticRadius(value: String): Self = this.set("automaticRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomaticRadius: Self = this.set("automaticRadius", js.undefined)
  }
  
}

