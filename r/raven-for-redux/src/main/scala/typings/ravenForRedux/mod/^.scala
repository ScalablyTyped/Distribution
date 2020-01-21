package typings.ravenForRedux.mod

import typings.ravenJs.mod.RavenStatic
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raven-for-redux", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(raven: RavenStatic): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(raven: RavenStatic, options: RavenMiddlewareOptions[_]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

