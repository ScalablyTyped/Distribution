package typings.sharepoint.global

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Available only in SharePoint Online*/
@JSGlobal("IE8Support")
@js.native
object IE8Support extends js.Object {
  def arrayIndexOf[T](array: js.Array[T], item: T): Double = js.native
  def arrayIndexOf[T](array: js.Array[T], item: T, startIdx: Double): Double = js.native
  def attachDOMContentLoaded(handler: js.Function0[Unit]): Unit = js.native
  def getComputedStyle(domObj: HTMLElement, camelStyleName: String, dashStyleName: String): String = js.native
  def stopPropagation(evt: Event): Unit = js.native
}

