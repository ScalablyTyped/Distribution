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
    forEach: js.Function1[FieldIterate[FieldValue, scala.Unit], scala.Unit],
    get: js.Function1[scala.Double, FieldValue],
    getAll: js.Function0[js.Array[FieldValue]],
    insert: js.Function2[scala.Double, FieldValue, scala.Unit],
    length: scala.Double,
    map: js.Function1[FieldIterate[FieldValue, js.Any], js.Array[js.Any]],
    move: js.Function2[scala.Double, scala.Double, scala.Unit],
    name: java.lang.String,
    pop: js.Function0[FieldValue],
    push: js.Function1[FieldValue, scala.Unit],
    remove: js.Function1[scala.Double, scala.Unit],
    removeAll: js.Function0[scala.Unit],
    shift: js.Function0[FieldValue],
    swap: js.Function2[scala.Double, scala.Double, scala.Unit],
    unshift: js.Function1[FieldValue, scala.Unit]
  ): FieldArrayFieldsProps[FieldValue] = {
    val __obj = js.Dynamic.literal(forEach = forEach, get = get, getAll = getAll, insert = insert, length = length, map = map, move = move, name = name, pop = pop, push = push, remove = remove, removeAll = removeAll, shift = shift, swap = swap, unshift = unshift)
  
    __obj.asInstanceOf[FieldArrayFieldsProps[FieldValue]]
  }
}

