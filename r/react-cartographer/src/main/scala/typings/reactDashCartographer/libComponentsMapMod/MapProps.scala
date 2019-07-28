package typings.reactDashCartographer.libComponentsMapMod

import typings.reactDashCartographer.reactDashCartographerStrings.bing
import typings.reactDashCartographer.reactDashCartographerStrings.google
import typings.reactDashCartographer.reactDashCartographerStrings.yahoo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapProps extends js.Object {
  var addressLine1: js.UndefOr[String] = js.undefined
  var city: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  /** Default: 270 */
  var height: Double
  var latitude: js.UndefOr[Double] = js.undefined
  var longitude: js.UndefOr[Double] = js.undefined
  /** Default: map */
  var mapId: String
  /** Default: yahoo */
  var provider: yahoo | google | bing
  var providerKey: String
  var state: js.UndefOr[String] = js.undefined
  /** Default: false */
  var useBackgroundImageStyle: Boolean
  /** Default: 580 */
  var width: Double
  /** Default: 10 */
  var zoom: Double
}

object MapProps {
  @scala.inline
  def apply(
    height: Double,
    mapId: String,
    provider: yahoo | google | bing,
    providerKey: String,
    useBackgroundImageStyle: Boolean,
    width: Double,
    zoom: Double,
    addressLine1: String = null,
    city: String = null,
    country: String = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    state: String = null
  ): MapProps = {
    val __obj = js.Dynamic.literal(height = height, mapId = mapId, provider = provider.asInstanceOf[js.Any], providerKey = providerKey, useBackgroundImageStyle = useBackgroundImageStyle, width = width, zoom = zoom)
    if (addressLine1 != null) __obj.updateDynamic("addressLine1")(addressLine1)
    if (city != null) __obj.updateDynamic("city")(city)
    if (country != null) __obj.updateDynamic("country")(country)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[MapProps]
  }
}

