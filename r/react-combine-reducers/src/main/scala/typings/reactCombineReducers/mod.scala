package typings.reactCombineReducers

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Reducer
import typings.react.mod.ReducerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[R /* <: Reducer[js.Any, js.Any] */](
    reducers: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof react.react.ReducerState<R> ]: [react.react.Reducer<react.react.ReducerState<R>[K], any>, react.react.ReducerState<R>[K]]}
    */ typings.reactCombineReducers.reactCombineReducersStrings.^ & TopLevel[js.Any]
  ): js.Tuple2[R, ReducerState[R]] = ^.asInstanceOf[js.Dynamic].apply(reducers.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[R, ReducerState[R]]]
  
  @JSImport("react-combine-reducers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
