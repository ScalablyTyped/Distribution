package typings.smartystreetsJavascriptSdk.mod.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smartystreets-javascript-sdk", "core.ClientBuilder")
@js.native
class ClientBuilder[T] protected () extends js.Object {
  def this(credentials: SharedCredentials) = this()
  def this(credentials: StaticCredentials) = this()
  
  var baseUrl: String = js.native
  
  def buildClient(baseUrl: String, Client: Client[T]): Client[T] = js.native
  
  def buildInternationalStreetClient(): Client[typings.smartystreetsJavascriptSdk.mod.internationalStreet.Lookup] = js.native
  
  def buildSender(): js.Any = js.native
  
  def buildUsAutocompleteClient(): Client[typings.smartystreetsJavascriptSdk.mod.usAutocomplete.Lookup] = js.native
  
  def buildUsAutocompleteProClient(): Client[typings.smartystreetsJavascriptSdk.mod.usAutocompletePro.Lookup] = js.native
  
  def buildUsExtractClient(): Client[typings.smartystreetsJavascriptSdk.mod.usExtract.Lookup] = js.native
  
  def buildUsStreetApiClient(): Client[typings.smartystreetsJavascriptSdk.mod.usStreet.Lookup] = js.native
  
  def buildUsZipcodeClient(): Client[typings.smartystreetsJavascriptSdk.mod.usZipcode.Lookup] = js.native
  
  var customHeaders: js.Any = js.native
  
  var debug: Boolean = js.native
  
  var httpSender: js.Any = js.native
  
  var licenses: js.Array[String] = js.native
  
  var maxRetries: Double = js.native
  
  var maxTimeout: Double = js.native
  
  var proxy: String = js.native
  
  var signer: StaticCredentials | SharedCredentials = js.native
  
  def withBaseUrl(url: String): ClientBuilder[T] = js.native
  
  def withCustomHeaders(customHeaders: js.Any): ClientBuilder[T] = js.native
  
  def withDebug(): ClientBuilder[T] = js.native
  
  def withLicenses(licenses: js.Array[String]): ClientBuilder[T] = js.native
  
  def withMaxRetries(retries: Double): ClientBuilder[T] = js.native
  
  def withMaxTimeout(timeout: Double): ClientBuilder[T] = js.native
  
  def withProxy(host: String, port: Double): ClientBuilder[T] = js.native
  def withProxy(host: String, port: Double, username: js.UndefOr[scala.Nothing], password: String): ClientBuilder[T] = js.native
  def withProxy(host: String, port: Double, username: String): ClientBuilder[T] = js.native
  def withProxy(host: String, port: Double, username: String, password: String): ClientBuilder[T] = js.native
  
  def withSender(sender: js.Any): ClientBuilder[T] = js.native
}
