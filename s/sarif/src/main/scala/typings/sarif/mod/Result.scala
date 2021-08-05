package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sarif.mod.Result.baselineState
import typings.sarif.mod.Result.kind
import typings.sarif.mod.Result.level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  /**
    * Identifies the artifact that the analysis tool was instructed to scan. This need not be the same as the artifact
    * where the result actually occurred.
    */
  var analysisTarget: js.UndefOr[ArtifactLocation] = js.undefined
  
  /**
    * A set of artifacts relevant to the result.
    */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /**
    * The state of a result relative to a baseline of a previous run.
    */
  var baselineState: js.UndefOr[baselineState] = js.undefined
  
  /**
    * An array of 'codeFlow' objects relevant to the result.
    */
  var codeFlows: js.UndefOr[js.Array[CodeFlow]] = js.undefined
  
  /**
    * A stable, unique identifier for the equivalence class of logically identical results to which this result
    * belongs, in the form of a GUID.
    */
  var correlationGuid: js.UndefOr[String] = js.undefined
  
  /**
    * A set of strings each of which individually defines a stable, unique identity for the result.
    */
  var fingerprints: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * An array of 'fix' objects, each of which represents a proposed fix to the problem indicated by the result.
    */
  var fixes: js.UndefOr[js.Array[Fix]] = js.undefined
  
  /**
    * An array of one or more unique 'graphTraversal' objects.
    */
  var graphTraversals: js.UndefOr[js.Array[GraphTraversal]] = js.undefined
  
  /**
    * An array of zero or more unique graph objects associated with the result.
    */
  var graphs: js.UndefOr[js.Array[Graph]] = js.undefined
  
  /**
    * A stable, unique identifer for the result in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.undefined
  
  /**
    * An absolute URI at which the result can be viewed.
    */
  var hostedViewerUri: js.UndefOr[String] = js.undefined
  
  /**
    * A value that categorizes results by evaluation state.
    */
  var kind: js.UndefOr[kind] = js.undefined
  
  /**
    * A value specifying the severity level of the result.
    */
  var level: js.UndefOr[level] = js.undefined
  
  /**
    * The set of locations where the result was detected. Specify only one location unless the problem indicated by
    * the result can only be corrected by making a change at every specified location.
    */
  var locations: js.UndefOr[js.Array[Location]] = js.undefined
  
  /**
    * A message that describes the result. The first sentence of the message only will be displayed when visible space
    * is limited.
    */
  var message: Message
  
  /**
    * A positive integer specifying the number of times this logically unique result was observed in this run.
    */
  var occurrenceCount: js.UndefOr[Double] = js.undefined
  
  /**
    * A set of strings that contribute to the stable, unique identity of the result.
    */
  var partialFingerprints: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the result.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * Information about how and when the result was detected.
    */
  var provenance: js.UndefOr[ResultProvenance] = js.undefined
  
  /**
    * A number representing the priority or importance of the result.
    */
  var rank: js.UndefOr[Double] = js.undefined
  
  /**
    * A set of locations relevant to this result.
    */
  var relatedLocations: js.UndefOr[js.Array[Location]] = js.undefined
  
  /**
    * A reference used to locate the rule descriptor relevant to this result.
    */
  var rule: js.UndefOr[ReportingDescriptorReference] = js.undefined
  
  /**
    * The stable, unique identifier of the rule, if any, to which this notification is relevant. This member can be
    * used to retrieve rule metadata from the rules dictionary, if it exists.
    */
  var ruleId: js.UndefOr[String] = js.undefined
  
  /**
    * The index within the tool component rules array of the rule object associated with this result.
    */
  var ruleIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of 'stack' objects relevant to the result.
    */
  var stacks: js.UndefOr[js.Array[Stack]] = js.undefined
  
  /**
    * A set of suppressions relevant to this result.
    */
  var suppressions: js.UndefOr[js.Array[Suppression]] = js.undefined
  
  /**
    * An array of references to taxonomy reporting descriptors that are applicable to the result.
    */
  var taxa: js.UndefOr[js.Array[ReportingDescriptorReference]] = js.undefined
  
  /**
    * A web request associated with this result.
    */
  var webRequest: js.UndefOr[WebRequest] = js.undefined
  
  /**
    * A web response associated with this result.
    */
  var webResponse: js.UndefOr[WebResponse] = js.undefined
  
  /**
    * The URIs of the work items associated with this result.
    */
  var workItemUris: js.UndefOr[js.Array[String]] = js.undefined
}
object Result {
  
  inline def apply(message: Message): Result = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  extension [Self <: Result](x: Self) {
    
    inline def setAnalysisTarget(value: ArtifactLocation): Self = StObject.set(x, "analysisTarget", value.asInstanceOf[js.Any])
    
    inline def setAnalysisTargetUndefined: Self = StObject.set(x, "analysisTarget", js.undefined)
    
    inline def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    inline def setBaselineState(value: baselineState): Self = StObject.set(x, "baselineState", value.asInstanceOf[js.Any])
    
    inline def setBaselineStateUndefined: Self = StObject.set(x, "baselineState", js.undefined)
    
    inline def setCodeFlows(value: js.Array[CodeFlow]): Self = StObject.set(x, "codeFlows", value.asInstanceOf[js.Any])
    
    inline def setCodeFlowsUndefined: Self = StObject.set(x, "codeFlows", js.undefined)
    
    inline def setCodeFlowsVarargs(value: CodeFlow*): Self = StObject.set(x, "codeFlows", js.Array(value :_*))
    
    inline def setCorrelationGuid(value: String): Self = StObject.set(x, "correlationGuid", value.asInstanceOf[js.Any])
    
    inline def setCorrelationGuidUndefined: Self = StObject.set(x, "correlationGuid", js.undefined)
    
    inline def setFingerprints(value: StringDictionary[String]): Self = StObject.set(x, "fingerprints", value.asInstanceOf[js.Any])
    
    inline def setFingerprintsUndefined: Self = StObject.set(x, "fingerprints", js.undefined)
    
    inline def setFixes(value: js.Array[Fix]): Self = StObject.set(x, "fixes", value.asInstanceOf[js.Any])
    
    inline def setFixesUndefined: Self = StObject.set(x, "fixes", js.undefined)
    
    inline def setFixesVarargs(value: Fix*): Self = StObject.set(x, "fixes", js.Array(value :_*))
    
    inline def setGraphTraversals(value: js.Array[GraphTraversal]): Self = StObject.set(x, "graphTraversals", value.asInstanceOf[js.Any])
    
    inline def setGraphTraversalsUndefined: Self = StObject.set(x, "graphTraversals", js.undefined)
    
    inline def setGraphTraversalsVarargs(value: GraphTraversal*): Self = StObject.set(x, "graphTraversals", js.Array(value :_*))
    
    inline def setGraphs(value: js.Array[Graph]): Self = StObject.set(x, "graphs", value.asInstanceOf[js.Any])
    
    inline def setGraphsUndefined: Self = StObject.set(x, "graphs", js.undefined)
    
    inline def setGraphsVarargs(value: Graph*): Self = StObject.set(x, "graphs", js.Array(value :_*))
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setHostedViewerUri(value: String): Self = StObject.set(x, "hostedViewerUri", value.asInstanceOf[js.Any])
    
    inline def setHostedViewerUriUndefined: Self = StObject.set(x, "hostedViewerUri", js.undefined)
    
    inline def setKind(value: kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLevel(value: level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceCount(value: Double): Self = StObject.set(x, "occurrenceCount", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceCountUndefined: Self = StObject.set(x, "occurrenceCount", js.undefined)
    
    inline def setPartialFingerprints(value: StringDictionary[String]): Self = StObject.set(x, "partialFingerprints", value.asInstanceOf[js.Any])
    
    inline def setPartialFingerprintsUndefined: Self = StObject.set(x, "partialFingerprints", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setProvenance(value: ResultProvenance): Self = StObject.set(x, "provenance", value.asInstanceOf[js.Any])
    
    inline def setProvenanceUndefined: Self = StObject.set(x, "provenance", js.undefined)
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    inline def setRelatedLocations(value: js.Array[Location]): Self = StObject.set(x, "relatedLocations", value.asInstanceOf[js.Any])
    
    inline def setRelatedLocationsUndefined: Self = StObject.set(x, "relatedLocations", js.undefined)
    
    inline def setRelatedLocationsVarargs(value: Location*): Self = StObject.set(x, "relatedLocations", js.Array(value :_*))
    
    inline def setRule(value: ReportingDescriptorReference): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
    
    inline def setRuleIndex(value: Double): Self = StObject.set(x, "ruleIndex", value.asInstanceOf[js.Any])
    
    inline def setRuleIndexUndefined: Self = StObject.set(x, "ruleIndex", js.undefined)
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setStacks(value: js.Array[Stack]): Self = StObject.set(x, "stacks", value.asInstanceOf[js.Any])
    
    inline def setStacksUndefined: Self = StObject.set(x, "stacks", js.undefined)
    
    inline def setStacksVarargs(value: Stack*): Self = StObject.set(x, "stacks", js.Array(value :_*))
    
    inline def setSuppressions(value: js.Array[Suppression]): Self = StObject.set(x, "suppressions", value.asInstanceOf[js.Any])
    
    inline def setSuppressionsUndefined: Self = StObject.set(x, "suppressions", js.undefined)
    
    inline def setSuppressionsVarargs(value: Suppression*): Self = StObject.set(x, "suppressions", js.Array(value :_*))
    
    inline def setTaxa(value: js.Array[ReportingDescriptorReference]): Self = StObject.set(x, "taxa", value.asInstanceOf[js.Any])
    
    inline def setTaxaUndefined: Self = StObject.set(x, "taxa", js.undefined)
    
    inline def setTaxaVarargs(value: ReportingDescriptorReference*): Self = StObject.set(x, "taxa", js.Array(value :_*))
    
    inline def setWebRequest(value: WebRequest): Self = StObject.set(x, "webRequest", value.asInstanceOf[js.Any])
    
    inline def setWebRequestUndefined: Self = StObject.set(x, "webRequest", js.undefined)
    
    inline def setWebResponse(value: WebResponse): Self = StObject.set(x, "webResponse", value.asInstanceOf[js.Any])
    
    inline def setWebResponseUndefined: Self = StObject.set(x, "webResponse", js.undefined)
    
    inline def setWorkItemUris(value: js.Array[String]): Self = StObject.set(x, "workItemUris", value.asInstanceOf[js.Any])
    
    inline def setWorkItemUrisUndefined: Self = StObject.set(x, "workItemUris", js.undefined)
    
    inline def setWorkItemUrisVarargs(value: String*): Self = StObject.set(x, "workItemUris", js.Array(value :_*))
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sarif.sarifStrings.`new`
    - typings.sarif.sarifStrings.unchanged
    - typings.sarif.sarifStrings.updated
    - typings.sarif.sarifStrings.absent
  */
  trait baselineState extends StObject
  object baselineState {
    
    inline def absent: typings.sarif.sarifStrings.absent = "absent".asInstanceOf[typings.sarif.sarifStrings.absent]
    
    inline def `new`: typings.sarif.sarifStrings.`new` = "new".asInstanceOf[typings.sarif.sarifStrings.`new`]
    
    inline def unchanged: typings.sarif.sarifStrings.unchanged = "unchanged".asInstanceOf[typings.sarif.sarifStrings.unchanged]
    
    inline def updated: typings.sarif.sarifStrings.updated = "updated".asInstanceOf[typings.sarif.sarifStrings.updated]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sarif.sarifStrings.notApplicable
    - typings.sarif.sarifStrings.pass
    - typings.sarif.sarifStrings.fail
    - typings.sarif.sarifStrings.review
    - typings.sarif.sarifStrings.open
    - typings.sarif.sarifStrings.informational
  */
  trait kind extends StObject
  object kind {
    
    inline def fail: typings.sarif.sarifStrings.fail = "fail".asInstanceOf[typings.sarif.sarifStrings.fail]
    
    inline def informational: typings.sarif.sarifStrings.informational = "informational".asInstanceOf[typings.sarif.sarifStrings.informational]
    
    inline def notApplicable: typings.sarif.sarifStrings.notApplicable = "notApplicable".asInstanceOf[typings.sarif.sarifStrings.notApplicable]
    
    inline def open: typings.sarif.sarifStrings.open = "open".asInstanceOf[typings.sarif.sarifStrings.open]
    
    inline def pass: typings.sarif.sarifStrings.pass = "pass".asInstanceOf[typings.sarif.sarifStrings.pass]
    
    inline def review: typings.sarif.sarifStrings.review = "review".asInstanceOf[typings.sarif.sarifStrings.review]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sarif.sarifStrings.none
    - typings.sarif.sarifStrings.note
    - typings.sarif.sarifStrings.warning
    - typings.sarif.sarifStrings.error
  */
  trait level extends StObject
  object level {
    
    inline def error: typings.sarif.sarifStrings.error = "error".asInstanceOf[typings.sarif.sarifStrings.error]
    
    inline def none: typings.sarif.sarifStrings.none = "none".asInstanceOf[typings.sarif.sarifStrings.none]
    
    inline def note: typings.sarif.sarifStrings.note = "note".asInstanceOf[typings.sarif.sarifStrings.note]
    
    inline def warning: typings.sarif.sarifStrings.warning = "warning".asInstanceOf[typings.sarif.sarifStrings.warning]
  }
}
