package typings.reactCombineReducers

import typings.react.mod.Reducer
import typings.react.mod.ReducerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[R /* <: Reducer[Any, Any] */](
    reducers: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof react.react.ReducerState<R> ]: [react.react.Reducer<react.react.ReducerState<R>[K], any>, react.react.ReducerState<R>[K]]} */ js.Any
  ): js.Tuple2[R, ReducerState[R]] = ^.asInstanceOf[js.Dynamic].apply(reducers.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[R, ReducerState[R]]]
  
  @JSImport("react-combine-reducers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
