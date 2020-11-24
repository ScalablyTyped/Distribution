package typings.rcTabs.interfaceMod

import typings.rcTabs.anon.Event
import typings.rcTabs.rcTabsStrings.add
import typings.rcTabs.rcTabsStrings.remove
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditableConfig extends js.Object {
  
  var addIcon: js.UndefOr[ReactNode] = js.native
  
  @JSName("onEdit")
  def onEdit_add(`type`: add, info: Event): Unit = js.native
  @JSName("onEdit")
  def onEdit_remove(`type`: remove, info: Event): Unit = js.native
  
  var removeIcon: js.UndefOr[ReactNode] = js.native
  
  var showAdd: js.UndefOr[Boolean] = js.native
}
