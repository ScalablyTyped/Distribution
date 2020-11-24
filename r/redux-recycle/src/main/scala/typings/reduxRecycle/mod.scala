package typings.reduxRecycle

import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-recycle", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default[A](reducer: Reducer[A, AnyAction], actions: js.Array[String]): Reducer[A, AnyAction] = js.native
  def default[A](reducer: Reducer[A, AnyAction], actions: js.Array[String], initialState: A): Reducer[A, AnyAction] = js.native
  def default[A](reducer: Reducer[A, AnyAction], actions: js.Array[String], initialState: Reducer[A, AnyAction]): Reducer[A, AnyAction] = js.native
}
