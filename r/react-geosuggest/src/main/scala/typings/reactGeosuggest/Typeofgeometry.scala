package typings.reactGeosuggest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofgeometry extends js.Object {
  val encoding: Typeofencoding
  val poly: Typeofpoly
  /**
    * Utility functions for computing geodesic angles, distances and areas.
    * The default radius is Earth's radius of 6378137 meters.
    */
  val spherical: Typeofspherical
}

object Typeofgeometry {
  @scala.inline
  def apply(encoding: Typeofencoding, poly: Typeofpoly, spherical: Typeofspherical): Typeofgeometry = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], poly = poly.asInstanceOf[js.Any], spherical = spherical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofgeometry]
  }
}

