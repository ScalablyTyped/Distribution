package typings.resizeDashObserverDashBrowser

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ResizeObserver")
@js.native
class ResizeObserver protected () extends js.Object {
  def this(callback: ResizeObserverCallback) = this()
  def disconnect(): Unit = js.native
  def observe(target: Element): Unit = js.native
  def observe(target: Element, options: ResizeObserverOptions): Unit = js.native
  def unobserve(target: Element): Unit = js.native
}

