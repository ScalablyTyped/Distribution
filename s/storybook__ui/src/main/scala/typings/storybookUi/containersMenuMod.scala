package typings.storybookUi

import typings.storybookApi.mod.API
import typings.storybookUi.anon.OnClick
import typings.storybookUi.anon.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/containers/menu", JSImport.Namespace)
@js.native
object containersMenuMod extends js.Object {
  
  def useMenu(api: API, isFullscreen: Boolean, showPanel: Boolean, showNav: Boolean, enableShortcuts: Boolean): js.Array[OnClick | Title] = js.native
}
