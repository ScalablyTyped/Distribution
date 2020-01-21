package typings.reduxDoghouse.mod

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-doghouse", "scopeReducers")
@js.native
object scopeReducers extends js.Object {
  def apply(): Reducer[_, AnyAction] = js.native
  def apply(reducers: StringDictionary[Reducer[_, AnyAction]]): Reducer[_, AnyAction] = js.native
}

