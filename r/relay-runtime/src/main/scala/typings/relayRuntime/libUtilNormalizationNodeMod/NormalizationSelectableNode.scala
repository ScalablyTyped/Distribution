package typings.relayRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationDefer
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedField
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationOperation
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationStream
*/
trait NormalizationSelectableNode extends StObject
object NormalizationSelectableNode {
  
  inline def NormalizationDefer(kind: String, label: String, selections: js.Array[NormalizationSelection]): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationDefer = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(null)
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationDefer]
  }
  
  inline def NormalizationLinkedField(kind: String, name: String, plural: Boolean, selections: js.Array[NormalizationSelection]): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedField]
  }
  
  inline def NormalizationOperation(
    argumentDefinitions: js.Array[NormalizationLocalArgumentDefinition],
    kind: String,
    name: String,
    selections: js.Array[NormalizationSelection]
  ): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationOperation = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationOperation]
  }
  
  inline def NormalizationSplitOperation(kind: String, name: String, selections: js.Array[NormalizationSelection]): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation]
  }
  
  inline def NormalizationStream(kind: String, label: String, selections: js.Array[NormalizationSelection]): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationStream = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(null)
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationStream]
  }
}
