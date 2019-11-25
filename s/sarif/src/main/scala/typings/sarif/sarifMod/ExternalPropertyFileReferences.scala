package typings.sarif.sarifMod

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
  /**
    * An array of external property files containing run.requests arrays to be merged with the root log file.
    */
  var webRequests: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.undefined
  /**
    * An array of external property files containing run.responses arrays to be merged with the root log file.
    */
  var webResponses: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.undefined
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
    translations: js.Array[ExternalPropertyFileReference] = null,
    webRequests: js.Array[ExternalPropertyFileReference] = null,
    webResponses: js.Array[ExternalPropertyFileReference] = null
  ): ExternalPropertyFileReferences = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (artifacts != null) __obj.updateDynamic("artifacts")(artifacts.asInstanceOf[js.Any])
    if (conversion != null) __obj.updateDynamic("conversion")(conversion.asInstanceOf[js.Any])
    if (driver != null) __obj.updateDynamic("driver")(driver.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (externalizedProperties != null) __obj.updateDynamic("externalizedProperties")(externalizedProperties.asInstanceOf[js.Any])
    if (graphs != null) __obj.updateDynamic("graphs")(graphs.asInstanceOf[js.Any])
    if (invocations != null) __obj.updateDynamic("invocations")(invocations.asInstanceOf[js.Any])
    if (logicalLocations != null) __obj.updateDynamic("logicalLocations")(logicalLocations.asInstanceOf[js.Any])
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (taxonomies != null) __obj.updateDynamic("taxonomies")(taxonomies.asInstanceOf[js.Any])
    if (threadFlowLocations != null) __obj.updateDynamic("threadFlowLocations")(threadFlowLocations.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (webRequests != null) __obj.updateDynamic("webRequests")(webRequests.asInstanceOf[js.Any])
    if (webResponses != null) __obj.updateDynamic("webResponses")(webResponses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalPropertyFileReferences]
  }
}

