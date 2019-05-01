package typings
package reduxDashMockDashStoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashMockDashStoreMod {
  type MockGetState[S] = js.Function1[/* actions */ js.Array[reduxLib.reduxMod.AnyAction], S]
  type MockStoreCreator[S, DispatchExts] = js.Function1[/* state */ js.UndefOr[S | MockGetState[S]], MockStoreEnhanced[S, DispatchExts]]
  type MockStoreEnhanced[S, DispatchExts] = (MockStore[S, reduxLib.reduxMod.AnyAction]) with reduxDashMockDashStoreLib.Anon_Dispatch[DispatchExts]
}
