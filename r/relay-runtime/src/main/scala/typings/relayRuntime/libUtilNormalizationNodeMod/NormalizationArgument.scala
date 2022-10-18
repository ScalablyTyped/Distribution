package typings.relayRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationListValueArgument
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationLiteralArgument
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationObjectValueArgument
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationVariableArgument
*/
trait NormalizationArgument extends StObject
object NormalizationArgument {
  
  inline def NormalizationListValueArgument(items: js.Array[NormalizationArgument | Null], kind: String, name: String): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationListValueArgument = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationListValueArgument]
  }
  
  inline def NormalizationLiteralArgument(kind: String, name: String, value: Any): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationLiteralArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationLiteralArgument]
  }
  
  inline def NormalizationObjectValueArgument(fields: js.Array[NormalizationArgument], kind: String, name: String): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationObjectValueArgument = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationObjectValueArgument]
  }
  
  inline def NormalizationVariableArgument(kind: String, name: String, variableName: String): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationVariableArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationVariableArgument]
  }
}
