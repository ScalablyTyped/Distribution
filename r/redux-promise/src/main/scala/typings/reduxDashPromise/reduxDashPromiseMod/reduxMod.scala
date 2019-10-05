package typings.reduxDashPromise.reduxDashPromiseMod

import typings.reduxDashPromise.reduxDashPromiseMod.reduxMod.Dispatch
import typings.reduxDashPromise.reduxDashPromiseMod.reduxMod.PromiseAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("redux", JSImport.Namespace)
@js.native
object reduxMod extends js.Object {
  @js.native
  trait Dispatch[S] extends js.Object {
    def apply[R](asyncAction: PromiseAction[S]): R = js.native
  }
  
  type PromiseAction[S] = js.Function2[/* dispatch */ Dispatch[S], /* getState */ js.UndefOr[js.Function0[S]], js.Any]
}

