package typings.sparkpost

import typings.sparkpost.sparkpostMod.MessageEvent
import typings.sparkpost.sparkpostMod.MessageEventParameters
import typings.sparkpost.sparkpostMod.ResultsCallback
import typings.sparkpost.sparkpostMod.ResultsPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackParameters extends js.Object {
  /**
    * Retrieves list of message events according to given params
    * @param parameters Query parameters
    * @returns Promise The MessageEvent results array
    */
  def search(parameters: MessageEventParameters): ResultsPromise[js.Array[MessageEvent]] = js.native
  /**
    * Retrieves list of message events according to given params
    * @param parameters Query parameters
    * @param callback The request callback with MessageEvent results array
    */
  def search(parameters: MessageEventParameters, callback: ResultsCallback[js.Array[MessageEvent]]): Unit = js.native
}

