package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Run extends js.Object {
  /**
    * Automation details that describe the aggregate of runs to which this run belongs.
    */
  var aggregateIds: js.UndefOr[js.Array[RunAutomationDetails]] = js.undefined
  /**
    * An array of artifact objects relevant to the run.
    */
  var artifacts: js.UndefOr[js.Array[Artifact]] = js.undefined
  /**
    * The 'instanceGuid' property of a previous SARIF 'run' that comprises the baseline that was used to compute
    * result 'baselineState' properties for the run.
    */
  var baselineInstanceGuid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the unit in which the tool measures columns.
    */
  var columnKind: js.UndefOr[sarifLib.sarifMod.RunNs.columnKind] = js.undefined
  /**
    * A conversion object that describes how a converter transformed an analysis tool's native reporting format into
    * the SARIF format.
    */
  var conversion: js.UndefOr[Conversion] = js.undefined
  /**
    * Specifies the default encoding for any artifact object that refers to a text file.
    */
  var defaultFileEncoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the default source language for any artifact object that refers to a text file that contains source
    * code.
    */
  var defaultSourceLanguage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * References to external property files that should be inlined with the content of a root log file.
    */
  var externalPropertyFiles: js.UndefOr[ExternalPropertyFiles] = js.undefined
  /**
    * A dictionary, each of whose keys is the id of a graph and each of whose values is a 'graph' object with that id.
    */
  var graphs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Graph]] = js.undefined
  /**
    * Automation details that describe this run.
    */
  var id: js.UndefOr[RunAutomationDetails] = js.undefined
  /**
    * Describes the invocation of the analysis tool.
    */
  var invocations: js.UndefOr[js.Array[Invocation]] = js.undefined
  /**
    * An array of logical locations such as namespaces, types or functions.
    */
  var logicalLocations: js.UndefOr[js.Array[LogicalLocation]] = js.undefined
  /**
    * The MIME type of all Markdown text message properties in the run. Default: "text/markdown;variant=GFM"
    */
  var markdownMessageMimeType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An ordered list of character sequences that were treated as line breaks when computing region information for
    * the run.
    */
  var newlineSequences: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The artifact location specified by each uriBaseId symbol on the machine where the tool originally ran.
    */
  var originalUriBaseIds: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ArtifactLocation]] = js.undefined
  /**
    * Key/value pairs that provide additional information about the run.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The string used to replace sensitive information in a redaction-aware property.
    */
  var redactionToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The set of results contained in an SARIF log. The results array can be omitted when a run is solely exporting
    * rules metadata. It must be present (but may be empty) if a log file represents an actual scan.
    */
  var results: js.UndefOr[js.Array[Result]] = js.undefined
  /**
    * Information about the tool or tool pipeline that generated the results in this run. A run can only contain
    * results produced by a single tool or tool pipeline. A run can aggregate results from multiple log files, as long
    * as context around the tool run (tool command-line arguments and the like) is identical for all aggregated files.
    */
  var tool: Tool
  /**
    * Specifies the revision in version control of the artifacts that were scanned.
    */
  var versionControlProvenance: js.UndefOr[js.Array[VersionControlDetails]] = js.undefined
}

