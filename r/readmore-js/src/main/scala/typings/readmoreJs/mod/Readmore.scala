package typings.readmoreJs.mod

import typings.std.Element
import typings.std.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Readmore extends js.Object {
  def destroy(): Unit = js.native
  def toggle(): Unit = js.native
  def toggle(element: String): Unit = js.native
  def toggle(element: Element): Unit = js.native
  def toggle(element: NodeList): Unit = js.native
}

