package typings.relayRuntime

import typings.relayRuntime.libUtilJsresourcereferenceMod.JSResourceReference
import typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilCreatePayloadFor3DFieldMod {
  
  @JSImport("relay-runtime/lib/util/createPayloadFor3DField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DocumentName /* <: String */, Response /* <: js.Object */](
    name: DocumentName,
    operation: JSResourceReference[NormalizationSplitOperation],
    component: JSResourceReference[Any],
    response: Response
  ): Local3DPayload[DocumentName, Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], component.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Local3DPayload[DocumentName, Response]]
  
  type Local3DPayload[DocumentName /* <: String */, Response /* <: js.Object */] = Response
}
