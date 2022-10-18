package typings.railsUjs

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsCsrfMod {
  
  @JSImport("@rails/ujs/utils/csrf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CSRFProtection(xhr: XMLHttpRequest): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("CSRFProtection")(xhr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def csrfParam(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("csrfParam")().asInstanceOf[String | Null]
  
  inline def csrfToken(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("csrfToken")().asInstanceOf[String | Null]
  
  inline def refreshCSRFTokens(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshCSRFTokens")().asInstanceOf[Unit]
}
