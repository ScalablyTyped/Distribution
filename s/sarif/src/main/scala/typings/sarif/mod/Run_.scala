package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sarif.mod.Run.columnKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Run_ extends js.Object {
  /**
    * Addresses associated with this run instance, if any.
    */
  var addresses: js.UndefOr[js.Array[Address]] = js.native
  /**
    * An array of artifact objects relevant to the run.
    */
  var artifacts: js.UndefOr[js.Array[Artifact]] = js.native
  /**
    * Automation details that describe this run.
    */
  var automationDetails: js.UndefOr[RunAutomationDetails] = js.native
  /**
    * The 'guid' property of a previous SARIF 'run' that comprises the baseline that was used to compute result
    * 'baselineState' properties for the run.
    */
  var baselineGuid: js.UndefOr[String] = js.native
  /**
    * Specifies the unit in which the tool measures columns.
    */
  var columnKind: js.UndefOr[columnKind] = js.native
  /**
    * A conversion object that describes how a converter transformed an analysis tool's native reporting format into
    * the SARIF format.
    */
  var conversion: js.UndefOr[Conversion] = js.native
  /**
    * Specifies the default encoding for any artifact object that refers to a text file.
    */
  var defaultEncoding: js.UndefOr[String] = js.native
  /**
    * Specifies the default source language for any artifact object that refers to a text file that contains source
    * code.
    */
  var defaultSourceLanguage: js.UndefOr[String] = js.native
  /**
    * References to external property files that should be inlined with the content of a root log file.
    */
  var externalPropertyFileReferences: js.UndefOr[ExternalPropertyFileReferences] = js.native
  /**
    * An array of zero or more unique graph objects associated with the run.
    */
  var graphs: js.UndefOr[js.Array[Graph]] = js.native
  /**
    * Describes the invocation of the analysis tool.
    */
  var invocations: js.UndefOr[js.Array[Invocation]] = js.native
  /**
    * The language of the messages emitted into the log file during this run (expressed as an ISO 639-1 two-letter
    * lowercase culture code) and an optional region (expressed as an ISO 3166-1 two-letter uppercase subculture code
    * associated with a country or region). The casing is recommended but not required (in order for this data to
    * conform to RFC5646).
    */
  var language: js.UndefOr[String] = js.native
  /**
    * An array of logical locations such as namespaces, types or functions.
    */
  var logicalLocations: js.UndefOr[js.Array[LogicalLocation]] = js.native
  /**
    * An ordered list of character sequences that were treated as line breaks when computing region information for
    * the run.
    */
  var newlineSequences: js.UndefOr[js.Array[String]] = js.native
  /**
    * The artifact location specified by each uriBaseId symbol on the machine where the tool originally ran.
    */
  var originalUriBaseIds: js.UndefOr[StringDictionary[ArtifactLocation]] = js.native
  /**
    * Contains configurations that may potentially override both reportingDescriptor.defaultConfiguration (the tool's
    * default severities) and invocation.configurationOverrides (severities established at run-time from the command
    * line).
    */
  var policies: js.UndefOr[js.Array[ToolComponent]] = js.native
  /**
    * Key/value pairs that provide additional information about the run.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * An array of strings used to replace sensitive information in a redaction-aware property.
    */
  var redactionTokens: js.UndefOr[js.Array[String]] = js.native
  /**
    * The set of results contained in an SARIF log. The results array can be omitted when a run is solely exporting
    * rules metadata. It must be present (but may be empty) if a log file represents an actual scan.
    */
  var results: js.UndefOr[js.Array[Result]] = js.native
  /**
    * Automation details that describe the aggregate of runs to which this run belongs.
    */
  var runAggregates: js.UndefOr[js.Array[RunAutomationDetails]] = js.native
  /**
    * A specialLocations object that defines locations of special significance to SARIF consumers.
    */
  var specialLocations: js.UndefOr[SpecialLocations] = js.native
  /**
    * An array of toolComponent objects relevant to a taxonomy in which results are categorized.
    */
  var taxonomies: js.UndefOr[js.Array[ToolComponent]] = js.native
  /**
    * An array of threadFlowLocation objects cached at run level.
    */
  var threadFlowLocations: js.UndefOr[js.Array[ThreadFlowLocation]] = js.native
  /**
    * Information about the tool or tool pipeline that generated the results in this run. A run can only contain
    * results produced by a single tool or tool pipeline. A run can aggregate results from multiple log files, as long
    * as context around the tool run (tool command-line arguments and the like) is identical for all aggregated files.
    */
  var tool: Tool = js.native
  /**
    * The set of available translations of the localized data provided by the tool.
    */
  var translations: js.UndefOr[js.Array[ToolComponent]] = js.native
  /**
    * Specifies the revision in version control of the artifacts that were scanned.
    */
  var versionControlProvenance: js.UndefOr[js.Array[VersionControlDetails]] = js.native
  /**
    * An array of request objects cached at run level.
    */
  var webRequests: js.UndefOr[js.Array[WebRequest]] = js.native
  /**
    * An array of response objects cached at run level.
    */
  var webResponses: js.UndefOr[js.Array[WebResponse]] = js.native
}

object Run_ {
  @scala.inline
  def apply(tool: Tool): Run_ = {
    val __obj = js.Dynamic.literal(tool = tool.asInstanceOf[js.Any])
    __obj.asInstanceOf[Run_]
  }
  @scala.inline
  implicit class Run_Ops[Self <: Run_] (val x: Self) extends AnyVal {
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
    def setTool(value: Tool): Self = this.set("tool", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddressesVarargs(value: Address*): Self = this.set("addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: js.Array[Address]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    @scala.inline
    def setArtifactsVarargs(value: Artifact*): Self = this.set("artifacts", js.Array(value :_*))
    @scala.inline
    def setArtifacts(value: js.Array[Artifact]): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtifacts: Self = this.set("artifacts", js.undefined)
    @scala.inline
    def setAutomationDetails(value: RunAutomationDetails): Self = this.set("automationDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomationDetails: Self = this.set("automationDetails", js.undefined)
    @scala.inline
    def setBaselineGuid(value: String): Self = this.set("baselineGuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineGuid: Self = this.set("baselineGuid", js.undefined)
    @scala.inline
    def setColumnKind(value: columnKind): Self = this.set("columnKind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnKind: Self = this.set("columnKind", js.undefined)
    @scala.inline
    def setConversion(value: Conversion): Self = this.set("conversion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversion: Self = this.set("conversion", js.undefined)
    @scala.inline
    def setDefaultEncoding(value: String): Self = this.set("defaultEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultEncoding: Self = this.set("defaultEncoding", js.undefined)
    @scala.inline
    def setDefaultSourceLanguage(value: String): Self = this.set("defaultSourceLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSourceLanguage: Self = this.set("defaultSourceLanguage", js.undefined)
    @scala.inline
    def setExternalPropertyFileReferences(value: ExternalPropertyFileReferences): Self = this.set("externalPropertyFileReferences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalPropertyFileReferences: Self = this.set("externalPropertyFileReferences", js.undefined)
    @scala.inline
    def setGraphsVarargs(value: Graph*): Self = this.set("graphs", js.Array(value :_*))
    @scala.inline
    def setGraphs(value: js.Array[Graph]): Self = this.set("graphs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphs: Self = this.set("graphs", js.undefined)
    @scala.inline
    def setInvocationsVarargs(value: Invocation*): Self = this.set("invocations", js.Array(value :_*))
    @scala.inline
    def setInvocations(value: js.Array[Invocation]): Self = this.set("invocations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvocations: Self = this.set("invocations", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLogicalLocationsVarargs(value: LogicalLocation*): Self = this.set("logicalLocations", js.Array(value :_*))
    @scala.inline
    def setLogicalLocations(value: js.Array[LogicalLocation]): Self = this.set("logicalLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogicalLocations: Self = this.set("logicalLocations", js.undefined)
    @scala.inline
    def setNewlineSequencesVarargs(value: String*): Self = this.set("newlineSequences", js.Array(value :_*))
    @scala.inline
    def setNewlineSequences(value: js.Array[String]): Self = this.set("newlineSequences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewlineSequences: Self = this.set("newlineSequences", js.undefined)
    @scala.inline
    def setOriginalUriBaseIds(value: StringDictionary[ArtifactLocation]): Self = this.set("originalUriBaseIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalUriBaseIds: Self = this.set("originalUriBaseIds", js.undefined)
    @scala.inline
    def setPoliciesVarargs(value: ToolComponent*): Self = this.set("policies", js.Array(value :_*))
    @scala.inline
    def setPolicies(value: js.Array[ToolComponent]): Self = this.set("policies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicies: Self = this.set("policies", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setRedactionTokensVarargs(value: String*): Self = this.set("redactionTokens", js.Array(value :_*))
    @scala.inline
    def setRedactionTokens(value: js.Array[String]): Self = this.set("redactionTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedactionTokens: Self = this.set("redactionTokens", js.undefined)
    @scala.inline
    def setResultsVarargs(value: Result*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[Result]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setRunAggregatesVarargs(value: RunAutomationDetails*): Self = this.set("runAggregates", js.Array(value :_*))
    @scala.inline
    def setRunAggregates(value: js.Array[RunAutomationDetails]): Self = this.set("runAggregates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunAggregates: Self = this.set("runAggregates", js.undefined)
    @scala.inline
    def setSpecialLocations(value: SpecialLocations): Self = this.set("specialLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecialLocations: Self = this.set("specialLocations", js.undefined)
    @scala.inline
    def setTaxonomiesVarargs(value: ToolComponent*): Self = this.set("taxonomies", js.Array(value :_*))
    @scala.inline
    def setTaxonomies(value: js.Array[ToolComponent]): Self = this.set("taxonomies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaxonomies: Self = this.set("taxonomies", js.undefined)
    @scala.inline
    def setThreadFlowLocationsVarargs(value: ThreadFlowLocation*): Self = this.set("threadFlowLocations", js.Array(value :_*))
    @scala.inline
    def setThreadFlowLocations(value: js.Array[ThreadFlowLocation]): Self = this.set("threadFlowLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreadFlowLocations: Self = this.set("threadFlowLocations", js.undefined)
    @scala.inline
    def setTranslationsVarargs(value: ToolComponent*): Self = this.set("translations", js.Array(value :_*))
    @scala.inline
    def setTranslations(value: js.Array[ToolComponent]): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    @scala.inline
    def setVersionControlProvenanceVarargs(value: VersionControlDetails*): Self = this.set("versionControlProvenance", js.Array(value :_*))
    @scala.inline
    def setVersionControlProvenance(value: js.Array[VersionControlDetails]): Self = this.set("versionControlProvenance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionControlProvenance: Self = this.set("versionControlProvenance", js.undefined)
    @scala.inline
    def setWebRequestsVarargs(value: WebRequest*): Self = this.set("webRequests", js.Array(value :_*))
    @scala.inline
    def setWebRequests(value: js.Array[WebRequest]): Self = this.set("webRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebRequests: Self = this.set("webRequests", js.undefined)
    @scala.inline
    def setWebResponsesVarargs(value: WebResponse*): Self = this.set("webResponses", js.Array(value :_*))
    @scala.inline
    def setWebResponses(value: js.Array[WebResponse]): Self = this.set("webResponses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebResponses: Self = this.set("webResponses", js.undefined)
  }
  
}

