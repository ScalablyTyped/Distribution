package typings.storybookUi.anon

import typings.storybookUi.sidebarTypesMod.DownshiftItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetItemProps extends js.Object {
  
  def closeMenu(): Unit = js.native
  def closeMenu(cb: js.Function0[Unit]): Unit = js.native
  
  var getItemProps: /* import warning: importer.ImportType#apply Failed type conversion: downshift.downshift.ControllerStateAndHelpers<@storybook/ui.@storybook/ui/dist/components/sidebar/types.DownshiftItem>['getItemProps'] */ js.Any = js.native
  
  var getMenuProps: /* import warning: importer.ImportType#apply Failed type conversion: downshift.downshift.ControllerStateAndHelpers<@storybook/ui.@storybook/ui/dist/components/sidebar/types.DownshiftItem>['getMenuProps'] */ js.Any = js.native
  
  var highlightedIndex: Double | Null = js.native
  
  var isBrowsing: Boolean = js.native
  
  var query: String = js.native
  
  var results: js.Array[DownshiftItem] = js.native
}
