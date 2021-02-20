package typings.railsUjs

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csrfMod {
  
  @JSImport("@rails/ujs/utils/csrf", "CSRFProtection")
  @js.native
  def CSRFProtection(xhr: XMLHttpRequest): Unit = js.native
  
  @JSImport("@rails/ujs/utils/csrf", "csrfParam")
  @js.native
  def csrfParam(): String | Null = js.native
  
  @JSImport("@rails/ujs/utils/csrf", "csrfToken")
  @js.native
  def csrfToken(): String | Null = js.native
  
  @JSImport("@rails/ujs/utils/csrf", "refreshCSRFTokens")
  @js.native
  def refreshCSRFTokens(): Unit = js.native
}
