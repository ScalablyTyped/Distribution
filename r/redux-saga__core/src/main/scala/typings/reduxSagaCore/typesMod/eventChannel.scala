package typings.reduxSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/core/types", "eventChannel")
@js.native
object eventChannel extends js.Object {
  def apply[T](subscribe: Subscribe[T]): EventChannel_[T] = js.native
  def apply[T](subscribe: Subscribe[T], buffer: typings.node.Buffer): EventChannel_[T] = js.native
}

