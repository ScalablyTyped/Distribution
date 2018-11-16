package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  @JSName("enhancer")
  var enhancer_Original: reduxLib.reduxMod.StoreEnhancer[Location, js.Object] = js.native
  @JSName("middleware")
  var middleware_Original: reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
  @JSName("reducer")
  var reducer_Original: reduxLib.reduxMod.Reducer[Location, reduxLib.reduxMod.AnyAction] = js.native
  def enhancer(next: reduxLib.reduxMod.StoreEnhancerStoreCreator[js.Object, js.Object]): reduxLib.reduxMod.StoreEnhancerStoreCreator[Location, js.Object] = js.native
  def middleware(api: reduxLib.reduxMod.MiddlewareAPI[reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction], _]): js.Function1[
    /* next */ reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction], 
    js.Function1[/* action */ _, _]
  ] = js.native
  def reducer(state: js.UndefOr[scala.Nothing], action: reduxLib.reduxMod.AnyAction): Location = js.native
  def reducer(state: Location, action: reduxLib.reduxMod.AnyAction): Location = js.native
}

