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
    * References to external property files that share data between runs.
    */
  var inlineExternalPropertyFiles: js.UndefOr[js.Array[ExternalPropertyFile]] = js.undefined
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
  var version: sarifLib.sarifMod.LogNs.version
}

object Log {
  @scala.inline
  def apply(
    runs: js.Array[Run],
    version: sarifLib.sarifMod.LogNs.version,
    $schema: java.lang.String = null,
    inlineExternalPropertyFiles: js.Array[ExternalPropertyFile] = null,
    properties: PropertyBag = null
  ): Log = {
    val __obj = js.Dynamic.literal(runs = runs, version = version)
    if ($schema != null) __obj.updateDynamic("$schema")($schema)
    if (inlineExternalPropertyFiles != null) __obj.updateDynamic("inlineExternalPropertyFiles")(inlineExternalPropertyFiles)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Log]
  }
}

