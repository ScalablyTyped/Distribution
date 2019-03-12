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

object InjectedArrayProps {
  @scala.inline
  def apply(
    insert: (java.lang.String, scala.Double, js.Any) => scala.Unit,
    move: (java.lang.String, scala.Double, scala.Double) => scala.Unit,
    pop: java.lang.String => scala.Unit,
    push: (java.lang.String, js.Any) => scala.Unit,
    remove: (java.lang.String, scala.Double) => scala.Unit,
    removeAll: java.lang.String => scala.Unit,
    shift: java.lang.String => scala.Unit,
    splice: (java.lang.String, scala.Double, scala.Double, js.Any) => scala.Unit,
    swap: (java.lang.String, scala.Double, scala.Double) => scala.Unit,
    unshift: (java.lang.String, js.Any) => scala.Unit
  ): InjectedArrayProps = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction3(insert), move = js.Any.fromFunction3(move), pop = js.Any.fromFunction1(pop), push = js.Any.fromFunction2(push), remove = js.Any.fromFunction2(remove), removeAll = js.Any.fromFunction1(removeAll), shift = js.Any.fromFunction1(shift), splice = js.Any.fromFunction4(splice), swap = js.Any.fromFunction3(swap), unshift = js.Any.fromFunction2(unshift))
  
    __obj.asInstanceOf[InjectedArrayProps]
  }
}

