package typings.resizeObserverBrowser

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeObserver extends js.Object {
  def disconnect(): Unit = js.native
  def observe(target: Element): Unit = js.native
  def observe(target: Element, options: ResizeObserverOptions): Unit = js.native
  def unobserve(target: Element): Unit = js.native
}

