package typings.rcMenu

import typings.rcMenu.anon.Find
import typings.react.mod.Key
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-menu/es/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  val menuAllProps: js.Array[String] = js.native
  def getKeyFromChildrenIndex(child: ReactElement, menuEventKey: Key, index: Double): Key = js.native
  def getMenuIdFromSubMenuEventKey(eventKey: String): Key = js.native
  def getWidth(elem: HTMLElement): Double = js.native
  def isMobileDevice(): Boolean = js.native
  def loopMenuItem(children: ReactNode, cb: js.Function2[/* node */ ReactElement, /* index */ Double, Unit]): Unit = js.native
  def loopMenuItemRecursively(children: ReactNode, keys: js.Array[String], ret: Find): Unit = js.native
  def noop(): Unit = js.native
  def setStyle(
    elem: HTMLElement,
    styleProperty: /* keyof react.react.CSSProperties */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 765 */ js.Any,
    value: String
  ): Unit = js.native
  def setStyle(
    elem: HTMLElement,
    styleProperty: /* keyof react.react.CSSProperties */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 765 */ js.Any,
    value: Double
  ): Unit = js.native
}

