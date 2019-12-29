package typings.sarif.sarifMod

import typings.sarif.sarifMod.Log.version
import typings.sarif.sarifStrings.`2Dot1Dot0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Log extends js.Object {
  /**
    * The URI of the JSON schema corresponding to the version.
    */
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.native
  /**
    * References to external property files that share data between runs.
    */
  var inlineExternalProperties: js.UndefOr[js.Array[ExternalProperties]] = js.native
  /**
    * Key/value pairs that provide additional information about the log file.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * The set of runs contained in this log file.
    */
  var runs: js.Array[Run] = js.native
  /**
    * The SARIF format version of this log file.
    */
  var version: version = js.native
}

@JSImport("sarif", "Log")
@js.native
object Log extends js.Object {
  type version = `2Dot1Dot0`
}

