package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalPropertyFileReferences extends js.Object {
  /**
    * An array of external property files containing run.addresses arrays to be merged with the root log file.
    */
  var addresses: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An array of external property files containing run.artifacts arrays to be merged with the root log file.
    */
  var artifacts: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An external property file containing a run.conversion object to be merged with the root log file.
    */
  var conversion: js.UndefOr[ExternalPropertyFileReference] = js.native
  /**
    * An external property file containing a run.driver object to be merged with the root log file.
    */
  var driver: js.UndefOr[ExternalPropertyFileReference] = js.native
  /**
    * An array of external property files containing run.extensions arrays to be merged with the root log file.
    */
  var extensions: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An external property file containing a run.properties object to be merged with the root log file.
    */
  var externalizedProperties: js.UndefOr[ExternalPropertyFileReference] = js.native
  /**
    * An array of external property files containing a run.graphs object to be merged with the root log file.
    */
  var graphs: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An array of external property files containing run.invocations arrays to be merged with the root log file.
    */
  var invocations: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An array of external property files containing run.logicalLocations arrays to be merged with the root log file.
    */
  var logicalLocations: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An array of external property files containing run.policies arrays to be merged with the root log file.
    */
  var policies: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * Key/value pairs that provide additional information about the external property files.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * An array of external property files containing run.results arrays to be merged with the root log file.
    */
  var results: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An array of external property files containing run.taxonomies arrays to be merged with the root log file.
    */
  var taxonomies: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An array of external property files containing run.threadFlowLocations arrays to be merged with the root log
    * file.
    */
  var threadFlowLocations: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An array of external property files containing run.translations arrays to be merged with the root log file.
    */
  var translations: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An array of external property files containing run.requests arrays to be merged with the root log file.
    */
  var webRequests: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An array of external property files containing run.responses arrays to be merged with the root log file.
    */
  var webResponses: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
}

object ExternalPropertyFileReferences {
  @scala.inline
  def apply(): ExternalPropertyFileReferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalPropertyFileReferences]
  }
  @scala.inline
  implicit class ExternalPropertyFileReferencesOps[Self <: ExternalPropertyFileReferences] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddressesVarargs(value: ExternalPropertyFileReference*): Self = this.set("addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: js.Array[ExternalPropertyFileReference]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    @scala.inline
    def setArtifactsVarargs(value: ExternalPropertyFileReference*): Self = this.set("artifacts", js.Array(value :_*))
    @scala.inline
    def setArtifacts(value: js.Array[ExternalPropertyFileReference]): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtifacts: Self = this.set("artifacts", js.undefined)
    @scala.inline
    def setConversion(value: ExternalPropertyFileReference): Self = this.set("conversion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversion: Self = this.set("conversion", js.undefined)
    @scala.inline
    def setDriver(value: ExternalPropertyFileReference): Self = this.set("driver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriver: Self = this.set("driver", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: ExternalPropertyFileReference*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[ExternalPropertyFileReference]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setExternalizedProperties(value: ExternalPropertyFileReference): Self = this.set("externalizedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalizedProperties: Self = this.set("externalizedProperties", js.undefined)
    @scala.inline
    def setGraphsVarargs(value: ExternalPropertyFileReference*): Self = this.set("graphs", js.Array(value :_*))
    @scala.inline
    def setGraphs(value: js.Array[ExternalPropertyFileReference]): Self = this.set("graphs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphs: Self = this.set("graphs", js.undefined)
    @scala.inline
    def setInvocationsVarargs(value: ExternalPropertyFileReference*): Self = this.set("invocations", js.Array(value :_*))
    @scala.inline
    def setInvocations(value: js.Array[ExternalPropertyFileReference]): Self = this.set("invocations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvocations: Self = this.set("invocations", js.undefined)
    @scala.inline
    def setLogicalLocationsVarargs(value: ExternalPropertyFileReference*): Self = this.set("logicalLocations", js.Array(value :_*))
    @scala.inline
    def setLogicalLocations(value: js.Array[ExternalPropertyFileReference]): Self = this.set("logicalLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogicalLocations: Self = this.set("logicalLocations", js.undefined)
    @scala.inline
    def setPoliciesVarargs(value: ExternalPropertyFileReference*): Self = this.set("policies", js.Array(value :_*))
    @scala.inline
    def setPolicies(value: js.Array[ExternalPropertyFileReference]): Self = this.set("policies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicies: Self = this.set("policies", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setResultsVarargs(value: ExternalPropertyFileReference*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[ExternalPropertyFileReference]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setTaxonomiesVarargs(value: ExternalPropertyFileReference*): Self = this.set("taxonomies", js.Array(value :_*))
    @scala.inline
    def setTaxonomies(value: js.Array[ExternalPropertyFileReference]): Self = this.set("taxonomies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaxonomies: Self = this.set("taxonomies", js.undefined)
    @scala.inline
    def setThreadFlowLocationsVarargs(value: ExternalPropertyFileReference*): Self = this.set("threadFlowLocations", js.Array(value :_*))
    @scala.inline
    def setThreadFlowLocations(value: js.Array[ExternalPropertyFileReference]): Self = this.set("threadFlowLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreadFlowLocations: Self = this.set("threadFlowLocations", js.undefined)
    @scala.inline
    def setTranslationsVarargs(value: ExternalPropertyFileReference*): Self = this.set("translations", js.Array(value :_*))
    @scala.inline
    def setTranslations(value: js.Array[ExternalPropertyFileReference]): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    @scala.inline
    def setWebRequestsVarargs(value: ExternalPropertyFileReference*): Self = this.set("webRequests", js.Array(value :_*))
    @scala.inline
    def setWebRequests(value: js.Array[ExternalPropertyFileReference]): Self = this.set("webRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebRequests: Self = this.set("webRequests", js.undefined)
    @scala.inline
    def setWebResponsesVarargs(value: ExternalPropertyFileReference*): Self = this.set("webResponses", js.Array(value :_*))
    @scala.inline
    def setWebResponses(value: js.Array[ExternalPropertyFileReference]): Self = this.set("webResponses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebResponses: Self = this.set("webResponses", js.undefined)
  }
  
}

