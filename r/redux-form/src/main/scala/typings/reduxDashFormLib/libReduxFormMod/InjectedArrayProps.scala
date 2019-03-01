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
    insert: js.Function3[java.lang.String, scala.Double, js.Any, scala.Unit],
    move: js.Function3[java.lang.String, scala.Double, scala.Double, scala.Unit],
    pop: js.Function1[java.lang.String, scala.Unit],
    push: js.Function2[java.lang.String, js.Any, scala.Unit],
    remove: js.Function2[java.lang.String, scala.Double, scala.Unit],
    removeAll: js.Function1[java.lang.String, scala.Unit],
    shift: js.Function1[java.lang.String, scala.Unit],
    splice: js.Function4[java.lang.String, scala.Double, scala.Double, js.Any, scala.Unit],
    swap: js.Function3[java.lang.String, scala.Double, scala.Double, scala.Unit],
    unshift: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): InjectedArrayProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("move")(move)
    __obj.updateDynamic("pop")(pop)
    __obj.updateDynamic("push")(push)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("removeAll")(removeAll)
    __obj.updateDynamic("shift")(shift)
    __obj.updateDynamic("splice")(splice)
    __obj.updateDynamic("swap")(swap)
    __obj.updateDynamic("unshift")(unshift)
    __obj.asInstanceOf[InjectedArrayProps]
  }
}

