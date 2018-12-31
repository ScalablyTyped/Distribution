package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetEmail extends js.Object {
  /**
    * Delete a recipient from the list by specifying the recipient’s email address in the URI path.
    *
    * @param email Recipient email address
    * @returns void
    */
  def delete(email: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Delete a recipient from the list by specifying the recipient’s email address in the URI path.
    *
    * @param email Recipient email address
    */
  def delete(email: java.lang.String, callback: sparkpostLib.sparkpostMod.SparkPostNs.Callback[scala.Unit]): scala.Unit = js.native
  /**
    * Retrieve an entry by recipient email.
    *
    * @param email address to check
    * @returns void
    */
  def get(email: java.lang.String): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[js.Array[sparkpostLib.sparkpostMod.SparkPostNs.SupressionListEntry]] = js.native
  /**
    * Retrieve an entry by recipient email.
    *
    * @param email address to check
    * @returns void
    */
  def get(
    email: java.lang.String,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[js.Array[sparkpostLib.sparkpostMod.SparkPostNs.SupressionListEntry]]
  ): scala.Unit = js.native
  /**
    * List all entries in your suppression list, filtered by an optional set of search parameters.
    *
    * @param [parameters] an object of [search parameters]{@link https://developers.sparkpost.com/api/suppression-list#suppression-list-search-get}
    * @returns Promise The supression lists
    */
  def list(): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[js.Array[sparkpostLib.sparkpostMod.SparkPostNs.SupressionListEntry]] = js.native
  /**
    * List all entries in your suppression list, filtered by an optional set of search parameters.
    *
    * @param callback The request callback with supression lists.
    */
  def list(
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[js.Array[sparkpostLib.sparkpostMod.SparkPostNs.SupressionListEntry]]
  ): scala.Unit = js.native
  def list(parameters: sparkpostLib.sparkpostMod.SparkPostNs.SupressionSearchParameters): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[js.Array[sparkpostLib.sparkpostMod.SparkPostNs.SupressionListEntry]] = js.native
  /**
    * List all entries in your suppression list, filtered by an optional set of search parameters.
    *
    * @param parameters an object of [search parameters]{@link https://developers.sparkpost.com/api/suppression-list#suppression-list-search-get}
    * @param callback The request callback with supression lists.
    */
  def list(
    parameters: sparkpostLib.sparkpostMod.SparkPostNs.SupressionSearchParameters,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[js.Array[sparkpostLib.sparkpostMod.SparkPostNs.SupressionListEntry]]
  ): scala.Unit = js.native
  def upsert(listEntries: js.Array[sparkpostLib.sparkpostMod.SparkPostNs.CreateSupressionListEntry]): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[Anon_MessageString] = js.native
  def upsert(
    listEntries: js.Array[sparkpostLib.sparkpostMod.SparkPostNs.CreateSupressionListEntry],
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[Anon_MessageString]
  ): scala.Unit = js.native
  /**
    * Insert or update one or many entries.
    *
    * @param listEntries The suppression entry list
    */
  def upsert(listEntries: sparkpostLib.sparkpostMod.SparkPostNs.CreateSupressionListEntry): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[Anon_MessageString] = js.native
  /**
    * Insert or update one or many entries.
    *
    * @param listEntries The suppression entry list
    * @param callback The request callback
    */
  def upsert(
    listEntries: sparkpostLib.sparkpostMod.SparkPostNs.CreateSupressionListEntry,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[Anon_MessageString]
  ): scala.Unit = js.native
}

