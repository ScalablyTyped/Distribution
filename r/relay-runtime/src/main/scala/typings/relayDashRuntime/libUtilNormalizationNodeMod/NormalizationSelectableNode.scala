package typings.relayDashRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.relayDashRuntimeStrings.Defer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationDefer
  - typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationOperation
  - typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation
  - typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationStream
*/
trait NormalizationSelectableNode extends js.Object

object NormalizationSelectableNode {
  @scala.inline
  def NormalizationDefer(
    kind: Defer,
    label: String,
    selections: js.Array[NormalizationSelection],
    `if`: String = null,
    metadata: StringDictionary[js.Any] = null
  ): NormalizationSelectableNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (`if` != null) __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelectableNode]
  }
  @scala.inline
  def NormalizationOperation(
    argumentDefinitions: js.Array[NormalizationLocalArgument],
    kind: String,
    name: String,
    selections: js.Array[NormalizationSelection]
  ): NormalizationSelectableNode = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NormalizationSelectableNode]
  }
  @scala.inline
  def NormalizationSplitOperation(
    kind: String,
    name: String,
    selections: js.Array[NormalizationSelection],
    metadata: StringDictionary[js.Any] = null
  ): NormalizationSelectableNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelectableNode]
  }
  @scala.inline
  def NormalizationStream(
    kind: String,
    label: String,
    selections: js.Array[NormalizationSelection],
    `if`: String = null,
    metadata: StringDictionary[js.Any] = null
  ): NormalizationSelectableNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (`if` != null) __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelectableNode]
  }
}

