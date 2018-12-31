package typings
package reduxDashFormLib.libReduxFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedArrayProps extends js.Object {
  def insert(field: java.lang.String, index: scala.Double, value: js.Any): scala.Unit
  def move(field: java.lang.String, from: scala.Double, to: scala.Double): scala.Unit
  def pop(field: java.lang.String): scala.Unit
  def push(field: java.lang.String, value: js.Any): scala.Unit
  def remove(field: java.lang.String, index: scala.Double): scala.Unit
  def removeAll(field: java.lang.String): scala.Unit
  def shift(field: java.lang.String): scala.Unit
  def splice(field: java.lang.String, index: scala.Double, removeNum: scala.Double, value: js.Any): scala.Unit
  def swap(field: java.lang.String, indexA: scala.Double, indexB: scala.Double): scala.Unit
  def unshift(field: java.lang.String, value: js.Any): scala.Unit
}

