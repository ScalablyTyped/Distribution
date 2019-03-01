package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalPropertyFiles extends js.Object {
  /**
    * An array of external property files containing run.artifacts arrays to be merged with the root log file.
    */
  var artifacts: js.UndefOr[js.Array[ExternalPropertyFile]] = js.undefined
  /**
    * An external property file containing a run.conversion object to be merged with the root log file.
    */
  var conversion: js.UndefOr[ExternalPropertyFile] = js.undefined
  /**
    * An external property file containing a run.properties object to be merged with the root log file.
    */
  var externalizedProperties: js.UndefOr[ExternalPropertyFile] = js.undefined
  /**
    * An external property file containing a run.graphs object to be merged with the root log file.
    */
  var graphs: js.UndefOr[ExternalPropertyFile] = js.undefined
  /**
    * An array of external property files containing run.invocations arrays to be merged with the root log file.
    */
  var invocations: js.UndefOr[js.Array[ExternalPropertyFile]] = js.undefined
  /**
    * An array of external property files containing run.logicalLocations arrays to be merged with the root log file.
    */
  var logicalLocations: js.UndefOr[js.Array[ExternalPropertyFile]] = js.undefined
  /**
    * An array of external property files containing run.results arrays to be merged with the root log file.
    */
  var results: js.UndefOr[js.Array[ExternalPropertyFile]] = js.undefined
  /**
    * An external property file containing a run.tool object to be merged with the root log file.
    */
  var tool: js.UndefOr[ExternalPropertyFile] = js.undefined
}

object ExternalPropertyFiles {
  @scala.inline
  def apply(
    artifacts: js.Array[ExternalPropertyFile] = null,
    conversion: ExternalPropertyFile = null,
    externalizedProperties: ExternalPropertyFile = null,
    graphs: ExternalPropertyFile = null,
    invocations: js.Array[ExternalPropertyFile] = null,
    logicalLocations: js.Array[ExternalPropertyFile] = null,
    results: js.Array[ExternalPropertyFile] = null,
    tool: ExternalPropertyFile = null
  ): ExternalPropertyFiles = {
    val __obj = js.Dynamic.literal()
    if (artifacts != null) __obj.updateDynamic("artifacts")(artifacts)
    if (conversion != null) __obj.updateDynamic("conversion")(conversion)
    if (externalizedProperties != null) __obj.updateDynamic("externalizedProperties")(externalizedProperties)
    if (graphs != null) __obj.updateDynamic("graphs")(graphs)
    if (invocations != null) __obj.updateDynamic("invocations")(invocations)
    if (logicalLocations != null) __obj.updateDynamic("logicalLocations")(logicalLocations)
    if (results != null) __obj.updateDynamic("results")(results)
    if (tool != null) __obj.updateDynamic("tool")(tool)
    __obj.asInstanceOf[ExternalPropertyFiles]
  }
}

