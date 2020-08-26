package typings.reduxForm.fieldArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldArrayFieldsProps[FieldValue] extends js.Object {
  var length: Double = js.native
  var name: String = js.native
  def forEach(callback: FieldIterate[FieldValue, Unit]): Unit = js.native
  def get(index: Double): FieldValue = js.native
  def getAll(): js.Array[FieldValue] = js.native
  def insert(index: Double, value: FieldValue): Unit = js.native
  def map[R](callback: FieldIterate[FieldValue, R]): js.Array[R] = js.native
  def move(from: Double, to: Double): Unit = js.native
  def pop(): FieldValue = js.native
  def push(value: FieldValue): Unit = js.native
  def remove(index: Double): Unit = js.native
  def removeAll(): Unit = js.native
  def shift(): FieldValue = js.native
  def splice(index: Double, removeNum: Double, value: FieldValue): Unit = js.native
  def splice(index: Double, removeNum: Null, value: FieldValue): Unit = js.native
  def swap(indexA: Double, indexB: Double): Unit = js.native
  def unshift(value: FieldValue): Unit = js.native
}

