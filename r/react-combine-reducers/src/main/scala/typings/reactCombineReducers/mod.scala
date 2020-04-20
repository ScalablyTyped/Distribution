package typings.reactCombineReducers

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Reducer
import typings.react.mod.ReducerState
import typings.reactCombineReducers.reactCombineReducersStrings.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-combine-reducers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[R /* <: Reducer[_, _] */](
    reducers: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof react.react.ReducerState<R> ]: [react.react.Reducer<react.react.ReducerState<R>[K], any>, react.react.ReducerState<R>[K]]}
    */ ^  with TopLevel[js.Any]
  ): js.Tuple2[R, ReducerState[R]] = js.native
}

