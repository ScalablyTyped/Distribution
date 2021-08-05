package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.FragmentName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.normalizationNodeMod.NormalizationCondition
  - typings.relayRuntime.normalizationNodeMod.NormalizationClientExtension
  - typings.relayRuntime.normalizationNodeMod.NormalizationDefer
  - typings.relayRuntime.normalizationNodeMod.NormalizationField
  - typings.relayRuntime.normalizationNodeMod.NormalizationHandle
  - typings.relayRuntime.normalizationNodeMod.NormalizationInlineFragment
  - typings.relayRuntime.normalizationNodeMod.NormalizationModuleImport
  - typings.relayRuntime.normalizationNodeMod.NormalizationStream
  - typings.relayRuntime.normalizationNodeMod.NormalizationTypeDiscriminator
*/
trait NormalizationSelection extends StObject
object NormalizationSelection {
  
  inline def NormalizationClientExtension(kind: String, selections: js.Array[NormalizationSelection]): typings.relayRuntime.normalizationNodeMod.NormalizationClientExtension = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationClientExtension]
  }
  
  inline def NormalizationCondition(
    condition: String,
    kind: String,
    passingValue: Boolean,
    selections: js.Array[NormalizationSelection]
  ): typings.relayRuntime.normalizationNodeMod.NormalizationCondition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationCondition]
  }
  
  inline def NormalizationDefer(label: String, selections: js.Array[NormalizationSelection]): typings.relayRuntime.normalizationNodeMod.NormalizationDefer = {
    val __obj = js.Dynamic.literal(kind = "Defer", label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(null)
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationDefer]
  }
  
  inline def NormalizationInlineFragment(kind: String, selections: js.Array[NormalizationSelection], `type`: String): typings.relayRuntime.normalizationNodeMod.NormalizationInlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationInlineFragment]
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
  
  inline def NormalizationLinkedHandle(handle: String, key: String, kind: String, name: String): typings.relayRuntime.normalizationNodeMod.NormalizationLinkedHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationLinkedHandle]
  }
  
  inline def NormalizationMatchField(
    args: js.Array[NormalizationArgument],
    kind: String,
    matchesByType: StringDictionary[FragmentName],
    name: String
  ): typings.relayRuntime.normalizationNodeMod.NormalizationMatchField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], matchesByType = matchesByType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationMatchField]
  }
  
  inline def NormalizationModuleImport(documentName: String, fragmentName: String, fragmentPropName: String, kind: String): typings.relayRuntime.normalizationNodeMod.NormalizationModuleImport = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], fragmentName = fragmentName.asInstanceOf[js.Any], fragmentPropName = fragmentPropName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationModuleImport]
  }
  
  inline def NormalizationScalarField(kind: String, name: String): typings.relayRuntime.normalizationNodeMod.NormalizationScalarField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationScalarField]
  }
  
  inline def NormalizationScalarHandle(handle: String, key: String, kind: String, name: String): typings.relayRuntime.normalizationNodeMod.NormalizationScalarHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationScalarHandle]
  }
  
  inline def NormalizationStream(kind: String, label: String, selections: js.Array[NormalizationSelection]): typings.relayRuntime.normalizationNodeMod.NormalizationStream = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(null)
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationStream]
  }
  
  inline def NormalizationTypeDiscriminator(abstractKey: String, kind: String): typings.relayRuntime.normalizationNodeMod.NormalizationTypeDiscriminator = {
    val __obj = js.Dynamic.literal(abstractKey = abstractKey.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationTypeDiscriminator]
  }
}
