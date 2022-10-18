package typings.storybookAddonActions

import typings.storybookAddonActions.distTs3Dot9ModelsActionOptionsMod.ActionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9PreviewConfigureActionsMod {
  
  @JSImport("@storybook/addon-actions/dist/ts3.9/preview/configureActions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/addon-actions/dist/ts3.9/preview/configureActions", "config")
  @js.native
  val config: ActionOptions = js.native
  
  inline def configureActions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureActions")().asInstanceOf[Unit]
  inline def configureActions(options: ActionOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureActions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
