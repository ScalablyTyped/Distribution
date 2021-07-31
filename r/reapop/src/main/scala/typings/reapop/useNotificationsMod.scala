package typings.reapop

import typings.reapop.anon.DismissNotification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useNotificationsMod {
  
  @JSImport("reapop/dist/hooks/useNotifications", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useNotifications(): DismissNotification = ^.asInstanceOf[js.Dynamic].applyDynamic("useNotifications")().asInstanceOf[DismissNotification]
}
