package typings.relayRuntime.readerNodeMod

import typings.relayRuntime.anon.FragmentRefs
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.readerNodeMod.ReaderCondition
  - typings.relayRuntime.readerNodeMod.ReaderClientEdge
  - typings.relayRuntime.readerNodeMod.ReaderClientExtension
  - typings.relayRuntime.readerNodeMod.ReaderDefer
  - typings.relayRuntime.readerNodeMod.ReaderField
  - typings.relayRuntime.readerNodeMod.ReaderActorChange
  - typings.relayRuntime.readerNodeMod.ReaderFlightField
  - typings.relayRuntime.readerNodeMod.ReaderFragmentSpread
  - typings.relayRuntime.readerNodeMod.ReaderInlineDataFragmentSpread
  - typings.relayRuntime.readerNodeMod.ReaderInlineFragment
  - typings.relayRuntime.readerNodeMod.ReaderModuleImport
  - typings.relayRuntime.readerNodeMod.ReaderStream
  - typings.relayRuntime.readerNodeMod.ReaderRequiredField
  - typings.relayRuntime.readerNodeMod.ReaderRelayResolver
*/
trait ReaderSelection extends StObject
object ReaderSelection {
  
  inline def ReaderActorChange(fragmentSpread: ReaderFragmentSpread, kind: String, name: String): typings.relayRuntime.readerNodeMod.ReaderActorChange = {
    val __obj = js.Dynamic.literal(fragmentSpread = fragmentSpread.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderActorChange]
  }
  
  inline def ReaderClientEdge(
    backingField: ReaderRelayResolver | ReaderClientExtension,
    kind: String,
    linkedField: ReaderLinkedField,
    operation: ConcreteRequest
  ): typings.relayRuntime.readerNodeMod.ReaderClientEdge = {
    val __obj = js.Dynamic.literal(backingField = backingField.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], linkedField = linkedField.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderClientEdge]
  }
  
  inline def ReaderClientExtension(kind: String, selections: js.Array[ReaderSelection]): typings.relayRuntime.readerNodeMod.ReaderClientExtension = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderClientExtension]
  }
  
  inline def ReaderCondition(condition: String, kind: String, passingValue: Boolean, selections: js.Array[ReaderSelection]): typings.relayRuntime.readerNodeMod.ReaderCondition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderCondition]
  }
  
  inline def ReaderDefer(kind: String, selections: js.Array[ReaderSelection]): typings.relayRuntime.readerNodeMod.ReaderDefer = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderDefer]
  }
  
  inline def ReaderFlightField(kind: String, name: String): typings.relayRuntime.readerNodeMod.ReaderFlightField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderFlightField]
  }
  
  inline def ReaderFragmentSpread(kind: String, name: String): typings.relayRuntime.readerNodeMod.ReaderFragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderFragmentSpread]
  }
  
  inline def ReaderInlineDataFragmentSpread(kind: String, name: String, selections: js.Array[ReaderSelection]): typings.relayRuntime.readerNodeMod.ReaderInlineDataFragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderInlineDataFragmentSpread]
  }
  
  inline def ReaderInlineFragment(kind: String, selections: js.Array[ReaderSelection], `type`: String): typings.relayRuntime.readerNodeMod.ReaderInlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderInlineFragment]
  }
  
  inline def ReaderLinkedField(kind: String, name: String, plural: Boolean, selections: js.Array[ReaderSelection]): typings.relayRuntime.readerNodeMod.ReaderLinkedField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderLinkedField]
  }
  
  inline def ReaderModuleImport(documentName: String, fragmentName: String, fragmentPropName: String, kind: String): typings.relayRuntime.readerNodeMod.ReaderModuleImport = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], fragmentName = fragmentName.asInstanceOf[js.Any], fragmentPropName = fragmentPropName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderModuleImport]
  }
  
  inline def ReaderRelayResolver(fragment: ReaderFragmentSpread, kind: String, name: String, resolverModule: FragmentRefs => Any): typings.relayRuntime.readerNodeMod.ReaderRelayResolver = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resolverModule = js.Any.fromFunction1(resolverModule))
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderRelayResolver]
  }
  
  inline def ReaderRequiredField(action: RequiredFieldAction, field: ReaderField, kind: String, path: String): typings.relayRuntime.readerNodeMod.ReaderRequiredField = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderRequiredField]
  }
  
  inline def ReaderScalarField(kind: String, name: String): typings.relayRuntime.readerNodeMod.ReaderScalarField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderScalarField]
  }
  
  inline def ReaderStream(kind: String, selections: js.Array[ReaderSelection]): typings.relayRuntime.readerNodeMod.ReaderStream = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderStream]
  }
}
