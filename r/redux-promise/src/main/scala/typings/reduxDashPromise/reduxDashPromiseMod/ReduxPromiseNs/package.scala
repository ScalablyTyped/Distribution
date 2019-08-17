package typings.reduxDashPromise.reduxDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReduxPromiseNs {
  import typings.redux.reduxMod.AnyAction
  import typings.redux.reduxMod.Dispatch
  import typings.redux.reduxMod.Middleware

  type Promise = Middleware[js.Object, js.Any, Dispatch[AnyAction]]
}
