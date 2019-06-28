package typings
package atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionUtils extends js.Object {
  def css(el: stdLib.Element, attr: java.lang.String, `val`: java.lang.String): js.Any = js.native
  def css(el: stdLib.Element, attr: java.lang.String, `val`: scala.Double): js.Any = js.native
  def css(el: stdLib.Element, attr: stdLib.Record[java.lang.String, java.lang.String | scala.Double]): js.Any = js.native
  def eventPath(evt: stdLib.Event): js.Array[stdLib.EventTarget] = js.native
  def intersects(a: stdLib.Element, b: stdLib.Element, mode: Mode): scala.Boolean = js.native
  def off(el: ElementList, events: java.lang.String, fn: js.Function1[/* ev */ stdLib.Event, scala.Unit]): scala.Unit = js.native
  def off(
    el: ElementList,
    events: java.lang.String,
    fn: js.Function1[/* ev */ stdLib.Event, scala.Unit],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  def off(
    el: ElementList,
    events: js.Array[java.lang.String],
    fn: js.Function1[/* ev */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  def off(
    el: ElementList,
    events: js.Array[java.lang.String],
    fn: js.Function1[/* ev */ stdLib.Event, scala.Unit],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  def on(el: ElementList, events: java.lang.String, fn: js.Function1[/* ev */ stdLib.Event, scala.Unit]): scala.Unit = js.native
  def on(
    el: ElementList,
    events: java.lang.String,
    fn: js.Function1[/* ev */ stdLib.Event, scala.Unit],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  def on(
    el: ElementList,
    events: js.Array[java.lang.String],
    fn: js.Function1[/* ev */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  def on(
    el: ElementList,
    events: js.Array[java.lang.String],
    fn: js.Function1[/* ev */ stdLib.Event, scala.Unit],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  def removeElement(arr: js.Array[stdLib.Element], el: stdLib.Element): scala.Unit = js.native
  def selectAll(selector: java.lang.String): js.Array[stdLib.Element] = js.native
  def selectAll(selector: js.Array[java.lang.String | stdLib.HTMLElement]): js.Array[stdLib.Element] = js.native
  def selectAll(selector: stdLib.HTMLElement): js.Array[stdLib.Element] = js.native
}

