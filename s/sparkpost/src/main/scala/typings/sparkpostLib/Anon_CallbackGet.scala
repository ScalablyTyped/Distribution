package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackGet extends js.Object {
  /**
    * Retrieve the details about a transmission by its ID
    *
    * @param id The id of the transmission you want to look up
    * @returns The Transmission results
    */
  def get(id: java.lang.String): sparkpostLib.sparkpostMod.ResultsPromise[sparkpostLib.sparkpostMod.Transmission] = js.native
  /**
    * Retrieve the details about a transmission by its ID
    *
    * @param id The id of the transmission you want to look up
    * @param callback The request callback with Transmission results
    */
  def get(
    transmissionID: java.lang.String,
    callback: sparkpostLib.sparkpostMod.ResultsCallback[sparkpostLib.sparkpostMod.Transmission]
  ): scala.Unit = js.native
  /**
    * List an overview of all transmissions in the account
    *
    * @returns The Transmission results array
    */
  def list(): sparkpostLib.sparkpostMod.ResultsPromise[js.Array[sparkpostLib.sparkpostMod.TransmissionSummary]] = js.native
  /**
    * List an overview of all transmissions in the account
    *
    * @param callback The request callback with Transmission results array
    */
  def list(
    callback: sparkpostLib.sparkpostMod.ResultsCallback[js.Array[sparkpostLib.sparkpostMod.TransmissionSummary]]
  ): scala.Unit = js.native
  def list(options: Anon_Campaignid): sparkpostLib.sparkpostMod.ResultsPromise[js.Array[sparkpostLib.sparkpostMod.TransmissionSummary]] = js.native
  /**
    * List an overview of all transmissions in the account
    *
    * @param callback The request callback with Transmission results array
    */
  def list(
    options: Anon_Campaignid,
    callback: sparkpostLib.sparkpostMod.ResultsCallback[js.Array[sparkpostLib.sparkpostMod.TransmissionSummary]]
  ): scala.Unit = js.native
  /**
    * Sends a message by creating a new transmission
    *
    * @param transmission an object of [transmission attributes]{@link https://developers.sparkpost.com/api/transmissions#header-transmission-attributes}
    * @param [options] specify maximum number of recipient errors returned
    * @returns The metadata and id results
    */
  def send(transmission: sparkpostLib.sparkpostMod.CreateTransmission): sparkpostLib.sparkpostMod.ResultsPromise[Anon_IdTotalacceptedrecipients] = js.native
  /**
    *
    *
    * @param transmission an object of [transmission attributes]{@link https://developers.sparkpost.com/api/transmissions#header-transmission-attributes}
    * @param callback The request callback with metadata and id results
    */
  def send(
    transmission: sparkpostLib.sparkpostMod.CreateTransmission,
    callback: sparkpostLib.sparkpostMod.ResultsCallback[Anon_IdTotalacceptedrecipients]
  ): scala.Unit = js.native
  def send(transmission: sparkpostLib.sparkpostMod.CreateTransmission, options: Anon_Numrcpterrors): sparkpostLib.sparkpostMod.ResultsPromise[Anon_IdTotalacceptedrecipients] = js.native
  /**
    * Sends a message by creating a new transmission
    *
    * @param transmission an object of [transmission attributes]{@link https://developers.sparkpost.com/api/transmissions#header-transmission-attributes}
    * @param options The create options. Specify maximum number of recipient errors returned
    * @param callback The request callback with metadata and id results
    */
  def send(
    transmission: sparkpostLib.sparkpostMod.CreateTransmission,
    options: Anon_Numrcpterrors,
    callback: sparkpostLib.sparkpostMod.ResultsCallback[Anon_IdTotalacceptedrecipients]
  ): scala.Unit = js.native
}

