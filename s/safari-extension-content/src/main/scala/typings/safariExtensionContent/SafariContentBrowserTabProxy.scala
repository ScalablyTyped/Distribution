package typings.safariExtensionContent

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafariContentBrowserTabProxy extends StObject {
  
  def canLoad(event: Any, message: Any): Any = js.native
  
  def dispatchMessage(name: String): Unit = js.native
  def dispatchMessage(name: String, message: Any): Unit = js.native
  
  def setContextMenuEventUserInfo(event: MouseEvent, userInfo: Any): Unit = js.native
}
