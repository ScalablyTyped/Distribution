package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResults[TDoc] extends js.Object {
  var aroundLatLng: js.UndefOr[String] = js.undefined
  var automaticRadius: js.UndefOr[String] = js.undefined
  var disjunctiveFacets: js.Array[_]
  var exhaustiveNbHits: Boolean
  var facets: js.Array[_]
  var hierarchicalFacets: js.Array[_]
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
    query: String,
    aroundLatLng: String = null,
    automaticRadius: String = null
  ): SearchResults[TDoc] = {
    val __obj = js.Dynamic.literal(disjunctiveFacets = disjunctiveFacets.asInstanceOf[js.Any], exhaustiveNbHits = exhaustiveNbHits.asInstanceOf[js.Any], facets = facets.asInstanceOf[js.Any], hierarchicalFacets = hierarchicalFacets.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsPerPage = hitsPerPage.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], nbPages = nbPages.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (aroundLatLng != null) __obj.updateDynamic("aroundLatLng")(aroundLatLng.asInstanceOf[js.Any])
    if (automaticRadius != null) __obj.updateDynamic("automaticRadius")(automaticRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResults[TDoc]]
  }
}

