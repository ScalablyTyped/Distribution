package typings.relayRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationCondition
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationClientComponent
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationClientExtension
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationDefer
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationField
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationFlightField
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationFragmentSpread
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationHandle
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationInlineFragment
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationModuleImport
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationStream
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationActorChange
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationTypeDiscriminator
*/
trait NormalizationSelection extends StObject
object NormalizationSelection {
  
  inline def NormalizationActorChange(kind: String, linkedField: NormalizationLinkedField): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationActorChange = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], linkedField = linkedField.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationActorChange]
  }
  
  inline def NormalizationClientComponent(fragment: NormalizationNode, kind: String): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationClientComponent = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationClientComponent]
  }
  
  inline def NormalizationClientExtension(kind: String, selections: js.Array[NormalizationSelection]): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationClientExtension = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationClientExtension]
  }
  
  inline def NormalizationCondition(
    condition: String,
    kind: String,
    passingValue: Boolean,
    selections: js.Array[NormalizationSelection]
  ): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationCondition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationCondition]
  }
  
  inline def NormalizationDefer(kind: String, label: String, selections: js.Array[NormalizationSelection]): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationDefer = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(null)
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationDefer]
  }
  
  inline def NormalizationFlightField(kind: String, name: String): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationFlightField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationFlightField]
  }
  
  inline def NormalizationFragmentSpread(fragment: NormalizationSplitOperation, kind: String): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationFragmentSpread = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationFragmentSpread]
  }
  
  inline def NormalizationInlineFragment(kind: String, selections: js.Array[NormalizationSelection], `type`: String): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationInlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationInlineFragment]
  }
  
  inline def NormalizationLinkedField(kind: String, name: String, plural: Boolean, selections: js.Array[NormalizationSelection]): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedField]
  }
  
  inline def NormalizationLinkedHandle(handle: String, key: String, kind: String, name: String): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedHandle]
  }
  
  inline def NormalizationModuleImport(documentName: String, fragmentName: String, fragmentPropName: String, kind: String): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationModuleImport = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], fragmentName = fragmentName.asInstanceOf[js.Any], fragmentPropName = fragmentPropName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationModuleImport]
  }
  
  inline def NormalizationScalarField(kind: String, name: String): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationScalarField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationScalarField]
  }
  
  inline def NormalizationScalarHandle(handle: String, key: String, kind: String, name: String): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationScalarHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationScalarHandle]
  }
  
  inline def NormalizationStream(kind: String, label: String, selections: js.Array[NormalizationSelection]): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationStream = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(null)
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationStream]
  }
  
  inline def NormalizationTypeDiscriminator(abstractKey: String, kind: String): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationTypeDiscriminator = {
    val __obj = js.Dynamic.literal(abstractKey = abstractKey.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationTypeDiscriminator]
  }
}
