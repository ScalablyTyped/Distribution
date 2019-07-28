package typings.reduxDashPromiseDashMiddleware.reduxDashPromiseDashMiddlewareMod

import typings.reduxDashPromiseDashMiddleware.Anon_Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxMod {
  type Dispatch[S] = js.Function1[/* action */ PromiseAction[js.Any], js.Promise[Anon_Type[PromiseAction[js.Any]]]]
  type PayloadType[PA] = js.Any
}
