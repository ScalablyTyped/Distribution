package typings.reactColorful

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsNonceMod {
  
  @JSImport("react-colorful/dist/utils/nonce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNonce(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNonce")().asInstanceOf[js.UndefOr[String]]
  
  inline def setNonce(hash: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNonce")(hash.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
