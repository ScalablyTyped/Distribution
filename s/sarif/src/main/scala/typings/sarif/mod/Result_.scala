package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sarif.mod.Result.baselineState
import typings.sarif.mod.Result.kind
import typings.sarif.mod.Result.level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result_ extends js.Object {
  /**
    * Identifies the artifact that the analysis tool was instructed to scan. This need not be the same as the artifact
    * where the result actually occurred.
    */
  var analysisTarget: js.UndefOr[ArtifactLocation] = js.native
  /**
    * A set of artifacts relevant to the result.
    */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.native
  /**
    * The state of a result relative to a baseline of a previous run.
    */
  var baselineState: js.UndefOr[baselineState] = js.native
  /**
    * An array of 'codeFlow' objects relevant to the result.
    */
  var codeFlows: js.UndefOr[js.Array[CodeFlow]] = js.native
  /**
    * A stable, unique identifier for the equivalence class of logically identical results to which this result
    * belongs, in the form of a GUID.
    */
  var correlationGuid: js.UndefOr[String] = js.native
  /**
    * A set of strings each of which individually defines a stable, unique identity for the result.
    */
  var fingerprints: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * An array of 'fix' objects, each of which represents a proposed fix to the problem indicated by the result.
    */
  var fixes: js.UndefOr[js.Array[Fix]] = js.native
  /**
    * An array of one or more unique 'graphTraversal' objects.
    */
  var graphTraversals: js.UndefOr[js.Array[GraphTraversal]] = js.native
  /**
    * An array of zero or more unique graph objects associated with the result.
    */
  var graphs: js.UndefOr[js.Array[Graph]] = js.native
  /**
    * A stable, unique identifer for the result in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.native
  /**
    * An absolute URI at which the result can be viewed.
    */
  var hostedViewerUri: js.UndefOr[String] = js.native
  /**
    * A value that categorizes results by evaluation state.
    */
  var kind: js.UndefOr[kind] = js.native
  /**
    * A value specifying the severity level of the result.
    */
  var level: js.UndefOr[level] = js.native
  /**
    * The set of locations where the result was detected. Specify only one location unless the problem indicated by
    * the result can only be corrected by making a change at every specified location.
    */
  var locations: js.UndefOr[js.Array[Location]] = js.native
  /**
    * A message that describes the result. The first sentence of the message only will be displayed when visible space
    * is limited.
    */
  var message: Message = js.native
  /**
    * A positive integer specifying the number of times this logically unique result was observed in this run.
    */
  var occurrenceCount: js.UndefOr[Double] = js.native
  /**
    * A set of strings that contribute to the stable, unique identity of the result.
    */
  var partialFingerprints: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Key/value pairs that provide additional information about the result.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * Information about how and when the result was detected.
    */
  var provenance: js.UndefOr[ResultProvenance] = js.native
  /**
    * A number representing the priority or importance of the result.
    */
  var rank: js.UndefOr[Double] = js.native
  /**
    * A set of locations relevant to this result.
    */
  var relatedLocations: js.UndefOr[js.Array[Location]] = js.native
  /**
    * A reference used to locate the rule descriptor relevant to this result.
    */
  var rule: js.UndefOr[ReportingDescriptorReference] = js.native
  /**
    * The stable, unique identifier of the rule, if any, to which this notification is relevant. This member can be
    * used to retrieve rule metadata from the rules dictionary, if it exists.
    */
  var ruleId: js.UndefOr[String] = js.native
  /**
    * The index within the tool component rules array of the rule object associated with this result.
    */
  var ruleIndex: js.UndefOr[Double] = js.native
  /**
    * An array of 'stack' objects relevant to the result.
    */
  var stacks: js.UndefOr[js.Array[Stack]] = js.native
  /**
    * A set of suppressions relevant to this result.
    */
  var suppressions: js.UndefOr[js.Array[Suppression]] = js.native
  /**
    * An array of references to taxonomy reporting descriptors that are applicable to the result.
    */
  var taxa: js.UndefOr[js.Array[ReportingDescriptorReference]] = js.native
  /**
    * A web request associated with this result.
    */
  var webRequest: js.UndefOr[WebRequest] = js.native
  /**
    * A web response associated with this result.
    */
  var webResponse: js.UndefOr[WebResponse] = js.native
  /**
    * The URIs of the work items associated with this result.
    */
  var workItemUris: js.UndefOr[js.Array[String]] = js.native
}

object Result_ {
  @scala.inline
  def apply(message: Message): Result_ = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result_]
  }
  @scala.inline
  implicit class Result_Ops[Self <: Result_] (val x: Self) extends AnyVal {
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
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnalysisTarget(value: ArtifactLocation): Self = this.set("analysisTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalysisTarget: Self = this.set("analysisTarget", js.undefined)
    @scala.inline
    def setAttachmentsVarargs(value: Attachment*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[Attachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    @scala.inline
    def setBaselineState(value: baselineState): Self = this.set("baselineState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineState: Self = this.set("baselineState", js.undefined)
    @scala.inline
    def setCodeFlowsVarargs(value: CodeFlow*): Self = this.set("codeFlows", js.Array(value :_*))
    @scala.inline
    def setCodeFlows(value: js.Array[CodeFlow]): Self = this.set("codeFlows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeFlows: Self = this.set("codeFlows", js.undefined)
    @scala.inline
    def setCorrelationGuid(value: String): Self = this.set("correlationGuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorrelationGuid: Self = this.set("correlationGuid", js.undefined)
    @scala.inline
    def setFingerprints(value: StringDictionary[String]): Self = this.set("fingerprints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprints: Self = this.set("fingerprints", js.undefined)
    @scala.inline
    def setFixesVarargs(value: Fix*): Self = this.set("fixes", js.Array(value :_*))
    @scala.inline
    def setFixes(value: js.Array[Fix]): Self = this.set("fixes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixes: Self = this.set("fixes", js.undefined)
    @scala.inline
    def setGraphTraversalsVarargs(value: GraphTraversal*): Self = this.set("graphTraversals", js.Array(value :_*))
    @scala.inline
    def setGraphTraversals(value: js.Array[GraphTraversal]): Self = this.set("graphTraversals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphTraversals: Self = this.set("graphTraversals", js.undefined)
    @scala.inline
    def setGraphsVarargs(value: Graph*): Self = this.set("graphs", js.Array(value :_*))
    @scala.inline
    def setGraphs(value: js.Array[Graph]): Self = this.set("graphs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphs: Self = this.set("graphs", js.undefined)
    @scala.inline
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    @scala.inline
    def setHostedViewerUri(value: String): Self = this.set("hostedViewerUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostedViewerUri: Self = this.set("hostedViewerUri", js.undefined)
    @scala.inline
    def setKind(value: kind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLevel(value: level): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setLocationsVarargs(value: Location*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[Location]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    @scala.inline
    def setOccurrenceCount(value: Double): Self = this.set("occurrenceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOccurrenceCount: Self = this.set("occurrenceCount", js.undefined)
    @scala.inline
    def setPartialFingerprints(value: StringDictionary[String]): Self = this.set("partialFingerprints", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartialFingerprints: Self = this.set("partialFingerprints", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setProvenance(value: ResultProvenance): Self = this.set("provenance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvenance: Self = this.set("provenance", js.undefined)
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
    @scala.inline
    def setRelatedLocationsVarargs(value: Location*): Self = this.set("relatedLocations", js.Array(value :_*))
    @scala.inline
    def setRelatedLocations(value: js.Array[Location]): Self = this.set("relatedLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedLocations: Self = this.set("relatedLocations", js.undefined)
    @scala.inline
    def setRule(value: ReportingDescriptorReference): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
    @scala.inline
    def setRuleId(value: String): Self = this.set("ruleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleId: Self = this.set("ruleId", js.undefined)
    @scala.inline
    def setRuleIndex(value: Double): Self = this.set("ruleIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleIndex: Self = this.set("ruleIndex", js.undefined)
    @scala.inline
    def setStacksVarargs(value: Stack*): Self = this.set("stacks", js.Array(value :_*))
    @scala.inline
    def setStacks(value: js.Array[Stack]): Self = this.set("stacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStacks: Self = this.set("stacks", js.undefined)
    @scala.inline
    def setSuppressionsVarargs(value: Suppression*): Self = this.set("suppressions", js.Array(value :_*))
    @scala.inline
    def setSuppressions(value: js.Array[Suppression]): Self = this.set("suppressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressions: Self = this.set("suppressions", js.undefined)
    @scala.inline
    def setTaxaVarargs(value: ReportingDescriptorReference*): Self = this.set("taxa", js.Array(value :_*))
    @scala.inline
    def setTaxa(value: js.Array[ReportingDescriptorReference]): Self = this.set("taxa", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaxa: Self = this.set("taxa", js.undefined)
    @scala.inline
    def setWebRequest(value: WebRequest): Self = this.set("webRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebRequest: Self = this.set("webRequest", js.undefined)
    @scala.inline
    def setWebResponse(value: WebResponse): Self = this.set("webResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebResponse: Self = this.set("webResponse", js.undefined)
    @scala.inline
    def setWorkItemUrisVarargs(value: String*): Self = this.set("workItemUris", js.Array(value :_*))
    @scala.inline
    def setWorkItemUris(value: js.Array[String]): Self = this.set("workItemUris", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkItemUris: Self = this.set("workItemUris", js.undefined)
  }
  
}

