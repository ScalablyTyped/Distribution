package typings.reduxSagaRoutines.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-saga-routines", "bindPromiseCreators")
@js.native
object bindPromiseCreators extends js.Object {
  def apply(promiseCreators: NumberDictionary[PromiseCreator[js.Object]], dispatch: Dispatch[AnyAction]): NumberDictionary[BoundPromiseCreator[js.Object]] = js.native
  def apply(promiseCreators: StringDictionary[PromiseCreator[js.Object]], dispatch: Dispatch[AnyAction]): StringDictionary[BoundPromiseCreator[js.Object]] = js.native
  def apply[TPayload](promiseCreator: PromiseCreator[TPayload], dispatch: Dispatch[AnyAction]): BoundPromiseCreator[TPayload] = js.native
}

