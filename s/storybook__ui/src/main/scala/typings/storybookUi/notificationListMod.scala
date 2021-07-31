package typings.storybookUi

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.storybookUi.anon.ClearNotification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationListMod extends Shortcut {
  
  @JSImport("@storybook/ui/dist/components/notifications/NotificationList", JSImport.Default)
  @js.native
  val default: FunctionComponent[ClearNotification] = js.native
  
  type _To = FunctionComponent[ClearNotification]
  
  /* This means you don't have to write `default`, but can instead just say `notificationListMod.foo` */
  override def _to: FunctionComponent[ClearNotification] = default
}
