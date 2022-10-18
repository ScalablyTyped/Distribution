package typings.relayRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationFlightField
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationScalarField
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedField
*/
trait NormalizationField
  extends StObject
     with NormalizationSelection
object NormalizationField {
  
  inline def NormalizationFlightField(kind: String, name: String): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationFlightField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationFlightField]
  }
  
  inline def NormalizationLinkedField(kind: String, name: String, plural: Boolean, selections: js.Array[NormalizationSelection]): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedField]
  }
  
  inline def NormalizationScalarField(kind: String, name: String): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationScalarField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationScalarField]
  }
}
