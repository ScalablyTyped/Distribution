package typings.reduxForm.reduxFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedArrayProps extends js.Object {
  def insert(field: String, index: Double, value: js.Any): Unit
  def move(field: String, from: Double, to: Double): Unit
  def pop(field: String): Unit
  def push(field: String, value: js.Any): Unit
  def remove(field: String, index: Double): Unit
  def removeAll(field: String): Unit
  def shift(field: String): Unit
  def splice(field: String, index: Double, removeNum: Double, value: js.Any): Unit
  def swap(field: String, indexA: Double, indexB: Double): Unit
  def unshift(field: String, value: js.Any): Unit
}

object InjectedArrayProps {
  @scala.inline
  def apply(
    insert: (String, Double, js.Any) => Unit,
    move: (String, Double, Double) => Unit,
    pop: String => Unit,
    push: (String, js.Any) => Unit,
    remove: (String, Double) => Unit,
    removeAll: String => Unit,
    shift: String => Unit,
    splice: (String, Double, Double, js.Any) => Unit,
    swap: (String, Double, Double) => Unit,
    unshift: (String, js.Any) => Unit
  ): InjectedArrayProps = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction3(insert), move = js.Any.fromFunction3(move), pop = js.Any.fromFunction1(pop), push = js.Any.fromFunction2(push), remove = js.Any.fromFunction2(remove), removeAll = js.Any.fromFunction1(removeAll), shift = js.Any.fromFunction1(shift), splice = js.Any.fromFunction4(splice), swap = js.Any.fromFunction3(swap), unshift = js.Any.fromFunction2(unshift))
    __obj.asInstanceOf[InjectedArrayProps]
  }
}

