package typings.reduxRecycle

import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-recycle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A](reducer: Reducer[A, AnyAction], actions: js.Array[String]): Reducer[A, AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducer.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[Reducer[A, AnyAction]]
  inline def default[A](reducer: Reducer[A, AnyAction], actions: js.Array[String], initialState: A): Reducer[A, AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducer.asInstanceOf[js.Any], actions.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[Reducer[A, AnyAction]]
  inline def default[A](reducer: Reducer[A, AnyAction], actions: js.Array[String], initialState: Reducer[A, AnyAction]): Reducer[A, AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducer.asInstanceOf[js.Any], actions.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[Reducer[A, AnyAction]]
}
