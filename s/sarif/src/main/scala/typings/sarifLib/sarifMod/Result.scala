package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
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
  var baselineState: js.UndefOr[sarifLib.sarifMod.ResultNs.baselineState] = js.undefined
  /**
    * An array of 'codeFlow' objects relevant to the result.
    */
  var codeFlows: js.UndefOr[js.Array[CodeFlow]] = js.undefined
  /**
    * A stable, unique identifier for the equivalence class of logically identical results to which this result
    * belongs, in the form of a GUID.
    */
  var correlationGuid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A set of strings each of which individually defines a stable, unique identity for the result.
    */
  var fingerprints: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
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
  var guid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An absolute URI at which the result can be viewed.
    */
  var hostedViewerUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A value that categorizes results by evaluation state.
    */
  var kind: js.UndefOr[sarifLib.sarifMod.ResultNs.kind] = js.undefined
  /**
    * A value specifying the severity level of the result.
    */
  var level: js.UndefOr[sarifLib.sarifMod.ResultNs.level] = js.undefined
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
  var occurrenceCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * A set of strings that contribute to the stable, unique identity of the result.
    */
  var partialFingerprints: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
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
  var rank: js.UndefOr[scala.Double] = js.undefined
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
  var ruleId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The index within the tool component rules array of the rule object associated with this result.
    */
  var ruleIndex: js.UndefOr[scala.Double] = js.undefined
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
  var workItemUris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Result {
  @scala.inline
  def apply(
    message: Message,
    analysisTarget: ArtifactLocation = null,
    attachments: js.Array[Attachment] = null,
    baselineState: sarifLib.sarifMod.ResultNs.baselineState = null,
    codeFlows: js.Array[CodeFlow] = null,
    correlationGuid: java.lang.String = null,
    fingerprints: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    fixes: js.Array[Fix] = null,
    graphTraversals: js.Array[GraphTraversal] = null,
    graphs: js.Array[Graph] = null,
    guid: java.lang.String = null,
    hostedViewerUri: java.lang.String = null,
    kind: sarifLib.sarifMod.ResultNs.kind = null,
    level: sarifLib.sarifMod.ResultNs.level = null,
    locations: js.Array[Location] = null,
    occurrenceCount: scala.Int | scala.Double = null,
    partialFingerprints: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    properties: PropertyBag = null,
    provenance: ResultProvenance = null,
    rank: scala.Int | scala.Double = null,
    relatedLocations: js.Array[Location] = null,
    rule: ReportingDescriptorReference = null,
    ruleId: java.lang.String = null,
    ruleIndex: scala.Int | scala.Double = null,
    stacks: js.Array[Stack] = null,
    suppressions: js.Array[Suppression] = null,
    taxa: js.Array[ReportingDescriptorReference] = null,
    webRequest: WebRequest = null,
    webResponse: WebResponse = null,
    workItemUris: js.Array[java.lang.String] = null
  ): Result = {
    val __obj = js.Dynamic.literal(message = message)
    if (analysisTarget != null) __obj.updateDynamic("analysisTarget")(analysisTarget)
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (baselineState != null) __obj.updateDynamic("baselineState")(baselineState)
    if (codeFlows != null) __obj.updateDynamic("codeFlows")(codeFlows)
    if (correlationGuid != null) __obj.updateDynamic("correlationGuid")(correlationGuid)
    if (fingerprints != null) __obj.updateDynamic("fingerprints")(fingerprints)
    if (fixes != null) __obj.updateDynamic("fixes")(fixes)
    if (graphTraversals != null) __obj.updateDynamic("graphTraversals")(graphTraversals)
    if (graphs != null) __obj.updateDynamic("graphs")(graphs)
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (hostedViewerUri != null) __obj.updateDynamic("hostedViewerUri")(hostedViewerUri)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (level != null) __obj.updateDynamic("level")(level)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    if (occurrenceCount != null) __obj.updateDynamic("occurrenceCount")(occurrenceCount.asInstanceOf[js.Any])
    if (partialFingerprints != null) __obj.updateDynamic("partialFingerprints")(partialFingerprints)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (provenance != null) __obj.updateDynamic("provenance")(provenance)
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    if (relatedLocations != null) __obj.updateDynamic("relatedLocations")(relatedLocations)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    if (ruleId != null) __obj.updateDynamic("ruleId")(ruleId)
    if (ruleIndex != null) __obj.updateDynamic("ruleIndex")(ruleIndex.asInstanceOf[js.Any])
    if (stacks != null) __obj.updateDynamic("stacks")(stacks)
    if (suppressions != null) __obj.updateDynamic("suppressions")(suppressions)
    if (taxa != null) __obj.updateDynamic("taxa")(taxa)
    if (webRequest != null) __obj.updateDynamic("webRequest")(webRequest)
    if (webResponse != null) __obj.updateDynamic("webResponse")(webResponse)
    if (workItemUris != null) __obj.updateDynamic("workItemUris")(workItemUris)
    __obj.asInstanceOf[Result]
  }
}

