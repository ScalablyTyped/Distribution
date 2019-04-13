package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  /**
    * Create an inbound domain by providing an inbound domains object as the POST request body.
    * @param createOpts a hash of [inbound domain attributes]{@link https://developers.sparkpost.com/api/inbound-domains#header-inbound-domains-attributes}
    * @returns Promise void
    */
  def create(createOpts: sparkpostLib.sparkpostMod.CreateOpts): js.Promise[scala.Unit] = js.native
  /**
    * Create an inbound domain by providing an inbound domains object as the POST request body.
    * @param createOpts a hash of [inbound domain attributes]{@link https://developers.sparkpost.com/api/inbound-domains#header-inbound-domains-attributes}
    * @param callback The request callback
    */
  def create(
    createOpts: sparkpostLib.sparkpostMod.CreateOpts,
    callback: sparkpostLib.sparkpostMod.Callback[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Delete an inbound domain by specifying its domain name in the URI path.
    * @param domain Domain name
    * @returns Promise void
    */
  def delete(domain: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Delete an inbound domain by specifying its domain name in the URI path.
    * @param domain Domain name
    * @param callback The request callback
    */
  def delete(domain: java.lang.String, callback: sparkpostLib.sparkpostMod.Callback[scala.Unit]): scala.Unit = js.native
  /**
    * Retrieve an inbound domain by specifying its domain name in the URI path.
    * @param domain Domain name
    * @returns Promise The Domain results
    */
  def get(domain: java.lang.String): sparkpostLib.sparkpostMod.ResultsPromise[sparkpostLib.sparkpostMod.Domain] = js.native
  /**
    * Retrieve an inbound domain by specifying its domain name in the URI path.
    * @param domain Domain name
    * @param callback The request callback with Domain results
    */
  def get(
    domain: java.lang.String,
    callback: sparkpostLib.sparkpostMod.ResultsCallback[sparkpostLib.sparkpostMod.Domain]
  ): scala.Unit = js.native
  /**
    * List all your inbound domains.
    * @returns Promise The Domain results array
    */
  def list(): sparkpostLib.sparkpostMod.ResultsPromise[js.Array[sparkpostLib.sparkpostMod.Domain]] = js.native
  /**
    * List all your inbound domains.
    * @param callback The request callback with Domain results array
    */
  def list(callback: sparkpostLib.sparkpostMod.ResultsCallback[js.Array[sparkpostLib.sparkpostMod.Domain]]): scala.Unit = js.native
}

