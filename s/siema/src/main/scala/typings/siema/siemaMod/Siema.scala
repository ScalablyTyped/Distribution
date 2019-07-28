package typings.siema.siemaMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Siema extends js.Object {
  var currentSlide: Double = js.native
  def append(item: HTMLElement): Unit = js.native
  def append(item: HTMLElement, callback: js.Function0[Unit]): Unit = js.native
  def destroy(): Unit = js.native
  def destroy(restoreMarkup: Boolean): Unit = js.native
  def destroy(restoreMarkup: Boolean, callback: js.Function0[Unit]): Unit = js.native
  def goTo(index: Double): Unit = js.native
  def goTo(index: Double, callback: js.Function0[Unit]): Unit = js.native
  def insert(item: HTMLElement, index: Double): Unit = js.native
  def insert(item: HTMLElement, index: Double, callback: js.Function0[Unit]): Unit = js.native
  def next(): Unit = js.native
  def next(index: Double): Unit = js.native
  def next(index: Double, callback: js.Function0[Unit]): Unit = js.native
  def prepend(item: HTMLElement): Unit = js.native
  def prepend(item: HTMLElement, callback: js.Function0[Unit]): Unit = js.native
  def prev(): Unit = js.native
  def prev(index: Double): Unit = js.native
  def prev(index: Double, callback: js.Function0[Unit]): Unit = js.native
  def remove(index: Double): Unit = js.native
  def remove(index: Double, callback: js.Function0[Unit]): Unit = js.native
}

