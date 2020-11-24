package typings.sparkpost.anon

import typings.sparkpost.mod.CreateSubaccount
import typings.sparkpost.mod.CreateSubaccountResponse
import typings.sparkpost.mod.ResultsCallback
import typings.sparkpost.mod.ResultsPromise
import typings.sparkpost.mod.SubaccountInformation
import typings.sparkpost.mod.UpdateSubaccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Update extends js.Object {
  
  /**
    * Provisions a new subaccount and an initial subaccount API key.
    *
    * @param subaccount The create options
    * @returns Promise The basic subaccount information results
    */
  def create(subaccount: CreateSubaccount): ResultsPromise[CreateSubaccountResponse] = js.native
  /**
    * Provisions a new subaccount and an initial subaccount API key.
    * @param subaccount The create options
    * @param callback The request callback with basic subaccount information results
    */
  def create(subaccount: CreateSubaccount, callback: ResultsCallback[CreateSubaccountResponse]): Unit = js.native
  
  /**
    * Get details about a specified subaccount by its id
    *
    * @param id the id of the subaccount you want to look up
    * @returns Promise The subaccount information results
    */
  def get(id: String): ResultsPromise[SubaccountInformation] = js.native
  /**
    * Get details about a specified subaccount by its id
    *
    * @param id the id of the subaccount you want to look up
    * @param callback The request callback with subaccount information results
    */
  def get(id: String, callback: ResultsCallback[SubaccountInformation]): Unit = js.native
  def get(id: Double): ResultsPromise[SubaccountInformation] = js.native
  def get(id: Double, callback: ResultsCallback[SubaccountInformation]): Unit = js.native
  
  /**
    * Endpoint for retrieving a list of your subaccounts.
    * This endpoint only returns information about the subaccounts themselves, not the data associated with the subaccount.
    *
    * @returns Promise The subaccount information results array
    */
  def list(): ResultsPromise[js.Array[SubaccountInformation]] = js.native
  /**
    * Endpoint for retrieving a list of your subaccounts.
    * This endpoint only returns information about the subaccounts themselves, not the data associated with the subaccount.
    * @param callback The request callback with subaccount information results array
    */
  def list(callback: ResultsCallback[js.Array[SubaccountInformation]]): Unit = js.native
  
  /**
    * Update an existing subaccount’s information.
    *
    * @param id the id of the subaccount you want to update
    * @param subaccount an object of [updatable subaccount attributes]{@link https://developers.sparkpost.com/api/subaccounts#header-request-body-attributes-1}
    * @returns Promise The webhook id results
    */
  def update(id: String, subaccount: UpdateSubaccount): ResultsPromise[Message] = js.native
  /**
    * Update an existing subaccount’s information.
    *
    * @param id the id of the subaccount you want to update
    * @param subaccount an object of [updatable subaccount attributes]{@link https://developers.sparkpost.com/api/subaccounts#header-request-body-attributes-1}
    * @param callback The request callback with webhook id results
    */
  def update(id: String, subaccount: UpdateSubaccount, callback: ResultsCallback[Message]): Unit = js.native
}
