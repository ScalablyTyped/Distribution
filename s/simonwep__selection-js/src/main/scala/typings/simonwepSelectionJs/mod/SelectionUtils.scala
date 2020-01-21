package typings.simonwepSelectionJs.mod

import typings.std.AddEventListenerOptions
import typings.std.Element
import typings.std.EventTarget
import typings.std.Event_
import typings.std.HTMLElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionUtils extends js.Object {
  def css(el: Element, attr: String, `val`: String): js.Any = js.native
  def css(el: Element, attr: String, `val`: Double): js.Any = js.native
  def css(el: Element, attr: Record[String, String | Double]): js.Any = js.native
  def eventPath(evt: Event_): js.Array[EventTarget] = js.native
  def intersects(a: Element, b: Element, mode: Mode): Boolean = js.native
  def off(el: ElementList, events: String, fn: js.Function1[/* ev */ Event_, Unit]): Unit = js.native
  def off(
    el: ElementList,
    events: String,
    fn: js.Function1[/* ev */ Event_, Unit],
    options: AddEventListenerOptions
  ): Unit = js.native
  def off(el: ElementList, events: js.Array[String], fn: js.Function1[/* ev */ Event_, Unit]): Unit = js.native
  def off(
    el: ElementList,
    events: js.Array[String],
    fn: js.Function1[/* ev */ Event_, Unit],
    options: AddEventListenerOptions
  ): Unit = js.native
  def on(el: ElementList, events: String, fn: js.Function1[/* ev */ Event_, Unit]): Unit = js.native
  def on(
    el: ElementList,
    events: String,
    fn: js.Function1[/* ev */ Event_, Unit],
    options: AddEventListenerOptions
  ): Unit = js.native
  def on(el: ElementList, events: js.Array[String], fn: js.Function1[/* ev */ Event_, Unit]): Unit = js.native
  def on(
    el: ElementList,
    events: js.Array[String],
    fn: js.Function1[/* ev */ Event_, Unit],
    options: AddEventListenerOptions
  ): Unit = js.native
  def removeElement(arr: js.Array[Element], el: Element): Unit = js.native
  def selectAll(selector: String): js.Array[Element] = js.native
  def selectAll(selector: js.Array[String | HTMLElement]): js.Array[Element] = js.native
  def selectAll(selector: HTMLElement): js.Array[Element] = js.native
}

