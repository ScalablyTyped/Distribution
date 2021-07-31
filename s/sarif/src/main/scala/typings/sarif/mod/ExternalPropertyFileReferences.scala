package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalPropertyFileReferences extends StObject {
  
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
  def apply(): ExternalPropertyFileReferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalPropertyFileReferences]
  }
  
  @scala.inline
  implicit class ExternalPropertyFileReferencesMutableBuilder[Self <: ExternalPropertyFileReferences] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: js.Array[ExternalPropertyFileReference]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: ExternalPropertyFileReference*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setArtifacts(value: js.Array[ExternalPropertyFileReference]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    @scala.inline
    def setArtifactsVarargs(value: ExternalPropertyFileReference*): Self = StObject.set(x, "artifacts", js.Array(value :_*))
    
    @scala.inline
    def setConversion(value: ExternalPropertyFileReference): Self = StObject.set(x, "conversion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionUndefined: Self = StObject.set(x, "conversion", js.undefined)
    
    @scala.inline
    def setDriver(value: ExternalPropertyFileReference): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
    
    @scala.inline
    def setExtensions(value: js.Array[ExternalPropertyFileReference]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: ExternalPropertyFileReference*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setExternalizedProperties(value: ExternalPropertyFileReference): Self = StObject.set(x, "externalizedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalizedPropertiesUndefined: Self = StObject.set(x, "externalizedProperties", js.undefined)
    
    @scala.inline
    def setGraphs(value: js.Array[ExternalPropertyFileReference]): Self = StObject.set(x, "graphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphsUndefined: Self = StObject.set(x, "graphs", js.undefined)
    
    @scala.inline
    def setGraphsVarargs(value: ExternalPropertyFileReference*): Self = StObject.set(x, "graphs", js.Array(value :_*))
    
    @scala.inline
    def setInvocations(value: js.Array[ExternalPropertyFileReference]): Self = StObject.set(x, "invocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationsUndefined: Self = StObject.set(x, "invocations", js.undefined)
    
    @scala.inline
    def setInvocationsVarargs(value: ExternalPropertyFileReference*): Self = StObject.set(x, "invocations", js.Array(value :_*))
    
    @scala.inline
    def setLogicalLocations(value: js.Array[ExternalPropertyFileReference]): Self = StObject.set(x, "logicalLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalLocationsUndefined: Self = StObject.set(x, "logicalLocations", js.undefined)
    
    @scala.inline
    def setLogicalLocationsVarargs(value: ExternalPropertyFileReference*): Self = StObject.set(x, "logicalLocations", js.Array(value :_*))
    
    @scala.inline
    def setPolicies(value: js.Array[ExternalPropertyFileReference]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: ExternalPropertyFileReference*): Self = StObject.set(x, "policies", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[ExternalPropertyFileReference]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: ExternalPropertyFileReference*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setTaxonomies(value: js.Array[ExternalPropertyFileReference]): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxonomiesUndefined: Self = StObject.set(x, "taxonomies", js.undefined)
    
    @scala.inline
    def setTaxonomiesVarargs(value: ExternalPropertyFileReference*): Self = StObject.set(x, "taxonomies", js.Array(value :_*))
    
    @scala.inline
    def setThreadFlowLocations(value: js.Array[ExternalPropertyFileReference]): Self = StObject.set(x, "threadFlowLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadFlowLocationsUndefined: Self = StObject.set(x, "threadFlowLocations", js.undefined)
    
    @scala.inline
    def setThreadFlowLocationsVarargs(value: ExternalPropertyFileReference*): Self = StObject.set(x, "threadFlowLocations", js.Array(value :_*))
    
    @scala.inline
    def setTranslations(value: js.Array[ExternalPropertyFileReference]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    @scala.inline
    def setTranslationsVarargs(value: ExternalPropertyFileReference*): Self = StObject.set(x, "translations", js.Array(value :_*))
    
    @scala.inline
    def setWebRequests(value: js.Array[ExternalPropertyFileReference]): Self = StObject.set(x, "webRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebRequestsUndefined: Self = StObject.set(x, "webRequests", js.undefined)
    
    @scala.inline
    def setWebRequestsVarargs(value: ExternalPropertyFileReference*): Self = StObject.set(x, "webRequests", js.Array(value :_*))
    
    @scala.inline
    def setWebResponses(value: js.Array[ExternalPropertyFileReference]): Self = StObject.set(x, "webResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebResponsesUndefined: Self = StObject.set(x, "webResponses", js.undefined)
    
    @scala.inline
    def setWebResponsesVarargs(value: ExternalPropertyFileReference*): Self = StObject.set(x, "webResponses", js.Array(value :_*))
  }
}
