package typings.reduxDashMockDashStore

import typings.redux.reduxMod.AnyAction
import typings.reduxDashMockDashStore.Anon_Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashMockDashStoreMod {
  type MockGetState[S] = js.Function1[/* actions */ js.Array[AnyAction], S]
  type MockStoreCreator[S, DispatchExts] = js.Function1[/* state */ js.UndefOr[S | MockGetState[S]], MockStoreEnhanced[S, DispatchExts]]
  type MockStoreEnhanced[S, DispatchExts] = (MockStore[S, AnyAction]) with Anon_Dispatch[DispatchExts]
}
