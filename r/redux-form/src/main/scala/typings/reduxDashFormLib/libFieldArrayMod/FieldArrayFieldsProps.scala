package typings
package reduxDashFormLib.libFieldArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldArrayFieldsProps[FieldValue] extends js.Object {
  var length: scala.Double = js.native
  var name: java.lang.String = js.native
  def forEach(callback: FieldIterate[FieldValue, scala.Unit]): scala.Unit = js.native
  def get(index: scala.Double): FieldValue = js.native
  def getAll(): js.Array[FieldValue] = js.native
  def insert(index: scala.Double, value: FieldValue): scala.Unit = js.native
  def map[R](callback: FieldIterate[FieldValue, R]): js.Array[R] = js.native
  def move(from: scala.Double, to: scala.Double): scala.Unit = js.native
  def pop(): FieldValue = js.native
  def push(): scala.Unit = js.native
  def push(value: FieldValue): scala.Unit = js.native
  def remove(index: scala.Double): scala.Unit = js.native
  def removeAll(): scala.Unit = js.native
  def shift(): FieldValue = js.native
  def swap(indexA: scala.Double, indexB: scala.Double): scala.Unit = js.native
  def unshift(value: FieldValue): scala.Unit = js.native
}

