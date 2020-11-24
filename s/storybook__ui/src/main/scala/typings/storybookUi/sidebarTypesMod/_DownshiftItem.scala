package typings.storybookUi.sidebarTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _DownshiftItem extends js.Object
object _DownshiftItem {
  
  @scala.inline
  def ExpandType(moreCount: Double, showAll: () => Unit, totalCount: Double): _DownshiftItem = {
    val __obj = js.Dynamic.literal(moreCount = moreCount.asInstanceOf[js.Any], showAll = js.Any.fromFunction0(showAll), totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DownshiftItem]
  }
  
  @scala.inline
  def ClearType(clearLastViewed: () => Unit): _DownshiftItem = {
    val __obj = js.Dynamic.literal(clearLastViewed = js.Any.fromFunction0(clearLastViewed))
    __obj.asInstanceOf[_DownshiftItem]
  }
  
  @scala.inline
  def CloseType(closeMenu: () => Unit): _DownshiftItem = {
    val __obj = js.Dynamic.literal(closeMenu = js.Any.fromFunction0(closeMenu))
    __obj.asInstanceOf[_DownshiftItem]
  }
}
