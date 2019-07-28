package typings.sarif.sarifMod

import typings.sarif.sarifMod.ExternalPropertiesNs.version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalProperties extends js.Object {
  /**
    * Addresses that will be merged with a separate run.
    */
  var addresses: js.UndefOr[js.Array[Address]] = js.undefined
  /**
    * An array of artifact objects that will be merged with a separate run.
    */
  var artifacts: js.UndefOr[js.Array[Artifact]] = js.undefined
  /**
    * A conversion object that will be merged with a separate run.
    */
  var conversion: js.UndefOr[Conversion] = js.undefined
  /**
    * The analysis tool object that will be merged with a separate run.
    */
  var driver: js.UndefOr[ToolComponent] = js.undefined
  /**
    * Tool extensions that will be merged with a separate run.
    */
  var extensions: js.UndefOr[js.Array[ToolComponent]] = js.undefined
  /**
    * Key/value pairs that provide additional information that will be merged with a separate run.
    */
  var externalizedProperties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * An array of graph objects that will be merged with a separate run.
    */
  var graphs: js.UndefOr[js.Array[Graph]] = js.undefined
  /**
    * A stable, unique identifer for this external properties object, in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.undefined
  /**
    * Describes the invocation of the analysis tool that will be merged with a separate run.
    */
  var invocations: js.UndefOr[js.Array[Invocation]] = js.undefined
  /**
    * An array of logical locations such as namespaces, types or functions that will be merged with a separate run.
    */
  var logicalLocations: js.UndefOr[js.Array[LogicalLocation]] = js.undefined
  /**
    * Tool policies that will be merged with a separate run.
    */
  var policies: js.UndefOr[js.Array[ToolComponent]] = js.undefined
  /**
    * Key/value pairs that provide additional information about the external properties.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * An array of result objects that will be merged with a separate run.
    */
  var results: js.UndefOr[js.Array[Result]] = js.undefined
  /**
    * A stable, unique identifer for the run associated with this external properties object, in the form of a GUID.
    */
  var runGuid: js.UndefOr[String] = js.undefined
  /**
    * The URI of the JSON schema corresponding to the version of the external property file format.
    */
  var schema: js.UndefOr[String] = js.undefined
  /**
    * Tool taxonomies that will be merged with a separate run.
    */
  var taxonomies: js.UndefOr[js.Array[ToolComponent]] = js.undefined
  /**
    * An array of threadFlowLocation objects that will be merged with a separate run.
    */
  var threadFlowLocations: js.UndefOr[js.Array[ThreadFlowLocation]] = js.undefined
  /**
    * Tool translations that will be merged with a separate run.
    */
  var translations: js.UndefOr[js.Array[ToolComponent]] = js.undefined
  /**
    * The SARIF format version of this external properties object.
    */
  var version: js.UndefOr[typings.sarif.sarifMod.ExternalPropertiesNs.version] = js.undefined
  /**
    * Requests that will be merged with a separate run.
    */
  var webRequests: js.UndefOr[js.Array[WebRequest]] = js.undefined
  /**
    * Responses that will be merged with a separate run.
    */
  var webResponses: js.UndefOr[js.Array[WebResponse]] = js.undefined
}

object ExternalProperties {
  @scala.inline
  def apply(
    addresses: js.Array[Address] = null,
    artifacts: js.Array[Artifact] = null,
    conversion: Conversion = null,
    driver: ToolComponent = null,
    extensions: js.Array[ToolComponent] = null,
    externalizedProperties: PropertyBag = null,
    graphs: js.Array[Graph] = null,
    guid: String = null,
    invocations: js.Array[Invocation] = null,
    logicalLocations: js.Array[LogicalLocation] = null,
    policies: js.Array[ToolComponent] = null,
    properties: PropertyBag = null,
    results: js.Array[Result] = null,
    runGuid: String = null,
    schema: String = null,
    taxonomies: js.Array[ToolComponent] = null,
    threadFlowLocations: js.Array[ThreadFlowLocation] = null,
    translations: js.Array[ToolComponent] = null,
    version: version = null,
    webRequests: js.Array[WebRequest] = null,
    webResponses: js.Array[WebResponse] = null
  ): ExternalProperties = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses)
    if (artifacts != null) __obj.updateDynamic("artifacts")(artifacts)
    if (conversion != null) __obj.updateDynamic("conversion")(conversion)
    if (driver != null) __obj.updateDynamic("driver")(driver)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (externalizedProperties != null) __obj.updateDynamic("externalizedProperties")(externalizedProperties)
    if (graphs != null) __obj.updateDynamic("graphs")(graphs)
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (invocations != null) __obj.updateDynamic("invocations")(invocations)
    if (logicalLocations != null) __obj.updateDynamic("logicalLocations")(logicalLocations)
    if (policies != null) __obj.updateDynamic("policies")(policies)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (results != null) __obj.updateDynamic("results")(results)
    if (runGuid != null) __obj.updateDynamic("runGuid")(runGuid)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (taxonomies != null) __obj.updateDynamic("taxonomies")(taxonomies)
    if (threadFlowLocations != null) __obj.updateDynamic("threadFlowLocations")(threadFlowLocations)
    if (translations != null) __obj.updateDynamic("translations")(translations)
    if (version != null) __obj.updateDynamic("version")(version)
    if (webRequests != null) __obj.updateDynamic("webRequests")(webRequests)
    if (webResponses != null) __obj.updateDynamic("webResponses")(webResponses)
    __obj.asInstanceOf[ExternalProperties]
  }
}

