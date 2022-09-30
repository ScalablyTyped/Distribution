package typings.secureToken

import typings.node.bufferMod.global.Buffer
import typings.secureToken.secureTokenInts.`16`
import typings.secureToken.secureTokenInts.`18`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("secure-token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("secure-token", "APPTOKEN_BYTES")
  @js.native
  val APPTOKEN_BYTES: `18` = js.native
  
  @JSImport("secure-token", "APPTOKEN_BYTES_MIN")
  @js.native
  val APPTOKEN_BYTES_MIN: `16` = js.native
  
  inline def create(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Buffer]
  inline def create(/** @default 18 */
  size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def hash(tokenBuffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(tokenBuffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def hash(tokenBuffer: Buffer, namespace: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(tokenBuffer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def hash(tokenBuffer: Buffer, namespace: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(tokenBuffer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Buffer]
}
