package typings.reactCartographer.mapMod

import typings.reactCartographer.reactCartographerStrings.bing
import typings.reactCartographer.reactCartographerStrings.google
import typings.reactCartographer.reactCartographerStrings.yahoo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapProps extends js.Object {
  var addressLine1: js.UndefOr[String] = js.native
  var city: js.UndefOr[String] = js.native
  var country: js.UndefOr[String] = js.native
  /** Default: 270 */
  var height: Double = js.native
  var latitude: js.UndefOr[Double] = js.native
  var longitude: js.UndefOr[Double] = js.native
  /** Default: map */
  var mapId: String = js.native
  /** Default: yahoo */
  var provider: yahoo | google | bing = js.native
  var providerKey: String = js.native
  var state: js.UndefOr[String] = js.native
  /** Default: false */
  var useBackgroundImageStyle: Boolean = js.native
  /** Default: 580 */
  var width: Double = js.native
  /** Default: 10 */
  var zoom: Double = js.native
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
    zoom: Double
  ): MapProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], providerKey = providerKey.asInstanceOf[js.Any], useBackgroundImageStyle = useBackgroundImageStyle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapProps]
  }
  @scala.inline
  implicit class MapPropsOps[Self <: MapProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapId(value: String): Self = this.set("mapId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvider(value: yahoo | google | bing): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setProviderKey(value: String): Self = this.set("providerKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseBackgroundImageStyle(value: Boolean): Self = this.set("useBackgroundImageStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddressLine1(value: String): Self = this.set("addressLine1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressLine1: Self = this.set("addressLine1", js.undefined)
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

