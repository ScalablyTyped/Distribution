package typings
package reduxDashDoghouseLib.reduxDashDoghouseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-doghouse", "ScopedActionFactory")
@js.native
class ScopedActionFactory[A /* <: reduxLib.reduxMod.ActionCreator[_] | reduxLib.reduxMod.ActionCreatorsMapObject[_] */] protected () extends js.Object {
  def this(actionCreator: A) = this()
  def scope(id: java.lang.String): A = js.native
  def scope(id: scala.Double): A = js.native
}

