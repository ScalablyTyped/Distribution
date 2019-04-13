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
  def create(subaccount: sparkpostLib.sparkpostMod.CreateSubaccount): sparkpostLib.sparkpostMod.ResultsPromise[sparkpostLib.sparkpostMod.CreateSubaccountResponse] = js.native
  /**
    * Provisions a new subaccount and an initial subaccount API key.
    * @param subaccount The create options
    * @param callback The request callback with basic subaccount information results
    */
  def create(
    subaccount: sparkpostLib.sparkpostMod.CreateSubaccount,
    callback: sparkpostLib.sparkpostMod.ResultsCallback[sparkpostLib.sparkpostMod.CreateSubaccountResponse]
  ): scala.Unit = js.native
  /**
    * Get details about a specified subaccount by its id
    *
    * @param id the id of the subaccount you want to look up
    * @returns Promise The subaccount information results
    */
  def get(id: java.lang.String): sparkpostLib.sparkpostMod.ResultsPromise[sparkpostLib.sparkpostMod.SubaccountInformation] = js.native
  /**
    * Get details about a specified subaccount by its id
    *
    * @param id the id of the subaccount you want to look up
    * @param callback The request callback with subaccount information results
    */
  def get(
    id: java.lang.String,
    callback: sparkpostLib.sparkpostMod.ResultsCallback[sparkpostLib.sparkpostMod.SubaccountInformation]
  ): scala.Unit = js.native
  def get(id: scala.Double): sparkpostLib.sparkpostMod.ResultsPromise[sparkpostLib.sparkpostMod.SubaccountInformation] = js.native
  def get(
    id: scala.Double,
    callback: sparkpostLib.sparkpostMod.ResultsCallback[sparkpostLib.sparkpostMod.SubaccountInformation]
  ): scala.Unit = js.native
  /**
    * Endpoint for retrieving a list of your subaccounts.
    * This endpoint only returns information about the subaccounts themselves, not the data associated with the subaccount.
    *
    * @returns Promise The subaccount information results array
    */
  def list(): sparkpostLib.sparkpostMod.ResultsPromise[js.Array[sparkpostLib.sparkpostMod.SubaccountInformation]] = js.native
  /**
    * Endpoint for retrieving a list of your subaccounts.
    * This endpoint only returns information about the subaccounts themselves, not the data associated with the subaccount.
    * @param callback The request callback with subaccount information results array
    */
  def list(
    callback: sparkpostLib.sparkpostMod.ResultsCallback[js.Array[sparkpostLib.sparkpostMod.SubaccountInformation]]
  ): scala.Unit = js.native
  /**
    * Update an existing subaccount’s information.
    *
    * @param id the id of the subaccount you want to update
    * @param subaccount an object of [updatable subaccount attributes]{@link https://developers.sparkpost.com/api/subaccounts#header-request-body-attributes-1}
    * @returns Promise The webhook id results
    */
  def update(id: java.lang.String, subaccount: sparkpostLib.sparkpostMod.UpdateSubaccount): sparkpostLib.sparkpostMod.ResultsPromise[Anon_Message] = js.native
  /**
    * Update an existing subaccount’s information.
    *
    * @param id the id of the subaccount you want to update
    * @param subaccount an object of [updatable subaccount attributes]{@link https://developers.sparkpost.com/api/subaccounts#header-request-body-attributes-1}
    * @param callback The request callback with webhook id results
    */
  def update(
    id: java.lang.String,
    subaccount: sparkpostLib.sparkpostMod.UpdateSubaccount,
    callback: sparkpostLib.sparkpostMod.ResultsCallback[Anon_Message]
  ): scala.Unit = js.native
}

