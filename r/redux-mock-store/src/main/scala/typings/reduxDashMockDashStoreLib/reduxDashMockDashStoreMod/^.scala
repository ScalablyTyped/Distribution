package typings
package reduxDashMockDashStoreLib.reduxDashMockDashStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-mock-store", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Create Mock Store returns a function that will create a mock store from a state
    * with the same set of set of middleware applied.
    *
    * @param middlewares The list of middleware to be applied.
    * @template S The type of state to be held by the store.
    * @template DispatchExts The additional Dispatch signatures for the middlewares applied.
    */
  def default[S, DispatchExts](): MockStoreCreator[S, DispatchExts] = js.native
  def default[S, DispatchExts](
    middlewares: js.Array[
      reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]]
    ]
  ): MockStoreCreator[S, DispatchExts] = js.native
}

