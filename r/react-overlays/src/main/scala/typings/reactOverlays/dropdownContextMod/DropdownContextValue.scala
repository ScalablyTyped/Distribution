package typings.reactOverlays.dropdownContextMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownContextValue extends js.Object {
  
  var alignEnd: js.UndefOr[Boolean] = js.native
  
  var drop: js.UndefOr[DropDirection] = js.native
  
  var menuElement: HTMLElement | Null = js.native
  
  def setMenu(): Unit = js.native
  def setMenu(ref: HTMLElement): Unit = js.native
  
  def setToggle(): Unit = js.native
  def setToggle(ref: HTMLElement): Unit = js.native
  
  var show: Boolean = js.native
  
  def toggle(nextShow: Boolean): Unit = js.native
  def toggle(nextShow: Boolean, event: SyntheticEvent[Element, Event]): Unit = js.native
  def toggle(nextShow: Boolean, event: Event): Unit = js.native
  
  var toggleElement: HTMLElement | Null = js.native
}
