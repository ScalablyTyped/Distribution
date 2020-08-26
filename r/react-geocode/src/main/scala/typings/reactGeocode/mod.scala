package typings.reactGeocode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-geocode", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def enableDebug(): Unit = js.native
  def enableDebug(enable: Boolean): Unit = js.native
  def fromAddress(address: String): js.Promise[_] = js.native
  def fromAddress(
    address: String,
    apiKey: js.UndefOr[scala.Nothing],
    language: js.UndefOr[scala.Nothing],
    region: String
  ): js.Promise[_] = js.native
  def fromAddress(address: String, apiKey: js.UndefOr[scala.Nothing], language: String): js.Promise[_] = js.native
  def fromAddress(address: String, apiKey: js.UndefOr[scala.Nothing], language: String, region: String): js.Promise[_] = js.native
  def fromAddress(address: String, apiKey: String): js.Promise[_] = js.native
  def fromAddress(address: String, apiKey: String, language: js.UndefOr[scala.Nothing], region: String): js.Promise[_] = js.native
  def fromAddress(address: String, apiKey: String, language: String): js.Promise[_] = js.native
  def fromAddress(address: String, apiKey: String, language: String, region: String): js.Promise[_] = js.native
  def fromLatLng(latitude: String, longitude: String): js.Promise[_] = js.native
  def fromLatLng(
    latitude: String,
    longitude: String,
    apiKey: js.UndefOr[scala.Nothing],
    language: js.UndefOr[scala.Nothing],
    region: String
  ): js.Promise[_] = js.native
  def fromLatLng(latitude: String, longitude: String, apiKey: js.UndefOr[scala.Nothing], language: String): js.Promise[_] = js.native
  def fromLatLng(
    latitude: String,
    longitude: String,
    apiKey: js.UndefOr[scala.Nothing],
    language: String,
    region: String
  ): js.Promise[_] = js.native
  def fromLatLng(latitude: String, longitude: String, apiKey: String): js.Promise[_] = js.native
  def fromLatLng(
    latitude: String,
    longitude: String,
    apiKey: String,
    language: js.UndefOr[scala.Nothing],
    region: String
  ): js.Promise[_] = js.native
  def fromLatLng(latitude: String, longitude: String, apiKey: String, language: String): js.Promise[_] = js.native
  def fromLatLng(latitude: String, longitude: String, apiKey: String, language: String, region: String): js.Promise[_] = js.native
  def setApiKey(api_key: String): Unit = js.native
  def setLanguage(language: String): Unit = js.native
  def setRegion(region: String): Unit = js.native
}

