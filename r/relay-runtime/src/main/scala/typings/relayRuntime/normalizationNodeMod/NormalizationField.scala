package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.FragmentName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.normalizationNodeMod.NormalizationScalarField
  - typings.relayRuntime.normalizationNodeMod.NormalizationLinkedField
  - typings.relayRuntime.normalizationNodeMod.NormalizationMatchField
*/
trait NormalizationField
  extends StObject
     with NormalizationSelection
object NormalizationField {
  
  @scala.inline
  def NormalizationLinkedField(
    args: js.Array[NormalizationArgument],
    kind: String,
    name: String,
    plural: Boolean,
    selections: js.Array[NormalizationSelection]
  ): typings.relayRuntime.normalizationNodeMod.NormalizationLinkedField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationLinkedField]
  }
  
  @scala.inline
  def NormalizationMatchField(
    args: js.Array[NormalizationArgument],
    kind: String,
    matchesByType: StringDictionary[FragmentName],
    name: String
  ): typings.relayRuntime.normalizationNodeMod.NormalizationMatchField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], matchesByType = matchesByType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationMatchField]
  }
  
  @scala.inline
  def NormalizationScalarField(kind: String, name: String): typings.relayRuntime.normalizationNodeMod.NormalizationScalarField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationScalarField]
  }
}
