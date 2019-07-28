package typings.redis.redisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Multi extends Commands[Multi] {
  def EXEC(): Boolean = js.native
  def EXEC(cb: Callback[js.Array[_]]): Boolean = js.native
  def EXEC_ATOMIC(): Boolean = js.native
  def EXEC_ATOMIC(cb: Callback[js.Array[_]]): Boolean = js.native
  def exec(): Boolean = js.native
  def exec(cb: Callback[js.Array[_]]): Boolean = js.native
  def exec_atomic(): Boolean = js.native
  def exec_atomic(cb: Callback[js.Array[_]]): Boolean = js.native
}

