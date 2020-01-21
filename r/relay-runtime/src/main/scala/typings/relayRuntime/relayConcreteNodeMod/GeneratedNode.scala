package typings.relayRuntime.relayConcreteNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.AnonConnection
import typings.relayRuntime.normalizationNodeMod.NormalizationOperation
import typings.relayRuntime.normalizationNodeMod.NormalizationSelection
import typings.relayRuntime.readerNodeMod.ReaderArgumentDefinition
import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.readerNodeMod.ReaderSelection
import typings.relayRuntime.relayRuntimeStrings.InlineDataFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
  - typings.relayRuntime.readerNodeMod.ReaderFragment
  - typings.relayRuntime.readerNodeMod.ReaderInlineDataFragment
  - typings.relayRuntime.normalizationNodeMod.NormalizationSplitOperation
*/
trait GeneratedNode extends js.Object

object GeneratedNode {
  @scala.inline
  def ConcreteRequest(
    fragment: ReaderFragment,
    kind: String,
    operation: NormalizationOperation,
    params: RequestParameters
  ): GeneratedNode = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneratedNode]
  }
  @scala.inline
  def ReaderFragment(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: String,
    name: String,
    selections: js.Array[ReaderSelection],
    `type`: String,
    metadata: AnonConnection = null
  ): GeneratedNode = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedNode]
  }
  @scala.inline
  def ReaderInlineDataFragment(kind: InlineDataFragment, name: String): GeneratedNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneratedNode]
  }
  @scala.inline
  def NormalizationSplitOperation(
    kind: String,
    name: String,
    selections: js.Array[NormalizationSelection],
    metadata: StringDictionary[js.Any] = null
  ): GeneratedNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedNode]
  }
}

