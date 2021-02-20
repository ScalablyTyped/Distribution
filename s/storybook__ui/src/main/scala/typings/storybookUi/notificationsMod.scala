package typings.storybookUi

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.storybookApi.mod.Combo
import typings.storybookUi.anon.Notifications
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationsMod extends Shortcut {
  
  @JSImport("@storybook/ui/dist/containers/notifications", JSImport.Default)
  @js.native
  val default: FunctionComponent[js.Any] = js.native
  
  @JSImport("@storybook/ui/dist/containers/notifications", "mapper")
  @js.native
  def mapper(hasState: Combo): Notifications = js.native
  
  type _To = FunctionComponent[js.Any]
  
  /* This means you don't have to write `default`, but can instead just say `notificationsMod.foo` */
  override def _to: FunctionComponent[js.Any] = default
}
