package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.readerNodeMod.ReaderFragment
  - typings.relayRuntime.readerNodeMod.ReaderSplitOperation
*/
trait ReaderSelectableNode extends js.Object

object ReaderSelectableNode {
  @scala.inline
  def ReaderFragment(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: String,
    name: String,
    selections: js.Array[ReaderSelection],
    `type`: String,
    metadata: js.UndefOr[Null | Connection] = js.undefined
  ): ReaderSelectableNode = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(metadata)) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderSelectableNode]
  }
  @scala.inline
  def ReaderSplitOperation(
    kind: String,
    name: String,
    selections: js.Array[ReaderSelection],
    metadata: js.UndefOr[Null | StringDictionary[js.Any]] = js.undefined
  ): ReaderSelectableNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (!js.isUndefined(metadata)) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderSelectableNode]
  }
}

