package typings.reactDashGoogleDashPlacesDashSuggest

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.MVCArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofencoding extends js.Object {
  def decodePath(encodedPath: String): js.Array[LatLng] = js.native
  def encodePath(path: js.Array[LatLng]): String = js.native
  def encodePath(path: MVCArray[LatLng]): String = js.native
}

