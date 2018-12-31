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

