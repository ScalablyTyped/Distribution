package typings.redis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverloadedListCommand[T, U, R] extends js.Object {
  def apply(arg1: T): R = js.native
  def apply(arg1: T, arg2: T): R = js.native
  def apply(arg1: T, arg2: T, arg3: T): R = js.native
  def apply(arg1: T, arg2: T, arg3: T, arg4: T): R = js.native
  def apply(arg1: T, arg2: T, arg3: T, arg4: T, arg5: T): R = js.native
  def apply(arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, arg6: T): R = js.native
  def apply(arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, arg6: T, cb: Callback[U]): R = js.native
  def apply(arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, cb: Callback[U]): R = js.native
  def apply(arg1: T, arg2: T, arg3: T, arg4: T, cb: Callback[U]): R = js.native
  def apply(arg1: T, arg2: T, arg3: T, cb: Callback[U]): R = js.native
  def apply(arg1: T, arg2: T, cb: Callback[U]): R = js.native
  def apply(arg1: T, cb: Callback[U]): R = js.native
  def apply(arg1: js.Array[T]): R = js.native
  def apply(arg1: js.Array[T], cb: Callback[U]): R = js.native
  def apply(args: (T | Callback[U])*): R = js.native
}

