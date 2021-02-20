package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ClientContext")
@js.native
class ClientContext ()
  extends typings.sharepoint.SP.ClientContext {
  def this(serverRelativeUrlOrFullUrl: String) = this()
}
object ClientContext {
  
  /* static member */
  @JSGlobal("SP.ClientContext.get_current")
  @js.native
  def getCurrent(): typings.sharepoint.SP.ClientContext = js.native
}
