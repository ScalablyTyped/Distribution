package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResults[TDoc] extends js.Object {
  var aroundLatLng: js.UndefOr[java.lang.String] = js.undefined
  var automaticRadius: js.UndefOr[java.lang.String] = js.undefined
  var disjunctiveFacets: js.Array[_]
  var exhaustiveNbHits: scala.Boolean
  var facets: js.Array[_]
  var hierarchicalFacets: js.Array[_]
  var hits: js.Array[Hit[TDoc]]
  var hitsPerPage: scala.Double
  var index: java.lang.String
  var nbHits: scala.Double
  var nbPages: scala.Double
  var page: scala.Double
  var processingTimeMS: scala.Double
  var query: java.lang.String
}

object SearchResults {
  @scala.inline
  def apply[TDoc](
    disjunctiveFacets: js.Array[_],
    exhaustiveNbHits: scala.Boolean,
    facets: js.Array[_],
    hierarchicalFacets: js.Array[_],
    hits: js.Array[Hit[TDoc]],
    hitsPerPage: scala.Double,
    index: java.lang.String,
    nbHits: scala.Double,
    nbPages: scala.Double,
    page: scala.Double,
    processingTimeMS: scala.Double,
    query: java.lang.String,
    aroundLatLng: java.lang.String = null,
    automaticRadius: java.lang.String = null
  ): SearchResults[TDoc] = {
    val __obj = js.Dynamic.literal(disjunctiveFacets = disjunctiveFacets, exhaustiveNbHits = exhaustiveNbHits, facets = facets, hierarchicalFacets = hierarchicalFacets, hits = hits, hitsPerPage = hitsPerPage, index = index, nbHits = nbHits, nbPages = nbPages, page = page, processingTimeMS = processingTimeMS, query = query)
    if (aroundLatLng != null) __obj.updateDynamic("aroundLatLng")(aroundLatLng)
    if (automaticRadius != null) __obj.updateDynamic("automaticRadius")(automaticRadius)
    __obj.asInstanceOf[SearchResults[TDoc]]
  }
}

