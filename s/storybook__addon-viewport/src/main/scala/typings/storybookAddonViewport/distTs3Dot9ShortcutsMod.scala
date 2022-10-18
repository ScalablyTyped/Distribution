package typings.storybookAddonViewport

import typings.storybookApi.mod.API
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ShortcutsMod {
  
  @JSImport("@storybook/addon-viewport/dist/ts3.9/shortcuts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerShortcuts(api: API, setState: Any, viewportsKeys: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerShortcuts")(api.asInstanceOf[js.Any], setState.asInstanceOf[js.Any], viewportsKeys.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
