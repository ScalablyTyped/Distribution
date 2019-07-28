package typings.reduxDashInjectableDashStore.reduxDashInjectableDashStoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import typings.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectableStore[S] extends Store[S, AnyAction] {
  def clearReducers(): Unit = js.native
  def inject(namespace: String, reducer: Reducer[_, AnyAction]): Unit = js.native
  def injectAll(reducers: StringDictionary[Reducer[_, AnyAction]]): Unit = js.native
}

