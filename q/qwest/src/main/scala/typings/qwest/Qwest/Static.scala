package typings.qwest.Qwest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  /** Base URI for requests. Prepended to request URIs */
  var base: String = js.native
  /** Is XHR2 supported by the browser? */
  var xhr2: Boolean = js.native
  /** Set XHR options before request */
  def before(callback: js.Function0[_]): Static = js.native
  /**
  		 * Perfoms an AJAX DELETE request
  		 * @param url URL that the request is sent to
  		 * @param data Data to send to the server
  		 * @param options Configuration options for the AJAX request
  		 * */
  def delete(url: String): Promise = js.native
  def delete(url: String, data: js.Any): Promise = js.native
  def delete(url: String, data: js.Any, options: Options): Promise = js.native
  /**
  		 * Perfoms an AJAX GET request
  		 * @param url URL that the request is sent to
  		 * @param data Data to send to the server
  		 * @param options Configuration options for the AJAX request
  		 * */
  def get(url: String): Promise = js.native
  def get(url: String, data: js.Any): Promise = js.native
  def get(url: String, data: js.Any, options: Options): Promise = js.native
  /** Sets the request limit */
  def limit(by: Double): Unit = js.native
  /**
  		 * Perfoms an AJAX POST request
  		 * @param url URL that the request is sent to
  		 * @param data Data to send to the server
  		 * @param options Configuration options for the AJAX request
  		 * */
  def post(url: String): Promise = js.native
  def post(url: String, data: js.Any): Promise = js.native
  def post(url: String, data: js.Any, options: Options): Promise = js.native
  /**
  		 * Perfoms an AJAX PUT request
  		 * @param url URL that the request is sent to
  		 * @param data Data to send to the server
  		 * @param options Configuration options for the AJAX request
  		 * */
  def put(url: String): Promise = js.native
  def put(url: String, data: js.Any): Promise = js.native
  def put(url: String, data: js.Any, options: Options): Promise = js.native
  /** Set default cross-domain response type for IE8/9 (defaults to 'json') */
  def setDefaultXdrResponseType(`type`: String): Unit = js.native
}

