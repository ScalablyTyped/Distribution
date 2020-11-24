package typings.redis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverloadedLastCommand[T1, T2, U, R] extends js.Object {
  
  def apply(arg1: T1, arg2: T1, arg3: T1, arg4: T1, arg5: T1, arg6: T2): R = js.native
  def apply(arg1: T1, arg2: T1, arg3: T1, arg4: T1, arg5: T1, arg6: T2, cb: Callback[U]): R = js.native
  def apply(arg1: T1, arg2: T1, arg3: T1, arg4: T1, arg5: T2): R = js.native
  def apply(arg1: T1, arg2: T1, arg3: T1, arg4: T1, arg5: T2, cb: Callback[U]): R = js.native
  def apply(arg1: T1, arg2: T1, arg3: T1, arg4: T2): R = js.native
  def apply(arg1: T1, arg2: T1, arg3: T1, arg4: T2, cb: Callback[U]): R = js.native
  def apply(arg1: T1, arg2: T1, arg3: T2): R = js.native
  def apply(arg1: T1, arg2: T1, arg3: T2, cb: Callback[U]): R = js.native
  def apply(arg1: T1, arg2: T2): R = js.native
  def apply(arg1: T1, arg2: T2, cb: Callback[U]): R = js.native
  def apply(arg1: T1, arg2: js.Array[T1 | T2]): R = js.native
  def apply(arg1: T1, arg2: js.Array[T1 | T2], cb: Callback[U]): R = js.native
  def apply(args: (T1 | T2 | Callback[U])*): R = js.native
  def apply(args: js.Array[T1 | T2]): R = js.native
  def apply(args: js.Array[T1 | T2], cb: Callback[U]): R = js.native
}
