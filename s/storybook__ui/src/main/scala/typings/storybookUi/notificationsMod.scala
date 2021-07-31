package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.storybookApi.mod.Combo
import typings.storybookUi.anon.Notifications
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationsMod {
  
  @JSImport("@storybook/ui/dist/containers/notifications", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/ui/dist/containers/notifications", JSImport.Default)
  @js.native
  val default: FunctionComponent[js.Any] = js.native
  
  @scala.inline
  def mapper(hasState: Combo): Notifications = ^.asInstanceOf[js.Dynamic].applyDynamic("mapper")(hasState.asInstanceOf[js.Any]).asInstanceOf[Notifications]
}
