package typings.reactDashGoogleDashMapsDashLoader

import org.scalablytyped.runtime.Instantiable0
import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.MVCArray
import typings.googlemaps.googleNs.mapsNs.geometryNs.encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassencoding extends Instantiable0[encoding] {
  def decodePath(encodedPath: String): js.Array[LatLng] = js.native
  def encodePath(path: js.Array[LatLng]): String = js.native
  def encodePath(path: MVCArray[LatLng]): String = js.native
}

