package typings.reactDashGoogleDashMapsDashLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofgeometry extends js.Object {
  var encoding: TypeofClassencoding
  var poly: TypeofClasspoly
  /**
    * Utility functions for computing geodesic angles, distances and areas.
    * The default radius is Earth's radius of 6378137 meters.
    */
  var spherical: TypeofClassspherical
}

object Typeofgeometry {
  @scala.inline
  def apply(encoding: TypeofClassencoding, poly: TypeofClasspoly, spherical: TypeofClassspherical): Typeofgeometry = {
    val __obj = js.Dynamic.literal(encoding = encoding, poly = poly, spherical = spherical)
  
    __obj.asInstanceOf[Typeofgeometry]
  }
}

