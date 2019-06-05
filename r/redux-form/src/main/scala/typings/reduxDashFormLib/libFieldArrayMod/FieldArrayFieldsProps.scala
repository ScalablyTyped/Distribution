package typings
package reduxDashFormLib.libFieldArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldArrayFieldsProps[FieldValue] extends js.Object {
  var length: scala.Double
  var name: java.lang.String
  def forEach(callback: FieldIterate[FieldValue, scala.Unit]): scala.Unit
  def get(index: scala.Double): FieldValue
  def getAll(): js.Array[FieldValue]
  def insert(index: scala.Double, value: FieldValue): scala.Unit
  def map[R](callback: FieldIterate[FieldValue, R]): js.Array[R]
  def move(from: scala.Double, to: scala.Double): scala.Unit
  def pop(): FieldValue
  def push(value: FieldValue): scala.Unit
  def remove(index: scala.Double): scala.Unit
  def removeAll(): scala.Unit
  def shift(): FieldValue
  def swap(indexA: scala.Double, indexB: scala.Double): scala.Unit
  def unshift(value: FieldValue): scala.Unit
}

object FieldArrayFieldsProps {
  @scala.inline
  def apply[FieldValue](
    forEach: FieldIterate[FieldValue, scala.Unit] => scala.Unit,
    get: scala.Double => FieldValue,
    getAll: () => js.Array[FieldValue],
    insert: (scala.Double, FieldValue) => scala.Unit,
    length: scala.Double,
    map: FieldIterate[FieldValue, js.Any] => js.Array[js.Any],
    move: (scala.Double, scala.Double) => scala.Unit,
    name: java.lang.String,
    pop: () => FieldValue,
    push: FieldValue => scala.Unit,
    remove: scala.Double => scala.Unit,
    removeAll: () => scala.Unit,
    shift: () => FieldValue,
    swap: (scala.Double, scala.Double) => scala.Unit,
    unshift: FieldValue => scala.Unit
  ): FieldArrayFieldsProps[FieldValue] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction0(getAll), insert = js.Any.fromFunction2(insert), length = length, map = js.Any.fromFunction1(map), move = js.Any.fromFunction2(move), name = name, pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), remove = js.Any.fromFunction1(remove), removeAll = js.Any.fromFunction0(removeAll), shift = js.Any.fromFunction0(shift), swap = js.Any.fromFunction2(swap), unshift = js.Any.fromFunction1(unshift))
  
    __obj.asInstanceOf[FieldArrayFieldsProps[FieldValue]]
  }
}

