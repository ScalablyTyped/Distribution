package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackCreateGet extends js.Object {
  /**
    * Provisions a new subaccount and an initial subaccount API key.
    *
    * @param subaccount The create options
    * @returns Promise The basic subaccount information results
    */
  def create(subaccount: sparkpostLib.sparkpostMod.SparkPostNs.CreateSubaccount): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[sparkpostLib.sparkpostMod.SparkPostNs.CreateSubaccountResponse] = js.native
  /**
    * Provisions a new subaccount and an initial subaccount API key.
    * @param subaccount The create options
    * @param callback The request callback with basic subaccount information results
    */
  def create(
    subaccount: sparkpostLib.sparkpostMod.SparkPostNs.CreateSubaccount,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[sparkpostLib.sparkpostMod.SparkPostNs.CreateSubaccountResponse]
  ): scala.Unit = js.native
  /**
    * Get details about a specified subaccount by its id
    *
    * @param id the id of the subaccount you want to look up
    * @returns Promise The subaccount information results
    */
  def get(id: java.lang.String): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[sparkpostLib.sparkpostMod.SparkPostNs.SubaccountInformation] = js.native
  /**
    * Get details about a specified subaccount by its id
    *
    * @param id the id of the subaccount you want to look up
    * @param callback The request callback with subaccount information results
    */
  def get(
    id: java.lang.String,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[sparkpostLib.sparkpostMod.SparkPostNs.SubaccountInformation]
  ): scala.Unit = js.native
  def get(id: scala.Double): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[sparkpostLib.sparkpostMod.SparkPostNs.SubaccountInformation] = js.native
  def get(
    id: scala.Double,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[sparkpostLib.sparkpostMod.SparkPostNs.SubaccountInformation]
  ): scala.Unit = js.native
  /**
    * Endpoint for retrieving a list of your subaccounts.
    * This endpoint only returns information about the subaccounts themselves, not the data associated with the subaccount.
    *
    * @returns Promise The subaccount information results array
    */
  def list(): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[js.Array[sparkpostLib.sparkpostMod.SparkPostNs.SubaccountInformation]] = js.native
  /**
    * Endpoint for retrieving a list of your subaccounts.
    * This endpoint only returns information about the subaccounts themselves, not the data associated with the subaccount.
    * @param callback The request callback with subaccount information results array
    */
  def list(
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[js.Array[sparkpostLib.sparkpostMod.SparkPostNs.SubaccountInformation]]
  ): scala.Unit = js.native
  /**
    * Update an existing subaccount’s information.
    *
    * @param id the id of the subaccount you want to update
    * @param subaccount an object of [updatable subaccount attributes]{@link https://developers.sparkpost.com/api/subaccounts#header-request-body-attributes-1}
    * @returns Promise The webhook id results
    */
  def update(id: java.lang.String, subaccount: sparkpostLib.sparkpostMod.SparkPostNs.UpdateSubaccount): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[Anon_Message] = js.native
  /**
    * Update an existing subaccount’s information.
    *
    * @param id the id of the subaccount you want to update
    * @param subaccount an object of [updatable subaccount attributes]{@link https://developers.sparkpost.com/api/subaccounts#header-request-body-attributes-1}
    * @param callback The request callback with webhook id results
    */
  def update(
    id: java.lang.String,
    subaccount: sparkpostLib.sparkpostMod.SparkPostNs.UpdateSubaccount,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[Anon_Message]
  ): scala.Unit = js.native
}

