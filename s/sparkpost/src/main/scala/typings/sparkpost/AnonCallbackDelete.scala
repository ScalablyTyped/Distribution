package typings.sparkpost

import typings.sparkpost.mod.Callback
import typings.sparkpost.mod.CreateSupressionListEntry
import typings.sparkpost.mod.ResultsCallback
import typings.sparkpost.mod.ResultsPromise
import typings.sparkpost.mod.SupressionListEntry
import typings.sparkpost.mod.SupressionSearchParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallbackDelete extends js.Object {
  /**
    * Delete a recipient from the list by specifying the recipient’s email address in the URI path.
    *
    * @param email Recipient email address
    * @returns void
    */
  def delete(email: String): js.Promise[Unit] = js.native
  /**
    * Delete a recipient from the list by specifying the recipient’s email address in the URI path.
    *
    * @param email Recipient email address
    */
  def delete(email: String, callback: Callback[Unit]): Unit = js.native
  /**
    * Retrieve an entry by recipient email.
    *
    * @param email address to check
    * @returns void
    */
  def get(email: String): ResultsPromise[js.Array[SupressionListEntry]] = js.native
  /**
    * Retrieve an entry by recipient email.
    *
    * @param email address to check
    * @returns void
    */
  def get(email: String, callback: ResultsCallback[js.Array[SupressionListEntry]]): Unit = js.native
  /**
    * List all entries in your suppression list, filtered by an optional set of search parameters.
    *
    * @param [parameters] an object of [search parameters]{@link https://developers.sparkpost.com/api/suppression-list#suppression-list-search-get}
    * @returns Promise The supression lists
    */
  def list(): ResultsPromise[js.Array[SupressionListEntry]] = js.native
  /**
    * List all entries in your suppression list, filtered by an optional set of search parameters.
    *
    * @param callback The request callback with supression lists.
    */
  def list(callback: ResultsCallback[js.Array[SupressionListEntry]]): Unit = js.native
  def list(parameters: SupressionSearchParameters): ResultsPromise[js.Array[SupressionListEntry]] = js.native
  /**
    * List all entries in your suppression list, filtered by an optional set of search parameters.
    *
    * @param parameters an object of [search parameters]{@link https://developers.sparkpost.com/api/suppression-list#suppression-list-search-get}
    * @param callback The request callback with supression lists.
    */
  def list(parameters: SupressionSearchParameters, callback: ResultsCallback[js.Array[SupressionListEntry]]): Unit = js.native
  def upsert(listEntries: js.Array[CreateSupressionListEntry]): ResultsPromise[AnonMessage] = js.native
  def upsert(listEntries: js.Array[CreateSupressionListEntry], callback: ResultsCallback[AnonMessage]): Unit = js.native
  /**
    * Insert or update one or many entries.
    *
    * @param listEntries The suppression entry list
    */
  def upsert(listEntries: CreateSupressionListEntry): ResultsPromise[AnonMessage] = js.native
  /**
    * Insert or update one or many entries.
    *
    * @param listEntries The suppression entry list
    * @param callback The request callback
    */
  def upsert(listEntries: CreateSupressionListEntry, callback: ResultsCallback[AnonMessage]): Unit = js.native
}

