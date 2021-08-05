package typings.storybookUi

import typings.storybookApi.mod.API
import typings.storybookUi.anon.OnClick
import typings.storybookUi.anon.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containersMenuMod {
  
  @JSImport("@storybook/ui/dist/containers/menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMenu(api: API, isFullscreen: Boolean, showPanel: Boolean, showNav: Boolean, enableShortcuts: Boolean): js.Array[OnClick | Title] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMenu")(api.asInstanceOf[js.Any], isFullscreen.asInstanceOf[js.Any], showPanel.asInstanceOf[js.Any], showNav.asInstanceOf[js.Any], enableShortcuts.asInstanceOf[js.Any])).asInstanceOf[js.Array[OnClick | Title]]
}
