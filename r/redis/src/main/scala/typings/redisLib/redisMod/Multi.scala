package typings
package redisLib.redisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Multi extends Commands[Multi] {
  def EXEC(): scala.Boolean = js.native
  def EXEC(cb: Callback[js.Array[_]]): scala.Boolean = js.native
  def EXEC_ATOMIC(): scala.Boolean = js.native
  def EXEC_ATOMIC(cb: Callback[js.Array[_]]): scala.Boolean = js.native
  def exec(): scala.Boolean = js.native
  def exec(cb: Callback[js.Array[_]]): scala.Boolean = js.native
  def exec_atomic(): scala.Boolean = js.native
  def exec_atomic(cb: Callback[js.Array[_]]): scala.Boolean = js.native
}

