package typings.rcMenu

import typings.rcMenu.anon.Find
import typings.rcMenu.rcMenuStrings.hack
import typings.react.mod.Key
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rc-menu/es/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getKeyFromChildrenIndex(child: ReactElement, menuEventKey: Key, index: Double): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeyFromChildrenIndex")(child.asInstanceOf[js.Any], menuEventKey.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Key]
  
  @scala.inline
  def getMenuIdFromSubMenuEventKey(eventKey: String): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuIdFromSubMenuEventKey")(eventKey.asInstanceOf[js.Any]).asInstanceOf[Key]
  
  @scala.inline
  def getWidth(elem: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")(elem.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getWidth(elem: HTMLElement, includeMargin: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")(elem.asInstanceOf[js.Any], includeMargin.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def isMobileDevice(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobileDevice")().asInstanceOf[Boolean]
  
  @scala.inline
  def loopMenuItem(children: ReactNode, cb: js.Function2[/* node */ ReactElement, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loopMenuItem")(children.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def loopMenuItemRecursively(children: ReactNode, keys: js.Array[String], ret: Find): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loopMenuItemRecursively")(children.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], ret.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("rc-menu/es/util", "menuAllProps")
  @js.native
  val menuAllProps: js.Array[String] = js.native
  
  @scala.inline
  def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  @scala.inline
  def setStyle_hack(elem: HTMLElement, styleProperty: hack, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyle")(elem.asInstanceOf[js.Any], styleProperty.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setStyle_hack(elem: HTMLElement, styleProperty: hack, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyle")(elem.asInstanceOf[js.Any], styleProperty.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
