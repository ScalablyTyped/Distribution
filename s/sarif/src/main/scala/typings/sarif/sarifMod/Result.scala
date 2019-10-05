package typings.sarif.sarifMod

import org.scalablytyped.runtime.StringDictionary
import typings.sarif.sarifMod.Result.baselineState
import typings.sarif.sarifMod.Result.kind
import typings.sarif.sarifMod.Result.level
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

@JSImport("sarif", "Result")
@js.native
object Result extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.sarif.sarifStrings.`new`
    - typings.sarif.sarifStrings.unchanged
    - typings.sarif.sarifStrings.updated
    - typings.sarif.sarifStrings.absent
  */
  trait baselineState extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.sarif.sarifStrings.notApplicable
    - typings.sarif.sarifStrings.pass
    - typings.sarif.sarifStrings.fail
    - typings.sarif.sarifStrings.review
    - typings.sarif.sarifStrings.open
    - typings.sarif.sarifStrings.informational
  */
  trait kind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.sarif.sarifStrings.none
    - typings.sarif.sarifStrings.note
    - typings.sarif.sarifStrings.warning
    - typings.sarif.sarifStrings.error
  */
  trait level extends js.Object
  
}

