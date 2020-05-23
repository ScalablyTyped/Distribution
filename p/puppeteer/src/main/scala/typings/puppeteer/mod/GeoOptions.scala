package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoOptions extends js.Object {
  /**
    * Non-negative accuracy value.
    */
  var accuracy: js.UndefOr[Double] = js.undefined
  /**
    * Latitude between -90 and 90.
    */
  var latitude: Double
  /**
    * Longitude between -180 and 180.
    */
  var longitude: Double
}

object GeoOptions {
  @scala.inline
  def apply(latitude: Double, longitude: Double, accuracy: js.UndefOr[Double] = js.undefined): GeoOptions = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    if (!js.isUndefined(accuracy)) __obj.updateDynamic("accuracy")(accuracy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoOptions]
  }
}

