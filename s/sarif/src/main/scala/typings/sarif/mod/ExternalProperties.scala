package typings.sarif.mod

import typings.sarif.mod.ExternalProperties.version
import typings.sarif.sarifStrings.`2Dot1Dot0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalProperties extends StObject {
  
  /**
    * Addresses that will be merged with a separate run.
    */
  var addresses: js.UndefOr[js.Array[Address]] = js.native
  
  /**
    * An array of artifact objects that will be merged with a separate run.
    */
  var artifacts: js.UndefOr[js.Array[Artifact]] = js.native
  
  /**
    * A conversion object that will be merged with a separate run.
    */
  var conversion: js.UndefOr[Conversion] = js.native
  
  /**
    * The analysis tool object that will be merged with a separate run.
    */
  var driver: js.UndefOr[ToolComponent] = js.native
  
  /**
    * Tool extensions that will be merged with a separate run.
    */
  var extensions: js.UndefOr[js.Array[ToolComponent]] = js.native
  
  /**
    * Key/value pairs that provide additional information that will be merged with a separate run.
    */
  var externalizedProperties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * An array of graph objects that will be merged with a separate run.
    */
  var graphs: js.UndefOr[js.Array[Graph]] = js.native
  
  /**
    * A stable, unique identifer for this external properties object, in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.native
  
  /**
    * Describes the invocation of the analysis tool that will be merged with a separate run.
    */
  var invocations: js.UndefOr[js.Array[Invocation]] = js.native
  
  /**
    * An array of logical locations such as namespaces, types or functions that will be merged with a separate run.
    */
  var logicalLocations: js.UndefOr[js.Array[LogicalLocation]] = js.native
  
  /**
    * Tool policies that will be merged with a separate run.
    */
  var policies: js.UndefOr[js.Array[ToolComponent]] = js.native
  
  /**
    * Key/value pairs that provide additional information about the external properties.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * An array of result objects that will be merged with a separate run.
    */
  var results: js.UndefOr[js.Array[Result]] = js.native
  
  /**
    * A stable, unique identifer for the run associated with this external properties object, in the form of a GUID.
    */
  var runGuid: js.UndefOr[String] = js.native
  
  /**
    * The URI of the JSON schema corresponding to the version of the external property file format.
    */
  var schema: js.UndefOr[String] = js.native
  
  /**
    * Tool taxonomies that will be merged with a separate run.
    */
  var taxonomies: js.UndefOr[js.Array[ToolComponent]] = js.native
  
  /**
    * An array of threadFlowLocation objects that will be merged with a separate run.
    */
  var threadFlowLocations: js.UndefOr[js.Array[ThreadFlowLocation]] = js.native
  
  /**
    * Tool translations that will be merged with a separate run.
    */
  var translations: js.UndefOr[js.Array[ToolComponent]] = js.native
  
  /**
    * The SARIF format version of this external properties object.
    */
  var version: js.UndefOr[version] = js.native
  
  /**
    * Requests that will be merged with a separate run.
    */
  var webRequests: js.UndefOr[js.Array[WebRequest]] = js.native
  
  /**
    * Responses that will be merged with a separate run.
    */
  var webResponses: js.UndefOr[js.Array[WebResponse]] = js.native
}
object ExternalProperties {
  
  @scala.inline
  def apply(): ExternalProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalProperties]
  }
  
  @scala.inline
  implicit class ExternalPropertiesMutableBuilder[Self <: ExternalProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: js.Array[Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: Address*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setArtifacts(value: js.Array[Artifact]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    @scala.inline
    def setArtifactsVarargs(value: Artifact*): Self = StObject.set(x, "artifacts", js.Array(value :_*))
    
    @scala.inline
    def setConversion(value: Conversion): Self = StObject.set(x, "conversion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionUndefined: Self = StObject.set(x, "conversion", js.undefined)
    
    @scala.inline
    def setDriver(value: ToolComponent): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
    
    @scala.inline
    def setExtensions(value: js.Array[ToolComponent]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: ToolComponent*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setExternalizedProperties(value: PropertyBag): Self = StObject.set(x, "externalizedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalizedPropertiesUndefined: Self = StObject.set(x, "externalizedProperties", js.undefined)
    
    @scala.inline
    def setGraphs(value: js.Array[Graph]): Self = StObject.set(x, "graphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphsUndefined: Self = StObject.set(x, "graphs", js.undefined)
    
    @scala.inline
    def setGraphsVarargs(value: Graph*): Self = StObject.set(x, "graphs", js.Array(value :_*))
    
    @scala.inline
    def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    @scala.inline
    def setInvocations(value: js.Array[Invocation]): Self = StObject.set(x, "invocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationsUndefined: Self = StObject.set(x, "invocations", js.undefined)
    
    @scala.inline
    def setInvocationsVarargs(value: Invocation*): Self = StObject.set(x, "invocations", js.Array(value :_*))
    
    @scala.inline
    def setLogicalLocations(value: js.Array[LogicalLocation]): Self = StObject.set(x, "logicalLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalLocationsUndefined: Self = StObject.set(x, "logicalLocations", js.undefined)
    
    @scala.inline
    def setLogicalLocationsVarargs(value: LogicalLocation*): Self = StObject.set(x, "logicalLocations", js.Array(value :_*))
    
    @scala.inline
    def setPolicies(value: js.Array[ToolComponent]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: ToolComponent*): Self = StObject.set(x, "policies", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[Result]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: Result*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setRunGuid(value: String): Self = StObject.set(x, "runGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunGuidUndefined: Self = StObject.set(x, "runGuid", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setTaxonomies(value: js.Array[ToolComponent]): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxonomiesUndefined: Self = StObject.set(x, "taxonomies", js.undefined)
    
    @scala.inline
    def setTaxonomiesVarargs(value: ToolComponent*): Self = StObject.set(x, "taxonomies", js.Array(value :_*))
    
    @scala.inline
    def setThreadFlowLocations(value: js.Array[ThreadFlowLocation]): Self = StObject.set(x, "threadFlowLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadFlowLocationsUndefined: Self = StObject.set(x, "threadFlowLocations", js.undefined)
    
    @scala.inline
    def setThreadFlowLocationsVarargs(value: ThreadFlowLocation*): Self = StObject.set(x, "threadFlowLocations", js.Array(value :_*))
    
    @scala.inline
    def setTranslations(value: js.Array[ToolComponent]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    @scala.inline
    def setTranslationsVarargs(value: ToolComponent*): Self = StObject.set(x, "translations", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWebRequests(value: js.Array[WebRequest]): Self = StObject.set(x, "webRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebRequestsUndefined: Self = StObject.set(x, "webRequests", js.undefined)
    
    @scala.inline
    def setWebRequestsVarargs(value: WebRequest*): Self = StObject.set(x, "webRequests", js.Array(value :_*))
    
    @scala.inline
    def setWebResponses(value: js.Array[WebResponse]): Self = StObject.set(x, "webResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebResponsesUndefined: Self = StObject.set(x, "webResponses", js.undefined)
    
    @scala.inline
    def setWebResponsesVarargs(value: WebResponse*): Self = StObject.set(x, "webResponses", js.Array(value :_*))
  }
  
  type version = `2Dot1Dot0`
}
