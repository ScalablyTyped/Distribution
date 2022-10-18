package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCodeConfigMod {
  
  @JSImport("snyk/dist/lib/code-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBase64Encoding(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getBase64Encoding")().asInstanceOf[Boolean]
  inline def getBase64Encoding(enabled: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getBase64Encoding")(enabled.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getCodeClientProxyUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodeClientProxyUrl")().asInstanceOf[String]
}
