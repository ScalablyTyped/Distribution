package typings
package reduxDashMockDashStoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashMockDashStoreMod {
  type MockStoreCreator[S, DispatchExts] = js.Function1[/* state */ js.UndefOr[S], MockStoreEnhanced[S, DispatchExts]]
  type MockStoreEnhanced[S, DispatchExts] = (MockStore[S, reduxLib.reduxMod.AnyAction]) with reduxDashMockDashStoreLib.Anon_Dispatch[DispatchExts]
}
