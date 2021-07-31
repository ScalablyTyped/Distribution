package typings.storybookAddonActions

import typings.storybookAddonActions.actionOptionsMod.ActionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configureActionsMod {
  
  @JSImport("@storybook/addon-actions/dist/preview/configureActions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/addon-actions/dist/preview/configureActions", "config")
  @js.native
  val config: ActionOptions = js.native
  
  @scala.inline
  def configureActions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureActions")().asInstanceOf[Unit]
  @scala.inline
  def configureActions(options: ActionOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureActions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
