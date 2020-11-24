package typings.reactOverlays.esmDropdownMod

import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.reactOverlays.anon.PropsDropdownInjectedProps
import typings.reactOverlays.esmDropdownContextMod.DropDirection
import typings.reactOverlays.reactOverlaysBooleans.`false`
import typings.reactOverlays.reactOverlaysBooleans.`true`
import typings.reactOverlays.reactOverlaysStrings.keyboard
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownProps extends js.Object {
  
  var alignEnd: js.UndefOr[Boolean] = js.native
  
  def children(arg: PropsDropdownInjectedProps): ReactNode = js.native
  
  var defaultShow: js.UndefOr[Boolean] = js.native
  
  var drop: js.UndefOr[DropDirection] = js.native
  
  var focusFirstItemOnShow: js.UndefOr[`false` | `true` | keyboard] = js.native
  
  var itemSelector: js.UndefOr[String] = js.native
  
  def onToggle(nextShow: Boolean): Unit = js.native
  def onToggle(nextShow: Boolean, event: SyntheticEvent[Element, Event]): Unit = js.native
  
  var show: js.UndefOr[Boolean] = js.native
}
