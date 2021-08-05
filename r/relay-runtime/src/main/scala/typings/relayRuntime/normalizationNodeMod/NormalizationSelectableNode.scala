package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.normalizationNodeMod.NormalizationDefer
  - typings.relayRuntime.normalizationNodeMod.NormalizationLinkedField
  - typings.relayRuntime.normalizationNodeMod.NormalizationOperation
  - typings.relayRuntime.normalizationNodeMod.NormalizationSplitOperation
  - typings.relayRuntime.normalizationNodeMod.NormalizationStream
*/
trait NormalizationSelectableNode extends StObject
object NormalizationSelectableNode {
  
  inline def NormalizationDefer(label: String, selections: js.Array[NormalizationSelection]): typings.relayRuntime.normalizationNodeMod.NormalizationDefer = {
    val __obj = js.Dynamic.literal(kind = "Defer", label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(null)
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationDefer]
  }
  
  inline def NormalizationLinkedField(
    args: js.Array[NormalizationArgument],
    kind: String,
    name: String,
    plural: Boolean,
    selections: js.Array[NormalizationSelection]
  ): typings.relayRuntime.normalizationNodeMod.NormalizationLinkedField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationLinkedField]
  }
  
  inline def NormalizationOperation(
    argumentDefinitions: js.Array[NormalizationLocalArgumentDefinition],
    kind: String,
    name: String,
    selections: js.Array[NormalizationSelection]
  ): typings.relayRuntime.normalizationNodeMod.NormalizationOperation = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationOperation]
  }
  
  inline def NormalizationSplitOperation(kind: String, name: String, selections: js.Array[NormalizationSelection]): typings.relayRuntime.normalizationNodeMod.NormalizationSplitOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationSplitOperation]
  }
  
  inline def NormalizationStream(kind: String, label: String, selections: js.Array[NormalizationSelection]): typings.relayRuntime.normalizationNodeMod.NormalizationStream = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(null)
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationStream]
  }
}
