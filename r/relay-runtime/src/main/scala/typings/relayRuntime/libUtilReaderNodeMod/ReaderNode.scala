package typings.relayRuntime.libUtilReaderNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.libUtilReaderNodeMod.ReaderCondition
  - typings.relayRuntime.libUtilReaderNodeMod.ReaderLinkedField
  - typings.relayRuntime.libUtilReaderNodeMod.ReaderFragment
  - typings.relayRuntime.libUtilReaderNodeMod.ReaderInlineFragment
*/
trait ReaderNode extends StObject
object ReaderNode {
  
  inline def ReaderCondition(condition: String, kind: String, passingValue: Boolean, selections: js.Array[ReaderSelection]): typings.relayRuntime.libUtilReaderNodeMod.ReaderCondition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilReaderNodeMod.ReaderCondition]
  }
  
  inline def ReaderFragment(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: String,
    name: String,
    selections: js.Array[ReaderSelection],
    `type`: String
  ): typings.relayRuntime.libUtilReaderNodeMod.ReaderFragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilReaderNodeMod.ReaderFragment]
  }
  
  inline def ReaderInlineFragment(kind: String, selections: js.Array[ReaderSelection], `type`: String): typings.relayRuntime.libUtilReaderNodeMod.ReaderInlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilReaderNodeMod.ReaderInlineFragment]
  }
  
  inline def ReaderLinkedField(kind: String, name: String, plural: Boolean, selections: js.Array[ReaderSelection]): typings.relayRuntime.libUtilReaderNodeMod.ReaderLinkedField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilReaderNodeMod.ReaderLinkedField]
  }
}
