package typings.sarif.sarifMod

import typings.sarif.sarifMod.Log.version
import typings.sarif.sarifStrings.`2DOT1DOT0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Log extends js.Object {
  /**
    * The URI of the JSON schema corresponding to the version.
    */
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.undefined
  /**
    * References to external property files that share data between runs.
    */
  var inlineExternalProperties: js.UndefOr[js.Array[ExternalProperties]] = js.undefined
  /**
    * Key/value pairs that provide additional information about the log file.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The set of runs contained in this log file.
    */
  var runs: js.Array[Run]
  /**
    * The SARIF format version of this log file.
    */
  var version: version
}

@JSImport("sarif", "Log")
@js.native
object Log extends js.Object {
  type version = `2DOT1DOT0`
}

