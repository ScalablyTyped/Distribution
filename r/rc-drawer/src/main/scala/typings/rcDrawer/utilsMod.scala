package typings.rcDrawer

import typings.react.mod.TouchEvent
import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("rc-drawer/es/utils", "addEventListener")
  @js.native
  def addEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ TouchEvent[Element] | typings.std.TouchEvent | Event, Unit]
  ): Unit = js.native
  @JSImport("rc-drawer/es/utils", "addEventListener")
  @js.native
  def addEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ TouchEvent[Element] | typings.std.TouchEvent | Event, Unit],
    options: js.Any
  ): Unit = js.native
  
  @JSImport("rc-drawer/es/utils", "dataToArray")
  @js.native
  def dataToArray(vars: js.Any): js.Array[_] = js.native
  
  @JSImport("rc-drawer/es/utils", "getTouchParentScroll")
  @js.native
  def getTouchParentScroll(root: HTMLElement, currentTarget: Null, differX: Double, differY: Double): Boolean = js.native
  @JSImport("rc-drawer/es/utils", "getTouchParentScroll")
  @js.native
  def getTouchParentScroll(root: HTMLElement, currentTarget: Document, differX: Double, differY: Double): Boolean = js.native
  @JSImport("rc-drawer/es/utils", "getTouchParentScroll")
  @js.native
  def getTouchParentScroll(root: HTMLElement, currentTarget: HTMLElement, differX: Double, differY: Double): Boolean = js.native
  
  @JSImport("rc-drawer/es/utils", "isNumeric")
  @js.native
  def isNumeric(): Boolean = js.native
  @JSImport("rc-drawer/es/utils", "isNumeric")
  @js.native
  def isNumeric(value: String): Boolean = js.native
  @JSImport("rc-drawer/es/utils", "isNumeric")
  @js.native
  def isNumeric(value: Double): Boolean = js.native
  
  @JSImport("rc-drawer/es/utils", "removeEventListener")
  @js.native
  def removeEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ TouchEvent[Element] | typings.std.TouchEvent | Event, Unit]
  ): Unit = js.native
  @JSImport("rc-drawer/es/utils", "removeEventListener")
  @js.native
  def removeEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ TouchEvent[Element] | typings.std.TouchEvent | Event, Unit],
    options: js.Any
  ): Unit = js.native
  
  @JSImport("rc-drawer/es/utils", "transformArguments")
  @js.native
  def transformArguments(arg: js.Any, cb: js.Any): js.Array[_] = js.native
  
  @JSImport("rc-drawer/es/utils", "transitionEnd")
  @js.native
  val transitionEnd: String = js.native
  
  @JSImport("rc-drawer/es/utils", "transitionStr")
  @js.native
  val transitionStr: String = js.native
  
  @JSImport("rc-drawer/es/utils", "windowIsUndefined")
  @js.native
  val windowIsUndefined: Boolean = js.native
}
