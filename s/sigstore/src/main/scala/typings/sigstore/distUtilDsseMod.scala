package typings.sigstore

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilDsseMod {
  
  @JSImport("sigstore/dist/util/dsse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def preAuthEncoding(payloadType: String, payload: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("preAuthEncoding")(payloadType.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[Buffer]
}
