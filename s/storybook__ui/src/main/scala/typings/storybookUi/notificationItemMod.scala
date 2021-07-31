package typings.storybookUi

import org.scalablytyped.runtime.Shortcut
import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.storybookTheming.typesMod.Theme
import typings.storybookUi.anon.Notification
import typings.storybookUi.anon.PickDetailedHTMLPropsHTML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationItemMod extends Shortcut {
  
  @JSImport("@storybook/ui/dist/components/notifications/NotificationItem", JSImport.Default)
  @js.native
  val default: FunctionComponent[Notification] = js.native
  
  @JSImport("@storybook/ui/dist/components/notifications/NotificationItem", "NotificationItemSpacer")
  @js.native
  val NotificationItemSpacer: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  type _To = FunctionComponent[Notification]
  
  /* This means you don't have to write `default`, but can instead just say `notificationItemMod.foo` */
  override def _to: FunctionComponent[Notification] = default
}
