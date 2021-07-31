package typings.storybookUi.anon

import typings.downshift.mod.GetItemPropsOptions
import typings.storybookUi.sidebarTypesMod.DownshiftItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetItemProps extends StObject {
  
  def closeMenu(): Unit = js.native
  def closeMenu(cb: js.Function0[Unit]): Unit = js.native
  
  var getItemProps: js.Function1[/* options */ GetItemPropsOptions[DownshiftItem], js.Any] = js.native
  
  var getMenuProps: FnCall = js.native
  
  var highlightedIndex: Double | Null = js.native
  
  var isBrowsing: Boolean = js.native
  
  var query: String = js.native
  
  var results: js.Array[DownshiftItem] = js.native
}
