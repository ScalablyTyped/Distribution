package typings.rcDashMenu

import typings.react.reactMod.Key
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-menu/lib/util", JSImport.Namespace)
@js.native
object libUtilMod extends js.Object {
  val menuAllProps: js.Array[String] = js.native
  def getKeyFromChildrenIndex(child: ReactElement, menuEventKey: Key, index: Double): Key = js.native
  def getMenuIdFromSubMenuEventKey(eventKey: String): Key = js.native
  def getWidth(elem: HTMLElement): Double = js.native
  def isMobileDevice(): Boolean = js.native
  def loopMenuItem(children: ReactNode, cb: js.Function2[/* node */ ReactElement, /* index */ Double, Unit]): Unit = js.native
  def loopMenuItemRecursively(children: ReactNode, keys: js.Array[String], ret: Anon_Find): Unit = js.native
  def noop(): Unit = js.native
  def setStyle(
    elem: HTMLElement,
    styleProperty: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 756 */ js.Any,
    value: String
  ): Unit = js.native
  def setStyle(
    elem: HTMLElement,
    styleProperty: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 756 */ js.Any,
    value: Double
  ): Unit = js.native
}

