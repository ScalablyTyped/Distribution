package typings.restler.mod

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
  def del(url: String): RestlerResult = js.native
  def del(url: String, options: js.Object): RestlerResult = js.native
  /**
    * Create a GET request.
    * @param {string}          url     A url address.
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def get(url: String): RestlerResult = js.native
  def get(url: String, options: RestlerOptions): RestlerResult = js.native
  /**
    * Create a HEAD request.
    * @param {string}          url     A url address.
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def head(url: String): RestlerResult = js.native
  def head(url: String, options: RestlerOptions): RestlerResult = js.native
  /**
    * Send json data via GET method.
    * @param {string}          url     A url address.
    * @param {any}             data    JSON body
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def json(url: String): RestlerResult = js.native
  def json(url: String, data: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], method: String): RestlerResult = js.native
  def json(url: String, data: js.UndefOr[scala.Nothing], options: RestlerOptions): RestlerResult = js.native
  def json(url: String, data: js.UndefOr[scala.Nothing], options: RestlerOptions, method: String): RestlerResult = js.native
  def json(url: String, data: js.Any): RestlerResult = js.native
  def json(url: String, data: js.Any, options: js.UndefOr[scala.Nothing], method: String): RestlerResult = js.native
  def json(url: String, data: js.Any, options: RestlerOptions): RestlerResult = js.native
  def json(url: String, data: js.Any, options: RestlerOptions, method: String): RestlerResult = js.native
  /**
    * Create a PATCH request.
    * @param {string}          url     A url address.
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def patch(url: String): RestlerResult = js.native
  def patch(url: String, options: RestlerOptions): RestlerResult = js.native
  /**
    * Send json  data  via PATCH method.
    * @param {string}          url     A url address.
    * @param {any}             data    JSON body
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def patchJson(url: String): RestlerResult = js.native
  def patchJson(url: String, data: js.UndefOr[scala.Nothing], options: RestlerOptions): RestlerResult = js.native
  def patchJson(url: String, data: js.Any): RestlerResult = js.native
  def patchJson(url: String, data: js.Any, options: RestlerOptions): RestlerResult = js.native
  /**
    * Create a POST request.
    * @param {string}          url     A url address.
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def post(url: String): RestlerResult = js.native
  def post(url: String, options: RestlerOptions): RestlerResult = js.native
  /**
    * Send json data via POST method.
    * @param {string}          url     A url address.
    * @param {any}             data    JSON body
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def postJson(url: String): RestlerResult = js.native
  def postJson(url: String, data: js.UndefOr[scala.Nothing], options: RestlerOptions): RestlerResult = js.native
  def postJson(url: String, data: js.Any): RestlerResult = js.native
  def postJson(url: String, data: js.Any, options: RestlerOptions): RestlerResult = js.native
  /**
    * Create a PUT request.
    * @param {string}          url     A url address.
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def put(url: String): RestlerResult = js.native
  def put(url: String, options: RestlerOptions): RestlerResult = js.native
  /**
    * Send json data via PUT method.
    * @param {string}          url     A url address.
    * @param {any}             data    JSON body
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def putJson(url: String): RestlerResult = js.native
  def putJson(url: String, data: js.UndefOr[scala.Nothing], options: RestlerOptions): RestlerResult = js.native
  def putJson(url: String, data: js.Any): RestlerResult = js.native
  def putJson(url: String, data: js.Any, options: RestlerOptions): RestlerResult = js.native
  /**
    * Create a PUT request.
    * @param {string}          url     A url address.
    * @param {RestlerOptions}  options Options.
    * @return {RestlerResult}  Result.
    */
  def service(url: String): RestlerResult = js.native
  def service(url: String, options: RestlerOptions): RestlerResult = js.native
}

