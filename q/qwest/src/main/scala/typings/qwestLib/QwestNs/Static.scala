package typings
package qwestLib.QwestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  /** Base URI for requests. Prepended to request URIs */
  var base: java.lang.String = js.native
  /** Is XHR2 supported by the browser? */
  var xhr2: scala.Boolean = js.native
  /** Set XHR options before request */
  def before(callback: js.Function0[_]): Static = js.native
  /**
  		 * Perfoms an AJAX DELETE request
  		 * @param url URL that the request is sent to
  		 * @param data Data to send to the server
  		 * @param options Configuration options for the AJAX request
  		 * */
  def delete(url: java.lang.String): Promise = js.native
  /**
  		 * Perfoms an AJAX DELETE request
  		 * @param url URL that the request is sent to
  		 * @param data Data to send to the server
  		 * @param options Configuration options for the AJAX request
  		 * */
  def delete(url: java.lang.String, data: js.Any): Promise = js.native
  /**
  		 * Perfoms an AJAX DELETE request
  		 * @param url URL that the request is sent to
  		 * @param data Data to send to the server
  		 * @param options Configuration options for the AJAX request
  		 * */
  def delete(url: java.lang.String, data: js.Any, options: Options): Promise = js.native
  /**
  		 * Perfoms an AJAX GET request
  		 * @param url URL that the request is sent to
  		 * @param data Data to send to the server
  		 * @param options Configuration options for the AJAX request
  		 * */
  def get(url: java.lang.String): Promise = js.native
  /**
  		 * Perfoms an AJAX GET request
  		 * @param url URL that the request is sent to
  		 * @param data Data to send to the server
  		 * @param options Configuration options for the AJAX request
  		 * */
  def get(url: java.lang.String, data: js.Any): Promise = js.native
  /**
  		 * Perfoms an AJAX GET request
  		 * @param url URL that the request is sent to
  		 * @param data Data to send to the server
  		 * @param options Configuration options for the AJAX request
  		 * */
  def get(url: java.lang.String, data: js.Any, options: Options): Promise = js.native
  /** Sets the request limit */
  def limit(by: scala.Double): scala.Unit = js.native
  /**
  		 * Perfoms an AJAX POST request
  		 * @param url URL that the request is sent to
  		 * @param data Data to send to the server
  		 * @param options Configuration options for the AJAX request
  		 * */
  def post(url: java.lang.String): Promise = js.native
  /**
  		 * Perfoms an AJAX POST request
  		 * @param url URL that the request is sent to
  		 * @param data Data to send to the server
  		 * @param options Configuration options for the AJAX request
  		 * */
  def post(url: java.lang.String, data: js.Any): Promise = js.native
  /**
  		 * Perfoms an AJAX POST request
  		 * @param url URL that the request is sent to
  		 * @param data Data to send to the server
  		 * @param options Configuration options for the AJAX request
  		 * */
  def post(url: java.lang.String, data: js.Any, options: Options): Promise = js.native
  /**
  		 * Perfoms an AJAX PUT request
  		 * @param url URL that the request is sent to
  		 * @param data Data to send to the server
  		 * @param options Configuration options for the AJAX request
  		 * */
  def put(url: java.lang.String): Promise = js.native
  /**
  		 * Perfoms an AJAX PUT request
  		 * @param url URL that the request is sent to
  		 * @param data Data to send to the server
  		 * @param options Configuration options for the AJAX request
  		 * */
  def put(url: java.lang.String, data: js.Any): Promise = js.native
  /**
  		 * Perfoms an AJAX PUT request
  		 * @param url URL that the request is sent to
  		 * @param data Data to send to the server
  		 * @param options Configuration options for the AJAX request
  		 * */
  def put(url: java.lang.String, data: js.Any, options: Options): Promise = js.native
  /** Set default cross-domain response type for IE8/9 (defaults to 'json') */
  def setDefaultXdrResponseType(`type`: java.lang.String): scala.Unit = js.native
}

