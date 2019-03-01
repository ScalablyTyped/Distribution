package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoOptions extends js.Object {
  /**
    * Non-negative accuracy value.
    */
  var accuracy: js.UndefOr[scala.Double] = js.undefined
  /**
    * Latitude between -90 and 90.
    */
  var latitude: scala.Double
  /**
    * Longitude between -180 and 180.
    */
  var longitude: scala.Double
}

object GeoOptions {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double, accuracy: scala.Int | scala.Double = null): GeoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoOptions]
  }
}

