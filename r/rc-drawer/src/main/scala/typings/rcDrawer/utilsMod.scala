package typings.rcDrawer

import typings.react.mod.TouchEvent
import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-drawer/es/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  val transitionEnd: String = js.native
  val transitionStr: String = js.native
  val windowIsUndefined: Boolean = js.native
  def addEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ TouchEvent[Element] | typings.std.TouchEvent | Event, Unit]
  ): Unit = js.native
  def addEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ TouchEvent[Element] | typings.std.TouchEvent | Event, Unit],
    options: js.Any
  ): Unit = js.native
  def dataToArray(vars: js.Any): js.Array[_] = js.native
  def getTouchParentScroll(root: HTMLElement, currentTarget: Null, differX: Double, differY: Double): Boolean = js.native
  def getTouchParentScroll(root: HTMLElement, currentTarget: Document, differX: Double, differY: Double): Boolean = js.native
  def getTouchParentScroll(root: HTMLElement, currentTarget: HTMLElement, differX: Double, differY: Double): Boolean = js.native
  def isNumeric(): Boolean = js.native
  def isNumeric(value: String): Boolean = js.native
  def isNumeric(value: Double): Boolean = js.native
  def removeEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ TouchEvent[Element] | typings.std.TouchEvent | Event, Unit]
  ): Unit = js.native
  def removeEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ TouchEvent[Element] | typings.std.TouchEvent | Event, Unit],
    options: js.Any
  ): Unit = js.native
  def transformArguments(arg: js.Any, cb: js.Any): js.Array[_] = js.native
}

