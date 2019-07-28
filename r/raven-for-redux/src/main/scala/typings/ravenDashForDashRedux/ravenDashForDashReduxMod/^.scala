package typings.ravenDashForDashRedux.ravenDashForDashReduxMod

import typings.ravenDashJs.ravenDashJsMod.RavenStatic
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raven-for-redux", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(raven: RavenStatic): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(raven: RavenStatic, options: RavenMiddlewareOptions[_]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

