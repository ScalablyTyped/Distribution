package typings.sarif.sarifMod

import org.scalablytyped.runtime.StringDictionary
import typings.sarif.sarifMod.Run.columnKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Run extends js.Object {
  /**
    * Addresses associated with this run instance, if any.
    */
  var addresses: js.UndefOr[js.Array[Address]] = js.undefined
  /**
    * An array of artifact objects relevant to the run.
    */
  var artifacts: js.UndefOr[js.Array[Artifact]] = js.undefined
  /**
    * Automation details that describe this run.
    */
  var automationDetails: js.UndefOr[RunAutomationDetails] = js.undefined
  /**
    * The 'guid' property of a previous SARIF 'run' that comprises the baseline that was used to compute result
    * 'baselineState' properties for the run.
    */
  var baselineGuid: js.UndefOr[String] = js.undefined
  /**
    * Specifies the unit in which the tool measures columns.
    */
  var columnKind: js.UndefOr[columnKind] = js.undefined
  /**
    * A conversion object that describes how a converter transformed an analysis tool's native reporting format into
    * the SARIF format.
    */
  var conversion: js.UndefOr[Conversion] = js.undefined
  /**
    * Specifies the default encoding for any artifact object that refers to a text file.
    */
  var defaultEncoding: js.UndefOr[String] = js.undefined
  /**
    * Specifies the default source language for any artifact object that refers to a text file that contains source
    * code.
    */
  var defaultSourceLanguage: js.UndefOr[String] = js.undefined
  /**
    * References to external property files that should be inlined with the content of a root log file.
    */
  var externalPropertyFileReferences: js.UndefOr[ExternalPropertyFileReferences] = js.undefined
  /**
    * An array of zero or more unique graph objects associated with the run.
    */
  var graphs: js.UndefOr[js.Array[Graph]] = js.undefined
  /**
    * Describes the invocation of the analysis tool.
    */
  var invocations: js.UndefOr[js.Array[Invocation]] = js.undefined
  /**
    * The language of the messages emitted into the log file during this run (expressed as an ISO 639-1 two-letter
    * lowercase culture code) and an optional region (expressed as an ISO 3166-1 two-letter uppercase subculture code
    * associated with a country or region). The casing is recommended but not required (in order for this data to
    * conform to RFC5646).
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * An array of logical locations such as namespaces, types or functions.
    */
  var logicalLocations: js.UndefOr[js.Array[LogicalLocation]] = js.undefined
  /**
    * An ordered list of character sequences that were treated as line breaks when computing region information for
    * the run.
    */
  var newlineSequences: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The artifact location specified by each uriBaseId symbol on the machine where the tool originally ran.
    */
  var originalUriBaseIds: js.UndefOr[StringDictionary[ArtifactLocation]] = js.undefined
  /**
    * Contains configurations that may potentially override both reportingDescriptor.defaultConfiguration (the tool's
    * default severities) and invocation.configurationOverrides (severities established at run-time from the command
    * line).
    */
  var policies: js.UndefOr[js.Array[ToolComponent]] = js.undefined
  /**
    * Key/value pairs that provide additional information about the run.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * An array of strings used to replace sensitive information in a redaction-aware property.
    */
  var redactionTokens: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The set of results contained in an SARIF log. The results array can be omitted when a run is solely exporting
    * rules metadata. It must be present (but may be empty) if a log file represents an actual scan.
    */
  var results: js.UndefOr[js.Array[Result]] = js.undefined
  /**
    * Automation details that describe the aggregate of runs to which this run belongs.
    */
  var runAggregates: js.UndefOr[js.Array[RunAutomationDetails]] = js.undefined
  /**
    * A specialLocations object that defines locations of special significance to SARIF consumers.
    */
  var specialLocations: js.UndefOr[SpecialLocations] = js.undefined
  /**
    * An array of toolComponent objects relevant to a taxonomy in which results are categorized.
    */
  var taxonomies: js.UndefOr[js.Array[ToolComponent]] = js.undefined
  /**
    * An array of threadFlowLocation objects cached at run level.
    */
  var threadFlowLocations: js.UndefOr[js.Array[ThreadFlowLocation]] = js.undefined
  /**
    * Information about the tool or tool pipeline that generated the results in this run. A run can only contain
    * results produced by a single tool or tool pipeline. A run can aggregate results from multiple log files, as long
    * as context around the tool run (tool command-line arguments and the like) is identical for all aggregated files.
    */
  var tool: Tool
  /**
    * The set of available translations of the localized data provided by the tool.
    */
  var translations: js.UndefOr[js.Array[ToolComponent]] = js.undefined
  /**
    * Specifies the revision in version control of the artifacts that were scanned.
    */
  var versionControlProvenance: js.UndefOr[js.Array[VersionControlDetails]] = js.undefined
  /**
    * An array of request objects cached at run level.
    */
  var webRequests: js.UndefOr[js.Array[WebRequest]] = js.undefined
  /**
    * An array of response objects cached at run level.
    */
  var webResponses: js.UndefOr[js.Array[WebResponse]] = js.undefined
}

@JSImport("sarif", "Run")
@js.native
object Run extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.sarif.sarifStrings.utf16CodeUnits
    - typings.sarif.sarifStrings.unicodeCodePoints
  */
  trait columnKind extends js.Object
  
}

