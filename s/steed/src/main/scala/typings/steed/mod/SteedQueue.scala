package typings.steed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SteedQueue[T] extends js.Object {
  var concurrency: Double = js.native
  def drain(): js.Any = js.native
  def empty(): js.Any = js.native
  def idle(): Boolean = js.native
  def kill(): Unit = js.native
  def length(): Double = js.native
  def pause(): Unit = js.native
  def push[E](task: T): Unit = js.native
  def push[E](task: T, callback: SteedResultCallback[T, E]): Unit = js.native
  def push[E](task: js.Array[T]): Unit = js.native
  def push[E](task: js.Array[T], callback: SteedResultCallback[T, E]): Unit = js.native
  def resume(): Unit = js.native
  def saturated(): js.Any = js.native
  def unshift[E](task: T): Unit = js.native
  def unshift[E](task: T, callback: ErrorCallback[E]): Unit = js.native
  def unshift[E](task: js.Array[T]): Unit = js.native
  def unshift[E](task: js.Array[T], callback: ErrorCallback[E]): Unit = js.native
}

