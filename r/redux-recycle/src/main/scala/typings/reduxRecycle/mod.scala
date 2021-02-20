package typings.reduxRecycle

import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-recycle", JSImport.Default)
  @js.native
  def default[A](reducer: Reducer[A, AnyAction], actions: js.Array[String]): Reducer[A, AnyAction] = js.native
  @JSImport("redux-recycle", JSImport.Default)
  @js.native
  def default[A](reducer: Reducer[A, AnyAction], actions: js.Array[String], initialState: A): Reducer[A, AnyAction] = js.native
  @JSImport("redux-recycle", JSImport.Default)
  @js.native
  def default[A](reducer: Reducer[A, AnyAction], actions: js.Array[String], initialState: Reducer[A, AnyAction]): Reducer[A, AnyAction] = js.native
}
