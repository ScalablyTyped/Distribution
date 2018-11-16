package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SearchResults[TDoc] extends js.Object {
  var aroundLatLng: js.UndefOr[java.lang.String] = js.undefined
  var automaticRadius: js.UndefOr[java.lang.String] = js.undefined
  var disjunctiveFacets: js.Array[_]
  var exhaustiveNbHits: reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreLibNumbers.`true`
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

