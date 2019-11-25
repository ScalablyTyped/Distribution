package typings.relayDashRuntime.libUtilRelayConcreteNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.Anon_Connection
import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationOperation
import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationSelection
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderArgumentDefinition
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderSelection
import typings.relayDashRuntime.relayDashRuntimeStrings.InlineDataFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayDashRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
  - typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
  - typings.relayDashRuntime.libUtilReaderNodeMod.ReaderInlineDataFragment
  - typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation
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
    metadata: Anon_Connection = null
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

