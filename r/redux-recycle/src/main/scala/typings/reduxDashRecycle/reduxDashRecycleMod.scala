package typings.reduxDashRecycle

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-recycle", JSImport.Namespace)
@js.native
object reduxDashRecycleMod extends js.Object {
  def default[A](reducer: Reducer[A, AnyAction], actions: js.Array[String]): Reducer[A, AnyAction] = js.native
  def default[A](reducer: Reducer[A, AnyAction], actions: js.Array[String], initialState: A): Reducer[A, AnyAction] = js.native
  def default[A](reducer: Reducer[A, AnyAction], actions: js.Array[String], initialState: Reducer[A, AnyAction]): Reducer[A, AnyAction] = js.native
}

