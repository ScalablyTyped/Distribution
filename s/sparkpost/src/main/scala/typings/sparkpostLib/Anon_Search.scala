package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Search extends js.Object {
  /**
           * Retrieves list of message events according to given params
           * @param parameters Query parameters
           * @returns Promise The MessageEvent results array
           */
  def search(parameters: sparkpostLib.sparkpostMod.SparkPostNs.MessageEventParameters): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[js.Array[sparkpostLib.sparkpostMod.SparkPostNs.MessageEvent]] = js.native
  /**
           * Retrieves list of message events according to given params
           * @param parameters Query parameters
           * @param callback The request callback with MessageEvent results array
           */
  def search(
    parameters: sparkpostLib.sparkpostMod.SparkPostNs.MessageEventParameters,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[js.Array[sparkpostLib.sparkpostMod.SparkPostNs.MessageEvent]]
  ): scala.Unit = js.native
}

