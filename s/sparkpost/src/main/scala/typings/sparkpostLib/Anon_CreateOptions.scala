package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CreateOptions extends js.Object {
  /**
           * Create a recipient list by providing a recipient list object as the POST request body.
           * At a minimum, the “recipients” array is required, which must contain a valid “address”.
           * If the recipient list “id” is not provided in the POST request body, one will be generated and returned in the results body.
           * Use the num_rcpt_errors parameter to limit the number of recipient errors returned.
           * @param options The create options
           * @returns Promise metadata results
           */
  def create(options: sparkpostLib.sparkpostMod.SparkPostNs.CreateRecipientList): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[sparkpostLib.sparkpostMod.SparkPostNs.RecipientListMetadata] = js.native
  /**
           * Create a recipient list by providing a recipient list object as the POST request body.
           * At a minimum, the “recipients” array is required, which must contain a valid “address”.
           * If the recipient list “id” is not provided in the POST request body, one will be generated and returned in the results body.
           * Use the num_rcpt_errors parameter to limit the number of recipient errors returned.
           * @param options The create options
           * @param callback The request callback with metadata results
           */
  def create(
    options: sparkpostLib.sparkpostMod.SparkPostNs.CreateRecipientList,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[sparkpostLib.sparkpostMod.SparkPostNs.RecipientListMetadata]
  ): scala.Unit = js.native
  /**
           * Permanently delete the specified recipient list.
           *
           * @param id The list id
           * @returns Promise void
           */
  def delete(id: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
           * Permanently delete the specified recipient list.
           *
           * @param id The list id
           * @param callback The request callback
           */
  def delete(id: java.lang.String, callback: sparkpostLib.sparkpostMod.SparkPostNs.Callback[scala.Unit]): scala.Unit = js.native
  /**
           * Retrieve details about a specified recipient list by specifying its id in the URI path.
           * To retrieve the recipients contained in a list, the show_recipients parameter must be set to true.
           *
           * @param [options] specifies whether to retrieve the recipients. Defaults to false
           */
  def get(id: java.lang.String): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[sparkpostLib.sparkpostMod.SparkPostNs.RecipientListWithRecipients] = js.native
  /**
           * Retrieve details about a specified recipient list by specifying its id in the URI path.
           * To retrieve the recipients contained in a list, the show_recipients parameter must be set to true.
           *
           */
  def get(
    id: java.lang.String,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.Callback[sparkpostLib.sparkpostMod.SparkPostNs.RecipientListWithRecipients]
  ): scala.Unit = js.native
  /**
           * Retrieve details about a specified recipient list by specifying its id in the URI path.
           * To retrieve the recipients contained in a list, the show_recipients parameter must be set to true.
           *
           * @param [options] specifies whether to retrieve the recipients. Defaults to false
           */
  def get(id: java.lang.String, options: Anon_Showrecipients): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[sparkpostLib.sparkpostMod.SparkPostNs.RecipientListWithRecipients] = js.native
  /**
           * Retrieve details about a specified recipient list by specifying its id in the URI path.
           * To retrieve the recipients contained in a list, the show_recipients parameter must be set to true.
           *
           * @param specifies whether to retrieve the recipients. Defaults to false
           */
  def get(
    id: java.lang.String,
    options: Anon_Showrecipients,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.Callback[sparkpostLib.sparkpostMod.SparkPostNs.RecipientListWithRecipients]
  ): scala.Unit = js.native
  /**
           * List a summary of all recipient lists. The recipients for each list are not included in the results.
           * To retrieve recipient details, use the [Retrieve a Recipient List endpoint]{@link https://developers.sparkpost.com/api/recipient-lists.html#recipient-lists-retrieve-get},
           * and specify the recipient list.
           *
           * @returns Promise The RecipientList results array
           */
  def list(): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[js.Array[sparkpostLib.sparkpostMod.SparkPostNs.RecipientList]] = js.native
  /**
           * List a summary of all recipient lists. The recipients for each list are not included in the results.
           * To retrieve recipient details, use the [Retrieve a Recipient List endpoint]{@link https://developers.sparkpost.com/api/recipient-lists.html#recipient-lists-retrieve-get},
           * and specify the recipient list.
           *
           * @param callback The request callback with RecipientList results array
           */
  def list(
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[js.Array[sparkpostLib.sparkpostMod.SparkPostNs.RecipientList]]
  ): scala.Unit = js.native
  /**
           * Update an existing recipient list by specifying its ID in the URI path and use a recipient list object as the PUT request body.
           * Use the num_rcpt_errors parameter to limit the number of recipient errors returned.
           *
           * @param id Identifier of the recipient list
           */
  def update(id: java.lang.String, options: sparkpostLib.sparkpostMod.SparkPostNs.UpdateRecipientList): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[sparkpostLib.sparkpostMod.SparkPostNs.RecipientListMetadata] = js.native
  /**
           * Update an existing recipient list by specifying its ID in the URI path and use a recipient list object as the PUT request body.
           * Use the num_rcpt_errors parameter to limit the number of recipient errors returned.
           *
           * @param id Identifier of the recipient list
           * @param options The update options
           * @param callback The request callback with metadata results
           */
  def update(
    id: java.lang.String,
    options: sparkpostLib.sparkpostMod.SparkPostNs.UpdateRecipientList,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[sparkpostLib.sparkpostMod.SparkPostNs.RecipientListMetadata]
  ): scala.Unit = js.native
}

