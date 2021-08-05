package typings.sarif.mod

import typings.sarif.mod.ExternalProperties.version
import typings.sarif.sarifStrings.`2Dot1Dot0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalProperties extends StObject {
  
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
  var version: js.UndefOr[version] = js.undefined
  
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
  
  inline def apply(): ExternalProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalProperties]
  }
  
  extension [Self <: ExternalProperties](x: Self) {
    
    inline def setAddresses(value: js.Array[Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: Address*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    inline def setArtifacts(value: js.Array[Artifact]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    inline def setArtifactsVarargs(value: Artifact*): Self = StObject.set(x, "artifacts", js.Array(value :_*))
    
    inline def setConversion(value: Conversion): Self = StObject.set(x, "conversion", value.asInstanceOf[js.Any])
    
    inline def setConversionUndefined: Self = StObject.set(x, "conversion", js.undefined)
    
    inline def setDriver(value: ToolComponent): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
    
    inline def setExtensions(value: js.Array[ToolComponent]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: ToolComponent*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    inline def setExternalizedProperties(value: PropertyBag): Self = StObject.set(x, "externalizedProperties", value.asInstanceOf[js.Any])
    
    inline def setExternalizedPropertiesUndefined: Self = StObject.set(x, "externalizedProperties", js.undefined)
    
    inline def setGraphs(value: js.Array[Graph]): Self = StObject.set(x, "graphs", value.asInstanceOf[js.Any])
    
    inline def setGraphsUndefined: Self = StObject.set(x, "graphs", js.undefined)
    
    inline def setGraphsVarargs(value: Graph*): Self = StObject.set(x, "graphs", js.Array(value :_*))
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setInvocations(value: js.Array[Invocation]): Self = StObject.set(x, "invocations", value.asInstanceOf[js.Any])
    
    inline def setInvocationsUndefined: Self = StObject.set(x, "invocations", js.undefined)
    
    inline def setInvocationsVarargs(value: Invocation*): Self = StObject.set(x, "invocations", js.Array(value :_*))
    
    inline def setLogicalLocations(value: js.Array[LogicalLocation]): Self = StObject.set(x, "logicalLocations", value.asInstanceOf[js.Any])
    
    inline def setLogicalLocationsUndefined: Self = StObject.set(x, "logicalLocations", js.undefined)
    
    inline def setLogicalLocationsVarargs(value: LogicalLocation*): Self = StObject.set(x, "logicalLocations", js.Array(value :_*))
    
    inline def setPolicies(value: js.Array[ToolComponent]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: ToolComponent*): Self = StObject.set(x, "policies", js.Array(value :_*))
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setResults(value: js.Array[Result]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: Result*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    inline def setRunGuid(value: String): Self = StObject.set(x, "runGuid", value.asInstanceOf[js.Any])
    
    inline def setRunGuidUndefined: Self = StObject.set(x, "runGuid", js.undefined)
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTaxonomies(value: js.Array[ToolComponent]): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
    
    inline def setTaxonomiesUndefined: Self = StObject.set(x, "taxonomies", js.undefined)
    
    inline def setTaxonomiesVarargs(value: ToolComponent*): Self = StObject.set(x, "taxonomies", js.Array(value :_*))
    
    inline def setThreadFlowLocations(value: js.Array[ThreadFlowLocation]): Self = StObject.set(x, "threadFlowLocations", value.asInstanceOf[js.Any])
    
    inline def setThreadFlowLocationsUndefined: Self = StObject.set(x, "threadFlowLocations", js.undefined)
    
    inline def setThreadFlowLocationsVarargs(value: ThreadFlowLocation*): Self = StObject.set(x, "threadFlowLocations", js.Array(value :_*))
    
    inline def setTranslations(value: js.Array[ToolComponent]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    inline def setTranslationsVarargs(value: ToolComponent*): Self = StObject.set(x, "translations", js.Array(value :_*))
    
    inline def setVersion(value: version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWebRequests(value: js.Array[WebRequest]): Self = StObject.set(x, "webRequests", value.asInstanceOf[js.Any])
    
    inline def setWebRequestsUndefined: Self = StObject.set(x, "webRequests", js.undefined)
    
    inline def setWebRequestsVarargs(value: WebRequest*): Self = StObject.set(x, "webRequests", js.Array(value :_*))
    
    inline def setWebResponses(value: js.Array[WebResponse]): Self = StObject.set(x, "webResponses", value.asInstanceOf[js.Any])
    
    inline def setWebResponsesUndefined: Self = StObject.set(x, "webResponses", js.undefined)
    
    inline def setWebResponsesVarargs(value: WebResponse*): Self = StObject.set(x, "webResponses", js.Array(value :_*))
  }
  
  type version = `2Dot1Dot0`
}
