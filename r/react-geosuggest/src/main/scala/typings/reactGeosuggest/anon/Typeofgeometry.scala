package typings.reactGeosuggest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofgeometry extends js.Object {
  val encoding: js.Any
  val poly: js.Any
  /**
    * Utility functions for computing geodesic angles, distances and areas.
    * The default radius is Earth's radius of 6378137 meters.
    */
  val spherical: js.Any
}

object Typeofgeometry {
  @scala.inline
  def apply(encoding: js.Any, poly: js.Any, spherical: js.Any): Typeofgeometry = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], poly = poly.asInstanceOf[js.Any], spherical = spherical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofgeometry]
  }
}

