package typings.reduxForm.fieldArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldArrayFieldsProps[FieldValue] extends js.Object {
  var length: Double
  var name: String
  def forEach(callback: FieldIterate[FieldValue, Unit]): Unit
  def get(index: Double): FieldValue
  def getAll(): js.Array[FieldValue]
  def insert(index: Double, value: FieldValue): Unit
  def map[R](callback: FieldIterate[FieldValue, R]): js.Array[R]
  def move(from: Double, to: Double): Unit
  def pop(): FieldValue
  def push(value: FieldValue): Unit
  def remove(index: Double): Unit
  def removeAll(): Unit
  def shift(): FieldValue
  def swap(indexA: Double, indexB: Double): Unit
  def unshift(value: FieldValue): Unit
}

object FieldArrayFieldsProps {
  @scala.inline
  def apply[FieldValue](
    forEach: FieldIterate[FieldValue, Unit] => Unit,
    get: Double => FieldValue,
    getAll: () => js.Array[FieldValue],
    insert: (Double, FieldValue) => Unit,
    length: Double,
    map: FieldIterate[FieldValue, js.Any] => js.Array[js.Any],
    move: (Double, Double) => Unit,
    name: String,
    pop: () => FieldValue,
    push: FieldValue => Unit,
    remove: Double => Unit,
    removeAll: () => Unit,
    shift: () => FieldValue,
    swap: (Double, Double) => Unit,
    unshift: FieldValue => Unit
  ): FieldArrayFieldsProps[FieldValue] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction0(getAll), insert = js.Any.fromFunction2(insert), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), move = js.Any.fromFunction2(move), name = name.asInstanceOf[js.Any], pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), remove = js.Any.fromFunction1(remove), removeAll = js.Any.fromFunction0(removeAll), shift = js.Any.fromFunction0(shift), swap = js.Any.fromFunction2(swap), unshift = js.Any.fromFunction1(unshift))
    __obj.asInstanceOf[FieldArrayFieldsProps[FieldValue]]
  }
}

