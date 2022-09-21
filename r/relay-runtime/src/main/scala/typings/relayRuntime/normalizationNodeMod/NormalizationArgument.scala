package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.normalizationNodeMod.NormalizationListValueArgument
  - typings.relayRuntime.normalizationNodeMod.NormalizationLiteralArgument
  - typings.relayRuntime.normalizationNodeMod.NormalizationObjectValueArgument
  - typings.relayRuntime.normalizationNodeMod.NormalizationVariableArgument
*/
trait NormalizationArgument extends StObject
object NormalizationArgument {
  
  inline def NormalizationListValueArgument(items: js.Array[NormalizationArgument | Null], kind: String, name: String): typings.relayRuntime.normalizationNodeMod.NormalizationListValueArgument = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationListValueArgument]
  }
  
  inline def NormalizationLiteralArgument(kind: String, name: String, value: Any): typings.relayRuntime.normalizationNodeMod.NormalizationLiteralArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationLiteralArgument]
  }
  
  inline def NormalizationObjectValueArgument(fields: js.Array[NormalizationArgument], kind: String, name: String): typings.relayRuntime.normalizationNodeMod.NormalizationObjectValueArgument = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationObjectValueArgument]
  }
  
  inline def NormalizationVariableArgument(kind: String, name: String, variableName: String): typings.relayRuntime.normalizationNodeMod.NormalizationVariableArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationVariableArgument]
  }
}
