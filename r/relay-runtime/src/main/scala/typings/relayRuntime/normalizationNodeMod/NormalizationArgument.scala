package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.normalizationNodeMod.NormalizationLiteral
  - typings.relayRuntime.normalizationNodeMod.NormalizationVariable
*/
trait NormalizationArgument extends StObject
object NormalizationArgument {
  
  @scala.inline
  def NormalizationLiteral(kind: String, name: String): typings.relayRuntime.normalizationNodeMod.NormalizationLiteral = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationLiteral]
  }
  
  @scala.inline
  def NormalizationVariable(kind: String, name: String, variableName: String): typings.relayRuntime.normalizationNodeMod.NormalizationVariable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationVariable]
  }
}
