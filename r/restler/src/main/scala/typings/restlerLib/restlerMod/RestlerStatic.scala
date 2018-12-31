package typings
package restlerLib.restlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for resler class.
  * @interface
  */
@js.native
trait RestlerStatic extends js.Object {
  /**
    * Create a DELETE request.
    * @param {string}          url     A url address.
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def del(url: java.lang.String): RestlerResult = js.native
  def del(url: java.lang.String, options: js.Object): RestlerResult = js.native
  /**
    * Create a GET request.
    * @param {string}          url     A url address.
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def get(url: java.lang.String): RestlerResult = js.native
  def get(url: java.lang.String, options: RestlerOptions): RestlerResult = js.native
  /**
    * Create a HEAD request.
    * @param {string}          url     A url address.
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def head(url: java.lang.String): RestlerResult = js.native
  def head(url: java.lang.String, options: RestlerOptions): RestlerResult = js.native
  /**
    * Send json data via GET method.
    * @param {string}          url     A url address.
    * @param {any}             data    JSON body
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def json(url: java.lang.String): RestlerResult = js.native
  def json(url: java.lang.String, data: js.Any): RestlerResult = js.native
  def json(url: java.lang.String, data: js.Any, options: RestlerOptions): RestlerResult = js.native
  def json(url: java.lang.String, data: js.Any, options: RestlerOptions, method: java.lang.String): RestlerResult = js.native
  /**
    * Create a PATCH request.
    * @param {string}          url     A url address.
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def patch(url: java.lang.String): RestlerResult = js.native
  def patch(url: java.lang.String, options: RestlerOptions): RestlerResult = js.native
  /**
    * Send json  data  via PATCH method.
    * @param {string}          url     A url address.
    * @param {any}             data    JSON body
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def patchJson(url: java.lang.String): RestlerResult = js.native
  def patchJson(url: java.lang.String, data: js.Any): RestlerResult = js.native
  def patchJson(url: java.lang.String, data: js.Any, options: RestlerOptions): RestlerResult = js.native
  /**
    * Create a POST request.
    * @param {string}          url     A url address.
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def post(url: java.lang.String): RestlerResult = js.native
  def post(url: java.lang.String, options: RestlerOptions): RestlerResult = js.native
  /**
    * Send json data via POST method.
    * @param {string}          url     A url address.
    * @param {any}             data    JSON body
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def postJson(url: java.lang.String): RestlerResult = js.native
  def postJson(url: java.lang.String, data: js.Any): RestlerResult = js.native
  def postJson(url: java.lang.String, data: js.Any, options: RestlerOptions): RestlerResult = js.native
  /**
    * Create a PUT request.
    * @param {string}          url     A url address.
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def put(url: java.lang.String): RestlerResult = js.native
  def put(url: java.lang.String, options: RestlerOptions): RestlerResult = js.native
  /**
    * Send json data via PUT method.
    * @param {string}          url     A url address.
    * @param {any}             data    JSON body
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def putJson(url: java.lang.String): RestlerResult = js.native
  def putJson(url: java.lang.String, data: js.Any): RestlerResult = js.native
  def putJson(url: java.lang.String, data: js.Any, options: RestlerOptions): RestlerResult = js.native
  /**
    * Create a PUT request.
    * @param {string}          url     A url address.
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def service(url: java.lang.String): RestlerResult = js.native
  def service(url: java.lang.String, options: RestlerOptions): RestlerResult = js.native
}

