package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalPropertyFileReferences extends js.Object {
  /**
    * An array of external property files containing run.addresses arrays to be merged with the root log file.
    */
  var addresses: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.undefined
  /**
    * An array of external property files containing run.artifacts arrays to be merged with the root log file.
    */
  var artifacts: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.undefined
  /**
    * An external property file containing a run.conversion object to be merged with the root log file.
    */
  var conversion: js.UndefOr[ExternalPropertyFileReference] = js.undefined
  /**
    * An external property file containing a run.driver object to be merged with the root log file.
    */
  var driver: js.UndefOr[ExternalPropertyFileReference] = js.undefined
  /**
    * An array of external property files containing run.extensions arrays to be merged with the root log file.
    */
  var extensions: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.undefined
  /**
    * An external property file containing a run.properties object to be merged with the root log file.
    */
  var externalizedProperties: js.UndefOr[ExternalPropertyFileReference] = js.undefined
  /**
    * An array of external property files containing a run.graphs object to be merged with the root log file.
    */
  var graphs: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.undefined
  /**
    * An array of external property files containing run.invocations arrays to be merged with the root log file.
    */
  var invocations: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.undefined
  /**
    * An array of external property files containing run.logicalLocations arrays to be merged with the root log file.
    */
  var logicalLocations: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.undefined
  /**
    * An array of external property files containing run.policies arrays to be merged with the root log file.
    */
  var policies: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.undefined
  /**
    * Key/value pairs that provide additional information about the external property files.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * An array of external property files containing run.results arrays to be merged with the root log file.
    */
  var results: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.undefined
  /**
    * An array of external property files containing run.taxonomies arrays to be merged with the root log file.
    */
  var taxonomies: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.undefined
  /**
    * An array of external property files containing run.threadFlowLocations arrays to be merged with the root log
    * file.
    */
  var threadFlowLocations: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.undefined
  /**
    * An array of external property files containing run.translations arrays to be merged with the root log file.
    */
  var translations: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.undefined
}

object ExternalPropertyFileReferences {
  @scala.inline
  def apply(
    addresses: js.Array[ExternalPropertyFileReference] = null,
    artifacts: js.Array[ExternalPropertyFileReference] = null,
    conversion: ExternalPropertyFileReference = null,
    driver: ExternalPropertyFileReference = null,
    extensions: js.Array[ExternalPropertyFileReference] = null,
    externalizedProperties: ExternalPropertyFileReference = null,
    graphs: js.Array[ExternalPropertyFileReference] = null,
    invocations: js.Array[ExternalPropertyFileReference] = null,
    logicalLocations: js.Array[ExternalPropertyFileReference] = null,
    policies: js.Array[ExternalPropertyFileReference] = null,
    properties: PropertyBag = null,
    results: js.Array[ExternalPropertyFileReference] = null,
    taxonomies: js.Array[ExternalPropertyFileReference] = null,
    threadFlowLocations: js.Array[ExternalPropertyFileReference] = null,
    translations: js.Array[ExternalPropertyFileReference] = null
  ): ExternalPropertyFileReferences = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses)
    if (artifacts != null) __obj.updateDynamic("artifacts")(artifacts)
    if (conversion != null) __obj.updateDynamic("conversion")(conversion)
    if (driver != null) __obj.updateDynamic("driver")(driver)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (externalizedProperties != null) __obj.updateDynamic("externalizedProperties")(externalizedProperties)
    if (graphs != null) __obj.updateDynamic("graphs")(graphs)
    if (invocations != null) __obj.updateDynamic("invocations")(invocations)
    if (logicalLocations != null) __obj.updateDynamic("logicalLocations")(logicalLocations)
    if (policies != null) __obj.updateDynamic("policies")(policies)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (results != null) __obj.updateDynamic("results")(results)
    if (taxonomies != null) __obj.updateDynamic("taxonomies")(taxonomies)
    if (threadFlowLocations != null) __obj.updateDynamic("threadFlowLocations")(threadFlowLocations)
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ExternalPropertyFileReferences]
  }
}

