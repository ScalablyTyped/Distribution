package typings
package sparkpostLib

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
  def search(parameters: sparkpostLib.sparkpostMod.MessageEventParameters): sparkpostLib.sparkpostMod.ResultsPromise[js.Array[sparkpostLib.sparkpostMod.MessageEvent]] = js.native
  /**
    * Retrieves list of message events according to given params
    * @param parameters Query parameters
    * @param callback The request callback with MessageEvent results array
    */
  def search(
    parameters: sparkpostLib.sparkpostMod.MessageEventParameters,
    callback: sparkpostLib.sparkpostMod.ResultsCallback[js.Array[sparkpostLib.sparkpostMod.MessageEvent]]
  ): scala.Unit = js.native
}

