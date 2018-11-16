package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetDomain extends js.Object {
  /**
           * Create an inbound domain by providing an inbound domains object as the POST request body.
           * @param createOpts a hash of [inbound domain attributes]{@link https://developers.sparkpost.com/api/inbound-domains#header-inbound-domains-attributes}
           * @returns Promise void
           */
  def create(createOpts: sparkpostLib.sparkpostMod.SparkPostNs.CreateOpts): stdLib.Promise[scala.Unit] = js.native
  /**
           * Create an inbound domain by providing an inbound domains object as the POST request body.
           * @param createOpts a hash of [inbound domain attributes]{@link https://developers.sparkpost.com/api/inbound-domains#header-inbound-domains-attributes}
           * @param callback The request callback
           */
  def create(
    createOpts: sparkpostLib.sparkpostMod.SparkPostNs.CreateOpts,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.Callback[scala.Unit]
  ): scala.Unit = js.native
  /**
           * Delete an inbound domain by specifying its domain name in the URI path.
           * @param domain Domain name
           * @returns Promise void
           */
  def delete(domain: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
           * Delete an inbound domain by specifying its domain name in the URI path.
           * @param domain Domain name
           * @param callback The request callback
           */
  def delete(domain: java.lang.String, callback: sparkpostLib.sparkpostMod.SparkPostNs.Callback[scala.Unit]): scala.Unit = js.native
  /**
           * Retrieve an inbound domain by specifying its domain name in the URI path.
           * @param domain Domain name
           * @returns Promise The Domain results
           */
  def get(domain: java.lang.String): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[sparkpostLib.sparkpostMod.SparkPostNs.Domain] = js.native
  /**
           * Retrieve an inbound domain by specifying its domain name in the URI path.
           * @param domain Domain name
           * @param callback The request callback with Domain results
           */
  def get(
    domain: java.lang.String,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[sparkpostLib.sparkpostMod.SparkPostNs.Domain]
  ): scala.Unit = js.native
  /**
           * List all your inbound domains.
           * @returns Promise The Domain results array
           */
  def list(): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[js.Array[sparkpostLib.sparkpostMod.SparkPostNs.Domain]] = js.native
  /**
           * List all your inbound domains.
           * @param callback The request callback with Domain results array
           */
  def list(
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[js.Array[sparkpostLib.sparkpostMod.SparkPostNs.Domain]]
  ): scala.Unit = js.native
}

