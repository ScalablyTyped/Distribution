package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Log extends js.Object {
  /**
    * The URI of the JSON schema corresponding to the version.
    */
  @JSName("$schema")
  var $schema: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The set of runs contained in this log file.
    */
  var runs: js.Array[Run]
  /**
    * The SARIF format version of this log file.
    */
  var version: sarifLib.sarifMod.LogNs.version
}

