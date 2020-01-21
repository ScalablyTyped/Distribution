package typings.reactGoogleMapsLoader

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.MVCArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofspherical extends js.Object {
  /**
    * Returns the area of a closed path.
    * The computed area uses the same units as the radius.
    * The radius defaults to the Earth's radius in meters,
    * in which case the area is in square meters.
    */
  def computeArea(path: js.Array[LatLng]): Double = js.native
  def computeArea(path: js.Array[LatLng], radius: Double): Double = js.native
  def computeArea(path: MVCArray[LatLng]): Double = js.native
  def computeArea(path: MVCArray[LatLng], radius: Double): Double = js.native
  /**
    * Returns the distance, in meters, between two LatLngs.
    * You can optionally specify a custom radius.
    * The radius defaults to the radius of the Earth.
    */
  def computeDistanceBetween(from: LatLng, to: LatLng): Double = js.native
  def computeDistanceBetween(from: LatLng, to: LatLng, radius: Double): Double = js.native
  /**
    * Returns the heading from one LatLng to another LatLng.
    * Headings are expressed in degrees clockwise from North within the range
    * [-180,180).
    */
  def computeHeading(from: LatLng, to: LatLng): Double = js.native
  /**
    * Returns the length of the given path.
    */
  def computeLength(path: js.Array[LatLng]): Double = js.native
  def computeLength(path: js.Array[LatLng], radius: Double): Double = js.native
  def computeLength(path: MVCArray[LatLng]): Double = js.native
  def computeLength(path: MVCArray[LatLng], radius: Double): Double = js.native
  /**
    * Returns the LatLng resulting from moving a distance from an origin in
    * the specified heading (expressed in degrees clockwise from north).
    */
  def computeOffset(from: LatLng, distance: Double, heading: Double): LatLng = js.native
  def computeOffset(from: LatLng, distance: Double, heading: Double, radius: Double): LatLng = js.native
  /**
    * Returns the location of origin when provided with a LatLng destination,
    * meters travelled and original heading. Headings are expressed in
    * degrees clockwise from North. This function returns null when no
    * solution is available.
    */
  def computeOffsetOrigin(to: LatLng, distance: Double, heading: Double): LatLng = js.native
  def computeOffsetOrigin(to: LatLng, distance: Double, heading: Double, radius: Double): LatLng = js.native
  /**
    * Returns the signed area of a closed path. The signed area may be used
    * to determine the orientation of the path. The computed area uses the
    * same units as the radius. The radius defaults to the Earth's radius in
    * meters, in which case the area is in square meters.
    */
  def computeSignedArea(loop: js.Array[LatLng]): Double = js.native
  def computeSignedArea(loop: js.Array[LatLng], radius: Double): Double = js.native
  def computeSignedArea(loop: MVCArray[LatLng]): Double = js.native
  def computeSignedArea(loop: MVCArray[LatLng], radius: Double): Double = js.native
  /**
    * Returns the LatLng which lies the given fraction of the way between the
    * origin LatLng and the destination LatLng.
    */
  def interpolate(from: LatLng, to: LatLng, fraction: Double): LatLng = js.native
}

