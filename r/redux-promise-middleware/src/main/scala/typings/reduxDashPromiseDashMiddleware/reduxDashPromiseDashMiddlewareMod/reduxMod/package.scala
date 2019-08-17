package typings.reduxDashPromiseDashMiddleware.reduxDashPromiseDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxMod {
  import typings.reduxDashPromiseDashMiddleware.Anon_Type

  type Dispatch[S] = js.Function1[/* action */ PromiseAction[js.Any], js.Promise[Anon_Type[PromiseAction[js.Any]]]]
  type PayloadType[PA] = js.Any
}
