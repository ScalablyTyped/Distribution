package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.FragmentName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.readerNodeMod.ReaderCondition
  - typings.relayRuntime.readerNodeMod.ReaderClientExtension
  - typings.relayRuntime.readerNodeMod.ReaderField
  - typings.relayRuntime.readerNodeMod.ReaderFragmentSpread
  - typings.relayRuntime.readerNodeMod.ReaderInlineFragment
  - typings.relayRuntime.readerNodeMod.ReaderMatchField
*/
trait ReaderSelection extends StObject
object ReaderSelection {
  
  inline def ReaderClientExtension(kind: String, selections: js.Array[ReaderSelection]): typings.relayRuntime.readerNodeMod.ReaderClientExtension = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderClientExtension]
  }
  
  inline def ReaderCondition(condition: String, kind: String, passingValue: Boolean, selections: js.Array[ReaderSelection]): typings.relayRuntime.readerNodeMod.ReaderCondition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderCondition]
  }
  
  inline def ReaderFragmentSpread(kind: String, name: String): typings.relayRuntime.readerNodeMod.ReaderFragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderFragmentSpread]
  }
  
  inline def ReaderInlineFragment(kind: String, selections: js.Array[ReaderSelection], `type`: String): typings.relayRuntime.readerNodeMod.ReaderInlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderInlineFragment]
  }
  
  inline def ReaderLinkedField(
    args: js.Array[ReaderArgument],
    kind: String,
    name: String,
    plural: Boolean,
    selections: js.Array[ReaderSelection]
  ): typings.relayRuntime.readerNodeMod.ReaderLinkedField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderLinkedField]
  }
  
  inline def ReaderMatchField(kind: String, matchesByType: StringDictionary[FragmentName], name: String): typings.relayRuntime.readerNodeMod.ReaderMatchField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], matchesByType = matchesByType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderMatchField]
  }
  
  inline def ReaderScalarField(kind: String, name: String): typings.relayRuntime.readerNodeMod.ReaderScalarField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderScalarField]
  }
}
