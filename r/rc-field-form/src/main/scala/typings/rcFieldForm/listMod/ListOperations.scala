package typings.rcFieldForm.listMod

import typings.rcFieldForm.interfaceMod.StoreValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOperations extends js.Object {
  def add(): Unit = js.native
  def add(defaultValue: StoreValue): Unit = js.native
  def move(from: Double, to: Double): Unit = js.native
  def remove(index: js.Array[Double]): Unit = js.native
  def remove(index: Double): Unit = js.native
}

