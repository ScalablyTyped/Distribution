package typings.rx.rxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "helpers")
@js.native
object helpersNs extends js.Object {
  def asArray[T](args: T*): js.Array[T] = js.native
  def defaultComparer(left: js.Any, right: js.Any): Boolean = js.native
  def defaultError(err: js.Any): Unit = js.native
  def defaultKeySerializer(key: js.Any): String = js.native
  def defaultNow(): Double = js.native
  def defaultSubComparer(left: js.Any, right: js.Any): Double = js.native
  def identity[T](value: T): T = js.native
  def isFunction(value: js.Any): Boolean = js.native
  def isPromise(p: js.Any): Boolean = js.native
  def noop(): Unit = js.native
  def not(value: js.Any): Boolean = js.native
  def notDefined(value: js.Any): Boolean = js.native
}

