package typings
package siemaLib.siemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Siema extends js.Object {
  var currentSlide: scala.Double = js.native
  def append(item: stdLib.HTMLElement): scala.Unit = js.native
  def append(item: stdLib.HTMLElement, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def destroy(restoreMarkup: scala.Boolean): scala.Unit = js.native
  def destroy(restoreMarkup: scala.Boolean, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def goTo(index: scala.Double): scala.Unit = js.native
  def goTo(index: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def insert(item: stdLib.HTMLElement, index: scala.Double): scala.Unit = js.native
  def insert(item: stdLib.HTMLElement, index: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def next(): scala.Unit = js.native
  def next(index: scala.Double): scala.Unit = js.native
  def next(index: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def prepend(item: stdLib.HTMLElement): scala.Unit = js.native
  def prepend(item: stdLib.HTMLElement, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def prev(): scala.Unit = js.native
  def prev(index: scala.Double): scala.Unit = js.native
  def prev(index: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def remove(index: scala.Double): scala.Unit = js.native
  def remove(index: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

