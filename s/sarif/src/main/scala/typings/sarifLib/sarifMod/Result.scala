package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /**
    * Identifies the file that the analysis tool was instructed to scan. This need not be the same as the file
    * where the result actually occurred.
    */
  var analysisTarget: js.UndefOr[FileLocation] = js.undefined
  /**
    * A set of files relevant to the result.
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
    * An array of physicalLocation objects which specify the portions of an analysis tool's output that a converter
    * transformed into the result object.
    */
  var conversionProvenance: js.UndefOr[js.Array[PhysicalLocation]] = js.undefined
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
    * A dictionary, each of whose keys is the id of a graph and each of whose values is a 'graph' object with that
    * id.
    */
  var graphs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Graph]] = js.undefined
  /**
    * A stable, unique identifer for the result in the form of a GUID.
    */
  var instanceGuid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A value specifying the severity level of the result.
    */
  var level: js.UndefOr[sarifLib.sarifMod.ResultNs.level] = js.undefined
  /**
    * One or more locations where the result occurred. Specify only one location unless the problem indicated by
    * the result can only be corrected by making a change at every specified location.
    */
  var locations: js.UndefOr[js.Array[Location]] = js.undefined
  /**
    * A message that describes the result. The first sentence of the message only will be displayed when visible
    * space is limited.
    */
  var message: js.UndefOr[Message] = js.undefined
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
    * A set of locations relevant to this result.
    */
  var relatedLocations: js.UndefOr[js.Array[Location]] = js.undefined
  /**
    * The stable, unique identifier of the rule (if any) to which this notification is relevant. This member can be
    * used to retrieve rule metadata from the rules dictionary, if it exists.
    */
  var ruleId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of 'stack' objects relevant to the result.
    */
  var stacks: js.UndefOr[js.Array[Stack]] = js.undefined
  /**
    * A set of flags indicating one or more suppression conditions.
    */
  var suppressionStates: js.UndefOr[js.Array[sarifLib.sarifMod.ResultNs.suppressionStates]] = js.undefined
  /**
    * The URIs of the work items associated with this result
    */
  var workItemUris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

