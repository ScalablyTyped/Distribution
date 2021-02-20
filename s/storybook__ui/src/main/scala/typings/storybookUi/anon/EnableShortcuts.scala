package typings.storybookUi.anon

import typings.downshift.mod.GetItemPropsOptions
import typings.downshift.mod.GetMenuPropsOptions
import typings.downshift.mod.GetPropsCommonOptions
import typings.storybookUi.sidebarTypesMod.DownshiftItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableShortcuts extends StObject {
  
  def closeMenu(): Unit = js.native
  def closeMenu(cb: js.Function0[Unit]): Unit = js.native
  
  var enableShortcuts: js.UndefOr[Boolean] = js.native
  
  def getItemProps(options: GetItemPropsOptions[DownshiftItem]): js.Any = js.native
  
  def getMenuProps(): js.Any = js.native
  def getMenuProps(options: js.UndefOr[scala.Nothing], otherOptions: GetPropsCommonOptions): js.Any = js.native
  def getMenuProps(options: GetMenuPropsOptions): js.Any = js.native
  def getMenuProps(options: GetMenuPropsOptions, otherOptions: GetPropsCommonOptions): js.Any = js.native
  
  var highlightedIndex: Double = js.native
  
  var isLoading: js.UndefOr[Boolean] = js.native
  
  var query: String = js.native
  
  var results: js.Array[DownshiftItem] = js.native
}
