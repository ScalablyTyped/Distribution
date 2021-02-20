package typings.rcMenu

import typings.rcMenu.anon.Find
import typings.rcMenu.rcMenuStrings.hack
import typings.react.mod.Key
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rc-menu/es/util", "getKeyFromChildrenIndex")
  @js.native
  def getKeyFromChildrenIndex(child: ReactElement, menuEventKey: Key, index: Double): Key = js.native
  
  @JSImport("rc-menu/es/util", "getMenuIdFromSubMenuEventKey")
  @js.native
  def getMenuIdFromSubMenuEventKey(eventKey: String): Key = js.native
  
  @JSImport("rc-menu/es/util", "getWidth")
  @js.native
  def getWidth(elem: HTMLElement): Double = js.native
  @JSImport("rc-menu/es/util", "getWidth")
  @js.native
  def getWidth(elem: HTMLElement, includeMargin: Boolean): Double = js.native
  
  @JSImport("rc-menu/es/util", "isMobileDevice")
  @js.native
  def isMobileDevice(): Boolean = js.native
  
  @JSImport("rc-menu/es/util", "loopMenuItem")
  @js.native
  def loopMenuItem(children: ReactNode, cb: js.Function2[/* node */ ReactElement, /* index */ Double, Unit]): Unit = js.native
  
  @JSImport("rc-menu/es/util", "loopMenuItemRecursively")
  @js.native
  def loopMenuItemRecursively(children: ReactNode, keys: js.Array[String], ret: Find): Unit = js.native
  
  @JSImport("rc-menu/es/util", "menuAllProps")
  @js.native
  val menuAllProps: js.Array[String] = js.native
  
  @JSImport("rc-menu/es/util", "noop")
  @js.native
  def noop(): Unit = js.native
  
  @JSImport("rc-menu/es/util", "setStyle")
  @js.native
  def setStyle_hack(elem: HTMLElement, styleProperty: hack, value: String): Unit = js.native
  @JSImport("rc-menu/es/util", "setStyle")
  @js.native
  def setStyle_hack(elem: HTMLElement, styleProperty: hack, value: Double): Unit = js.native
}
