package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Verify extends js.Object {
  /**
    * Create a sending domain by providing a sending domain object as the POST request body.
    *
    * @param options The create options
    * @returns Promise The basic info results
    */
  def create(options: sparkpostLib.sparkpostMod.SparkPostNs.CreateSendingDomain): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[Anon_Domain] = js.native
  /**
    * Create a sending domain by providing a sending domain object as the POST request body.
    * @param options The create options
    * @param callback The request callback with basic info results
    */
  def create(
    options: sparkpostLib.sparkpostMod.SparkPostNs.CreateSendingDomain,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[Anon_Domain]
  ): scala.Unit = js.native
  /**
    * Delete an existing sending domain.
    *
    * @param domain The domain
    * @returns Promise void
    */
  def delete(domain: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Delete an existing sending domain.
    * @param domain The domain
    * @param callback The request callback
    */
  def delete(domain: java.lang.String, callback: sparkpostLib.sparkpostMod.SparkPostNs.Callback[scala.Unit]): scala.Unit = js.native
  /**
    * Retrieve a sending domain by specifying its domain name in the URI path. The response includes details about its DKIM key configuration.
    *
    * @param domain The domain
    * @returns Promise The SendingDomain results
    */
  def get(domain: java.lang.String): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[sparkpostLib.sparkpostMod.SparkPostNs.SendingDomain] = js.native
  /**
    * Retrieve a sending domain by specifying its domain name in the URI path. The response includes details about its DKIM key configuration.
    * @param domain The domain
    * @param callback The request callback with SendingDomain results
    */
  def get(
    domain: java.lang.String,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[sparkpostLib.sparkpostMod.SparkPostNs.SendingDomain]
  ): scala.Unit = js.native
  /**
    * List an overview of all sending domains in the system.
    *
    * @returns The SendingDomain results array
    */
  def list(): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[js.Array[sparkpostLib.sparkpostMod.SparkPostNs.SendingDomain]] = js.native
  /**
    * List an overview of all sending domains in the system.
    * @param callback The request callback with SendingDomain results array
    */
  def list(
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[js.Array[sparkpostLib.sparkpostMod.SparkPostNs.SendingDomain]]
  ): scala.Unit = js.native
  /**
    * Update the attributes of an existing sending domain by specifying its domain name in the URI path and use a sending domain object as the PUT request body.
    *
    * @param domain The domain
    * @param updateOpts The update options
    * @returns Promise The basic info results
    */
  def update(domain: java.lang.String, updateOpts: sparkpostLib.sparkpostMod.SparkPostNs.UpdateSendingDomain): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[Anon_Domain] = js.native
  /**
    * Update the attributes of an existing sending domain by specifying its domain name in the URI path and use a sending domain object as the PUT request body.
    * @param domain The domain
    * @param updateOpts The update options
    * @param callback The request callback with basic info results
    */
  def update(
    domain: java.lang.String,
    updateOpts: sparkpostLib.sparkpostMod.SparkPostNs.UpdateSendingDomain,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[Anon_Domain]
  ): scala.Unit = js.native
  /**
    * Verify a Sending Domain
    *
    * @param domain The domain
    * @param options a hash of [verify attributes]{@link https://developers.sparkpost.com/api/sending-domains#header-verify-attributes}
    * @returns Promise The verify results
    */
  def verify(domain: java.lang.String, options: sparkpostLib.sparkpostMod.SparkPostNs.VerifyOptions): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[sparkpostLib.sparkpostMod.SparkPostNs.VerifyResults] = js.native
  /**
    * Verify a Sending Domain
    * @param domain The domain
    * @param options a hash of [verify attributes]{@link https://developers.sparkpost.com/api/sending-domains#header-verify-attributes}
    * @param callback The request callback with verify results
    */
  def verify(
    domain: java.lang.String,
    options: sparkpostLib.sparkpostMod.SparkPostNs.VerifyOptions,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[sparkpostLib.sparkpostMod.SparkPostNs.VerifyResults]
  ): scala.Unit = js.native
}

