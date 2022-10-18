package typings.relayRuntime.libUtilNormalizationNodeMod

import typings.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
  - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation
*/
trait NormalizationRootNode extends StObject
object NormalizationRootNode {
  
  inline def ConcreteRequest(
    fragment: ReaderFragment,
    kind: String,
    operation: NormalizationOperation,
    params: RequestParameters
  ): typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest]
  }
  
  inline def NormalizationSplitOperation(kind: String, name: String, selections: js.Array[NormalizationSelection]): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation]
  }
}
