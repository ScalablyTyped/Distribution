package typings
package steedLib.steedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SteedQueue[T] extends js.Object {
  var concurrency: scala.Double = js.native
  def drain(): js.Any = js.native
  def empty(): js.Any = js.native
  def idle(): scala.Boolean = js.native
  def kill(): scala.Unit = js.native
  def length(): scala.Double = js.native
  def pause(): scala.Unit = js.native
  def push[E](task: T): scala.Unit = js.native
  def push[E](task: T, callback: SteedResultCallback[T, E]): scala.Unit = js.native
  def push[E](task: js.Array[T]): scala.Unit = js.native
  def push[E](task: js.Array[T], callback: SteedResultCallback[T, E]): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def saturated(): js.Any = js.native
  def unshift[E](task: T): scala.Unit = js.native
  def unshift[E](task: T, callback: ErrorCallback[E]): scala.Unit = js.native
  def unshift[E](task: js.Array[T]): scala.Unit = js.native
  def unshift[E](task: js.Array[T], callback: ErrorCallback[E]): scala.Unit = js.native
}

