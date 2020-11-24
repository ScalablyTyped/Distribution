package typings.realm.Realm.Services

import typings.realm.Realm.Services.HTTP.RequestOptions
import typings.realm.Realm.Services.HTTP.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Stitch HTTP Service is a generic interface that enables you to communicate with any service that is available over HTTP.
  *
  * @see https://docs.mongodb.com/stitch/services/http/
  */
@js.native
trait HTTP_ extends js.Object {
  
  /**
    * Sends an HTTP DELETE request to the specified URL.
    *
    * @param url The URL to send the request to.
    * @param options Options related to the request.
    * @returns The response.
    */
  def delete(url: String): js.Promise[Response] = js.native
  def delete(url: String, options: RequestOptions): js.Promise[Response] = js.native
  
  /**
    * Sends an HTTP GET request to the specified URL.
    *
    * @param url The URL to send the request to.
    * @param options Options related to the request.
    * @returns The response.
    */
  def get(url: String): js.Promise[Response] = js.native
  def get(url: String, options: RequestOptions): js.Promise[Response] = js.native
  
  /**
    * Sends an HTTP HEAD request to the specified URL.
    *
    * @param url The URL to send the request to.
    * @param options Options related to the request.
    * @returns The response.
    */
  def head(url: String): js.Promise[Response] = js.native
  def head(url: String, options: RequestOptions): js.Promise[Response] = js.native
  
  /**
    * Sends an HTTP PATCH request to the specified URL.
    *
    * @param url The URL to send the request to.
    * @param options Options related to the request.
    * @returns The response.
    */
  def patch(url: String): js.Promise[Response] = js.native
  def patch(url: String, options: RequestOptions): js.Promise[Response] = js.native
  
  /**
    * Sends an HTTP POST request to the specified URL.
    *
    * @param url The URL to send the request to.
    * @param options Options related to the request.
    * @returns The response.
    */
  def post(url: String): js.Promise[Response] = js.native
  def post(url: String, options: RequestOptions): js.Promise[Response] = js.native
  
  /**
    * Sends an HTTP PUT request to the specified URL.
    *
    * @param url The URL to send the request to.
    * @param options Options related to the request.
    * @returns The response.
    */
  def put(url: String): js.Promise[Response] = js.native
  def put(url: String, options: RequestOptions): js.Promise[Response] = js.native
}
