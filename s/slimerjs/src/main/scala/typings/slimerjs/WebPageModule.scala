package typings.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPageModule extends js.Object {
  def create(): WebPage = js.native
  def exit(): Unit = js.native
  def exit(returnValue: Double): Unit = js.native
}

